package com.example.arbaz.expediaexmple.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.adapter.PaymentTypeAdapter;
import com.example.arbaz.expediaexmple.api.Api;
import com.example.arbaz.expediaexmple.api.ApiFunctions;
import com.example.arbaz.expediaexmple.global.Constants;
import com.example.arbaz.expediaexmple.model.FinalAddressInfo;
import com.example.arbaz.expediaexmple.model.FinalReservationInfo;
import com.example.arbaz.expediaexmple.model.FinalRoomGroup;
import com.example.arbaz.expediaexmple.model.HotelItineraryResponse;
import com.example.arbaz.expediaexmple.model.HotelRoomReservationResponse;
import com.example.arbaz.expediaexmple.model.HotelRoomResponse;
import com.example.arbaz.expediaexmple.model.Itinerary;
import com.example.arbaz.expediaexmple.model.PaymentTypeItem;
import com.example.arbaz.expediaexmple.model.Room;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class RoomlBookActivity extends AppCompatActivity implements Serializable, OnApiCallListener {
    RecyclerView rv_payment_type;
    LinearLayoutManager mLayoutManager1;
    PaymentTypeAdapter paymentTypeAdapter;
    ArrayList<PaymentTypeItem> paymentTypeItemArrayList = new ArrayList<>();
    Bundle bRoomDetails;
    HotelRoomResponse hotelRoomResponse;
    FinalRoomGroup finalRoomGroup;
    FinalReservationInfo finalReservationInfo;
    FinalAddressInfo finalAddressInfo;
    Button btn_reservation, btn_itinerary, btn_cancel_itinerary, btn_roomimages;
    ApiFunctions apiFunctions;
    long hotelId;
    String checkInDate;
    String checkOutDate;
    String supplierType;
    String rateKey;
    int roomTypeCode;
    int rateCode;
    String chargeableRate;
    String bedType;
    String smokingPreference;
    ArrayList<Room> roomArrayList = new ArrayList<>();
    Room room;
    Gson gson = new Gson();
    String email = "mas@gmail.com";
    String room1BedTypeId = "14";
    HotelRoomReservationResponse hotelRoomReservationResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_book);

        btn_reservation = (Button) findViewById(R.id.btn_reservation);
        btn_itinerary = (Button) findViewById(R.id.btn_itinerary);
        btn_cancel_itinerary = (Button) findViewById(R.id.btn_cancel_itinerary);
        btn_roomimages = (Button) findViewById(R.id.btn_roomimages);


        apiFunctions = new ApiFunctions(this, this);
        try {
            bRoomDetails = new Bundle(getIntent().getExtras());
            hotelRoomResponse = (HotelRoomResponse) bRoomDetails.get("HotelRoomDetails");
            Log.e("ParticularRoom Response", String.valueOf(hotelRoomResponse));

            hotelId = (long) bRoomDetails.get("HotelId");
            checkInDate = (String) bRoomDetails.get("HotelRoomCheckInData");
            checkOutDate = (String) bRoomDetails.get("HotelRoomCheckOutData");
            supplierType = Constants.supplierType;

            rateKey = hotelRoomResponse.getRateInfos().getRateInfo().getRoomGroup().getRoom().getRateKey();
            roomTypeCode = hotelRoomResponse.getRoomTypeCode();
            rateCode = hotelRoomResponse.getRateCode();
            chargeableRate = "7241.43";

            bedType = "14";
            smokingPreference = hotelRoomResponse.getSmokingPreferences();
            room = new Room(Constants.numberOfAdult, "Mas", "Andy", "14", "NS");
            roomArrayList.add(room);
            finalRoomGroup = new FinalRoomGroup(roomArrayList);


            btn_reservation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    apiFunctions.hotelRoomReservation(Api.HotelMainUrl + Api.ActionHotelReservation, Constants.cid, Constants.minorRev,
                            Constants.apiKey, Constants.locale, Constants.currencyCode,
                            Constants.sig, hotelId, checkInDate, checkOutDate, Constants.supplierType, rateKey, roomTypeCode,
                            rateCode, chargeableRate, "1,2", "Mas Tester", "Andy Tester", room1BedTypeId, "NS", email, "Mas Card  Tester", "Andy Card Tester", "99887455", "98989898",
                            "CA", "5105105105105100", "555", "11", "2018", "AddressTester 123654", "CityTester", "WA", "US", "98004");

                }

            });
            btn_roomimages.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    apiFunctions.hotelRoomImages(Api.HotelMainUrl + Api.ActionHotelImages, Constants.cid, Constants.minorRev,
                            Constants.apiKey, Constants.locale, Constants.currencyCode,
                            Constants.sig, hotelId);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFailure(String message) {

        Log.e("Reservation  Failure", message);

    }

    @Override
    public void onSuccess(final int responseCode, String responseString, String url) {
        try {
            final String roomEmail = email;
            final int roomitineraryId;
            final int confirmationNumbers;
            String roomBedTypeId = room1BedTypeId;
            if (responseCode == Api.ResponseOk) {
                if (url.equals(Api.HotelMainUrl + Api.ActionHotelReservation)) {
                    Log.e("Reservation Success", responseString);

                    try {
                        // btn_itinerary.setVisibility(View.VISIBLE);
                        JSONObject jsonObject = new JSONObject(responseString);
                        JSONObject getFirstObj = jsonObject.getJSONObject("HotelRoomReservationResponse");
                        hotelRoomReservationResponse = gson.fromJson(getFirstObj.toString(), HotelRoomReservationResponse.class);
                        roomitineraryId = hotelRoomReservationResponse.getItineraryId();
                        confirmationNumbers = hotelRoomReservationResponse.getConfirmationNumbers();
                        btn_itinerary.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                apiFunctions.hotelRoomItineary(Api.HotelMainUrl + Api.ActionHotelRoomItinerary, Constants.cid, Constants.minorRev, Constants.apiKey, Constants.locale, Constants.currencyCode, Constants.sig, roomitineraryId, roomEmail);
                            }
                        });

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (url.equals(Api.HotelMainUrl + Api.ActionHotelRoomItinerary)) {
                    final int ItineraryId;
                    final int ConformationNo;
                    final String reason;
                    HotelItineraryResponse hotelItineraryResponse;
                    try {
                        Log.e("RoomItineary Success", responseString);
                        JSONObject jsonObject = new JSONObject(responseString);
                        JSONObject getHotelItineraryResponse = jsonObject.getJSONObject("HotelItineraryResponse");
                        hotelItineraryResponse = gson.fromJson(getHotelItineraryResponse.toString(), HotelItineraryResponse.class);

                        ItineraryId = hotelItineraryResponse.getItinerary().getItineraryId();
                        ConformationNo = hotelItineraryResponse.getItinerary().getHotelConfirmation().getConfirmationNumber();
                        reason = "Testing Reason";
                        //String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "
                        // &currencyCode=" + currencyCode + "&sig=" + sig + "&itineraryId=" + itineraryId + "&email=" +
                        // email+"&confirmationNumber="+confirmationNumber;
                        btn_cancel_itinerary.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                apiFunctions.hotelCancelRoomItineary(Api.HotelMainUrl + Api.ActionHotelRoomCancelItinerary, Constants.cid, Constants.minorRev, Constants.apiKey, Constants.locale, Constants.currencyCode, Constants.sig, ItineraryId, roomEmail, reason, ConformationNo);
                            }
                        });


                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                if (url.equals(Api.HotelMainUrl + Api.ActionHotelRoomCancelItinerary)) {
                    try {
                        Log.e("CancelItineary Success", responseString);
                        //  String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey="
                        // + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig +
                        // "&itineraryId=" + itineraryId + "&email=" + email+"&confirmationNumber="+confirmationNumber;

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                if (url.equals(Api.HotelMainUrl + Api.ActionHotelImages)) {
                    Log.e("Images ListSuccess",responseString);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
