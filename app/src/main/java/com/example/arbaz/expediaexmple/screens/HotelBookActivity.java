package com.example.arbaz.expediaexmple.screens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.adapter.PaymentTypeAdapter;
import com.example.arbaz.expediaexmple.global.Constants;
import com.example.arbaz.expediaexmple.model.FinalAddressInfo;
import com.example.arbaz.expediaexmple.model.FinalReservationInfo;
import com.example.arbaz.expediaexmple.model.FinalRoomGroup;
import com.example.arbaz.expediaexmple.model.HotelRoomResponse;
import com.example.arbaz.expediaexmple.model.PaymentTypeItem;

import org.json.JSONObject;

import java.util.ArrayList;

public class HotelBookActivity extends AppCompatActivity {
    RecyclerView rv_payment_type;
    LinearLayoutManager mLayoutManager1;
    PaymentTypeAdapter paymentTypeAdapter;
    ArrayList<PaymentTypeItem> paymentTypeItemArrayList = new ArrayList<>();
    Bundle bRoomDetails;
    HotelRoomResponse hotelRoomResponse;
    FinalRoomGroup finalRoomGroup;
    FinalReservationInfo finalReservationInfo;
    FinalAddressInfo finalAddressInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_book);


        try {
            bRoomDetails = new Bundle(getIntent().getExtras());
            hotelRoomResponse = (HotelRoomResponse) bRoomDetails.get("HotelRoomDetails");
            Log.e("ParticularRoom Response", String.valueOf(hotelRoomResponse));

            long hotelId = (long) bRoomDetails.get("HotelId");
            String checkInDate = (String) bRoomDetails.get("HotelRoomCheckInData");
            String checkOutDate = (String) bRoomDetails.get("HotelRoomCheckOutData");
            String supplierType = Constants.supplierType;

            String rateKey = hotelRoomResponse.getRateInfos().getRateInfo().getRoomGroup().getRoom().getRateKey();
            int roomTypeCode = hotelRoomResponse.getRoomTypeCode();
            int rateCode = hotelRoomResponse.getRateCode();
            String chargeableRate = hotelRoomResponse.getRateInfos().getRateInfo().getChargeableRateInfo().getTotal();

            String bedType = hotelRoomResponse.getBedTypes().getBedType().getId();
            String smokingPreference = hotelRoomResponse.getSmokingPreferences();
            finalRoomGroup = new FinalRoomGroup(Constants.numberOfAdult, "Arbaz", "Shaikh", bedType, smokingPreference);

            finalReservationInfo = new FinalReservationInfo("mas@gmail.com", "Arbaz", "Shaikh", "1122334455", "CA", "123456789", "123", "11", "2016");

            //FinalAddressInfo(String address1, String city, String stateProvinceCode, String countryCode, String postalCode)
            finalAddressInfo = new FinalAddressInfo("TCC", "Seattle", "WA", "US", "98004");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
