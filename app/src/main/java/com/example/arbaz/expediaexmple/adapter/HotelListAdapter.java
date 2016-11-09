package com.example.arbaz.expediaexmple.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.model.HotelSummaryItem;
import com.example.arbaz.expediaexmple.screens.HotelDetailACtivity;

import java.util.ArrayList;

/**
 * Created by arbaz on 7/11/16.
 */

public class HotelListAdapter extends RecyclerView.Adapter<HotelListAdapter.MyViewHolder> {

    ArrayList<HotelSummaryItem> hotelListArrayList;
    Context context;
    TextView tv_hotel_name, tv_city_name, tv_cc_name;
    LinearLayout ll_hotelList;
    String checkInDate, checkOutDate;


    public HotelListAdapter(ArrayList<HotelSummaryItem> hotelListArrayList, String checkInDate, String checkOutDate, Context context) {
        this.hotelListArrayList = hotelListArrayList;
        this.checkInDate=checkInDate;
        this.checkOutDate=checkOutDate;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, final int position) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_hotel_list_row, parent, false);

        ll_hotelList = (LinearLayout) itemView.findViewById(R.id.ll_hotelList);
        tv_hotel_name = (TextView) itemView.findViewById(R.id.tv_hotel_name);
        tv_city_name = (TextView) itemView.findViewById(R.id.tv_city_name);
        tv_cc_name = (TextView) itemView.findViewById(R.id.tv_cc_name);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final HotelSummaryItem hotelSummaryItem;
        hotelSummaryItem = hotelListArrayList.get(position);
        try {
            tv_hotel_name.setText(hotelSummaryItem.getName());
            tv_city_name.setText(hotelSummaryItem.getCity());
            tv_cc_name.setText(hotelSummaryItem.getCountryCode());
            ll_hotelList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent iHotelInfo = new Intent(context, HotelDetailACtivity.class);
                    iHotelInfo.putExtra("HotelID", hotelSummaryItem);
                    iHotelInfo.putExtra("CheckInDate", checkInDate);
                    iHotelInfo.putExtra("CheckOutDate", checkOutDate);
                    context.startActivity(iHotelInfo);

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return hotelListArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        public MyViewHolder(View view) {
            super(view);


        }
    }
}
