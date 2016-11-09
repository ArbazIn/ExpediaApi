package com.example.arbaz.expediaexmple.adapter;

import android.content.Context;
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
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by arbaz on 7/11/16.
 */

public class PaymentTypeAdapter extends RecyclerView.Adapter<PaymentTypeAdapter.MyViewHolder> {

    ArrayList<PaymentTypeItem> paymentTypeItemArrayList;
    Context context;
    TextView tv_paymentType;

    public PaymentTypeAdapter(ArrayList<PaymentTypeItem> paymentTypeItemArrayList, Context context) {
        this.paymentTypeItemArrayList = paymentTypeItemArrayList;

        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, final int position) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_payment_type, parent, false);
        tv_paymentType= (TextView) itemView.findViewById(R.id.tv_paymentType);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final PaymentTypeItem paymentTypeItem;
        paymentTypeItem = paymentTypeItemArrayList.get(position);
        tv_paymentType.setText(paymentTypeItem.getName());
    }

    @Override
    public int getItemCount() {
        return paymentTypeItemArrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View view) {
            super(view);


        }
    }
}
