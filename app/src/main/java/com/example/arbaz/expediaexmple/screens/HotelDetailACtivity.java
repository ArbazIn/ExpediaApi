package com.example.arbaz.expediaexmple.screens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.adapter.AvailableRoomListAdapter;
import com.example.arbaz.expediaexmple.api.Api;
import com.example.arbaz.expediaexmple.api.ApiFunctions;
import com.example.arbaz.expediaexmple.global.Constants;
import com.example.arbaz.expediaexmple.model.HotelRoomResponse;
import com.example.arbaz.expediaexmple.model.HotelSummaryItem;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by arbaz on 7/11/16.
 */
public class HotelDetailACtivity extends AppCompatActivity implements OnApiCallListener,Serializable {
    Bundle bRoom;
    HotelSummaryItem hotelSummaryItem;
    TextView tv_b_hotel_name, tv_b_hotel_rate, tv_b_hotel_hp, tv_b_hotel_lp;
    Button btn_book;
    LinearLayout ll_availability,ll_paymentType;
    RecyclerView rv_room_avai,rv_room_paymentType;
    LinearLayoutManager mLayoutManager1;
    ApiFunctions apiFunctions;
    String checkInDate, checkOutDate;
    Gson gson = new Gson();
    ArrayList<HotelRoomResponse>  hotelRoomResponseArrayList = new ArrayList<>();
    AvailableRoomListAdapter availableRoomListAdapter;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        apiFunctions = new ApiFunctions(this, this);

        tv_b_hotel_name = (TextView) findViewById(R.id.tv_b_hotel_name);
        tv_b_hotel_rate = (TextView) findViewById(R.id.tv_b_hotel_rate);
        tv_b_hotel_hp = (TextView) findViewById(R.id.tv_b_hotel_hp);
        tv_b_hotel_lp = (TextView) findViewById(R.id.tv_b_hotel_lp);

        ll_availability = (LinearLayout) findViewById(R.id.ll_availability);
        rv_room_avai = (RecyclerView) findViewById(R.id.rv_room_avai);


        mLayoutManager1 = new LinearLayoutManager(this);
        rv_room_avai.setHasFixedSize(true);
        rv_room_avai.setLayoutManager(mLayoutManager1);


        btn_book = (Button) findViewById(R.id.btn_book);


        bRoom = new Bundle(getIntent().getExtras());
        hotelSummaryItem = (HotelSummaryItem) bRoom.get("HotelID");
        checkInDate = (String) bRoom.get("CheckInDate");
        checkOutDate = (String) bRoom.get("CheckOutDate");
        if (hotelSummaryItem != null) {
            Log.e("Hotel Id", String.valueOf(hotelSummaryItem.getHotelId()));

            try {
                String hotel_name = hotelSummaryItem.getName();
                String rate_txt = String.valueOf(hotelSummaryItem.getHotelRating());
                String hrate_txt = String.valueOf(hotelSummaryItem.getHighRate());
                String lrate_txt = String.valueOf(hotelSummaryItem.getLowRate());


                tv_b_hotel_name.setText(hotel_name);
                tv_b_hotel_rate.setText(rate_txt);
                tv_b_hotel_hp.setText(hrate_txt);
                tv_b_hotel_lp.setText(lrate_txt);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        btn_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isHotelDetails = true;


                apiFunctions.hotelAvailable(Api.HotelAvaiUrl, Constants.cid, Constants.minorRev,
                        Constants.apiKey, Constants.locale, Constants.currencyCode,
                        Constants.sig, hotelSummaryItem.getHotelId(), checkInDate, checkOutDate, isHotelDetails, Constants.numberOfAdult);

            }
        });

    }

    @Override
    public void onFailure(String message) {
        Log.e("Room Book Failure", message);
    }

    @Override
    public void onSuccess(final int responseCode, String responseString, String url) {
        if (responseCode == Api.ResponseOk) {
            HotelRoomResponse  hotelRoomResponse;
            Log.e("Room Book Success", responseString);
            try {
                JSONObject jsonObject = new JSONObject(responseString);
                JSONObject getRoomAvai = jsonObject.getJSONObject("HotelRoomAvailabilityResponse");
                JSONArray getRoomResponse = getRoomAvai.getJSONArray("HotelRoomResponse");

                for (int i = 0; i < getRoomResponse.length(); i++) {
                    JSONObject getFirstObj = getRoomResponse.getJSONObject(i);
                    hotelRoomResponse = gson.fromJson(getFirstObj.toString(), HotelRoomResponse.class);
                    hotelRoomResponseArrayList.add(hotelRoomResponse);

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (responseCode == Api.ResponseOk) {
                    btn_book.setClickable(false);
                    ll_availability.setVisibility(View.VISIBLE);

                    availableRoomListAdapter=new AvailableRoomListAdapter(hotelRoomResponseArrayList,hotelSummaryItem.getHotelId(),checkInDate,checkOutDate,getApplicationContext());
                    rv_room_avai.setAdapter(availableRoomListAdapter);



                }
            }
        });
    }
}
