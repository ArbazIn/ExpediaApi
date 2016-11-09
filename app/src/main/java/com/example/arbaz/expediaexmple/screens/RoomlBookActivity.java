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
import com.example.arbaz.expediaexmple.model.HotelRoomResponse;
import com.example.arbaz.expediaexmple.model.PaymentTypeItem;
import com.example.arbaz.expediaexmple.model.Room;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

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
    Button btn_reservation;
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
    ArrayList<Room> roomArrayList=new ArrayList<>();
    Room room;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_book);

        btn_reservation = (Button) findViewById(R.id.btn_reservation);

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
            //Constants.numberOfAdult, "Arbaz", "Shaikh", bedType, smokingPreference
            room=new Room(Constants.numberOfAdult,"Mas","Andy","14","NS");
            roomArrayList.add(room);
            finalRoomGroup = new FinalRoomGroup(roomArrayList);

        //    finalReservationInfo = new FinalReservationInfo("mas@gmail.com", "Mas", "Andy", "1122334455", "CA", "123456789", "123", "11", "2016");

            //FinalAddressInfo(String address1, String city, String stateProvinceCode, String countryCode, String postalCode)
        ///    finalAddressInfo = new FinalAddressInfo("TCC", "Seattle", "WA", "US", "98004");


            btn_reservation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /*
                    (String url, String cid, String minorRev, String apiKey, String locale,
                    String currencyCode, String sig, long hotelId, String arrivalDate, String departureDate,
                    String supplierType, String rateKey, int roomTypeCode, int rateCode, String chargeableRate,
                    String room1, String room1FirstName, String room1LastName, String room1BedTypeId,
                     String room1SmokingPreference,
                    String email, String firstName, String lastName, String homePhone, String workPhone,
                     String creditCardType, String creditCardNumbe,
                    String creditCardIdentifier, String creditCardExpirationMonth, String
                    creditCardExpirationYear, String address1,
                    String city, String stateProvinceCode, String countryCode, String postalCode) {

                    * */
                    apiFunctions.hotelRoomReservation(Api.HotelReservation, Constants.cid, Constants.minorRev,
                            Constants.apiKey, Constants.locale, Constants.currencyCode,
                            Constants.sig, hotelId, checkInDate, checkOutDate, Constants.supplierType, rateKey,roomTypeCode,
                            rateCode, chargeableRate,"1,2","Mas Tester","Andy Tester","14","NS","mas@gmail.com","Mas Card  Tester","Andy Card Tester","99887455","98989898",
                            "CA","5105105105105100","555","11","2018","AddressTester 123654","CityTester","WA","US","98004");

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onFailure(String message) {
        Log.e("Reservation Failure", message);

    }

    @Override
    public void onSuccess(int responseCode, String responseString, String url) {
       try {

           Log.e("Reservation Success", responseString);
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
