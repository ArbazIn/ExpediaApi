package com.example.arbaz.expediaexmple.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.api.Api;
import com.example.arbaz.expediaexmple.api.ApiFunctions;
import com.example.arbaz.expediaexmple.global.Constants;
import com.example.arbaz.expediaexmple.model.HotelRoomResponse;
import com.example.arbaz.expediaexmple.model.PaymentTypeItem;
import com.example.arbaz.expediaexmple.screens.RoomlBookActivity;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by arbaz on 7/11/16.
 */

public class AvailableRoomListAdapter extends RecyclerView.Adapter<AvailableRoomListAdapter.MyViewHolder> implements OnApiCallListener,Serializable {

    ArrayList<HotelRoomResponse> hotelRoomResponseArrayList;
    ArrayList<PaymentTypeItem> paymentTypeItemArrayList = new ArrayList<>();
    Context context;
    long hotelId;
    TextView tv_room_des;
    Button btn_room_paymentType, btn_room_checkIn;
    String checkInDate, checkOutDate;
    ApiFunctions apiFunctions;
    Gson gson = new Gson();

    public AvailableRoomListAdapter(ArrayList<HotelRoomResponse> hotelRoomResponseArrayList, long hotelId, String checkInDate, String checkOutDate, Context context) {
        this.hotelRoomResponseArrayList = hotelRoomResponseArrayList;
        this.hotelId = hotelId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, final int position) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_room_avai_row, parent, false);
        apiFunctions = new ApiFunctions(context, this);
        tv_room_des = (TextView) itemView.findViewById(R.id.tv_room_des);
        btn_room_paymentType = (Button) itemView.findViewById(R.id.btn_room_paymentType);
        btn_room_checkIn = (Button) itemView.findViewById(R.id.btn_room_checkIn);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final HotelRoomResponse hotelRoomResponse;
        hotelRoomResponse = hotelRoomResponseArrayList.get(position);
        btn_room_checkIn.setTag(hotelRoomResponse);
        try {

            tv_room_des.setText(hotelRoomResponse.getRoomTypeDescription());
            btn_room_paymentType.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    apiFunctions.hotelPayment(Api.HotelPaymentUrl, Constants.cid, Constants.minorRev,
                            Constants.apiKey, Constants.locale, Constants.currencyCode,
                            Constants.sig, hotelId, Constants.supplierType, Constants.rateType);
                }
            });
            btn_room_checkIn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    HotelRoomResponse hotelRoomResponse_data;
                    hotelRoomResponse_data= (HotelRoomResponse) v.getTag();
                    Intent iRoomDetails = new Intent(context, RoomlBookActivity.class);
                    iRoomDetails.putExtra("HotelRoomDetails", hotelRoomResponse_data);
                    iRoomDetails.putExtra("HotelId", hotelId);
                    iRoomDetails.putExtra("HotelRoomCheckInData", checkInDate);
                    iRoomDetails.putExtra("HotelRoomCheckOutData", checkOutDate);
                   iRoomDetails.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    v.getContext().startActivity(iRoomDetails);

                }
            });


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return hotelRoomResponseArrayList.size();
    }

    @Override
    public void onFailure(String message) {
        Log.e("Hotel Payment Failure", message);
    }

    @Override
    public void onSuccess(int responseCode, String responseString, String url) {
        Log.e("Hotel Payment Success", responseString);
        PaymentTypeItem paymentTypeItem;
        if (responseCode == Api.ResponseOk) {
            try {
                JSONObject jsonObject = new JSONObject(responseString);
                JSONObject getHotelPaymenttResponse = jsonObject.getJSONObject("HotelPaymentResponse");
                JSONArray jsonArray = getHotelPaymenttResponse.getJSONArray("PaymentType");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject getFirstObj = jsonArray.getJSONObject(i);
                    paymentTypeItem = gson.fromJson(getFirstObj.toString(), PaymentTypeItem.class);
                    paymentTypeItemArrayList.add(paymentTypeItem);

                    //payment response HERE///

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View view) {
            super(view);


        }
    }
}
