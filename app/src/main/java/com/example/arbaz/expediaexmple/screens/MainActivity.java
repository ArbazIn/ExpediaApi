package com.example.arbaz.expediaexmple.screens;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.R;
import com.example.arbaz.expediaexmple.adapter.HotelListAdapter;
import com.example.arbaz.expediaexmple.api.Api;
import com.example.arbaz.expediaexmple.api.ApiFunctions;
import com.example.arbaz.expediaexmple.global.Constants;
import com.example.arbaz.expediaexmple.model.HotelSummaryItem;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnApiCallListener {
    EditText et_rooms, et_city, et_state, et_country, et_check_in_date, et_check_out_date, et_adults, et_childs;
    Button btn_submit;
    RecyclerView rv_hotelList;
    LinearLayoutManager mLayoutManager1;


    //for date picker
    private SimpleDateFormat dateFormatter;
    private DatePickerDialog checkInDatePickerDialog;
    private DatePickerDialog checkOutDatePickerDialog;
    Calendar newCalendar = Calendar.getInstance();

    ApiFunctions apiFunctions;

    HotelSummaryItem hotelSummaryItem;

    HotelListAdapter hotelListAdapter;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateFormatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);

        bindHere();

        //for Api Call
        apiFunctions = new ApiFunctions(this, this);


        setDateTimeField();
    }

    public void bindHere() {

        et_rooms = (EditText) findViewById(R.id.et_rooms);
        String adults= String.valueOf(Constants.numberOfAdult);
        et_rooms.setText(adults);

        et_city = (EditText) findViewById(R.id.et_city);
        et_city.setText("Seattle");
        et_state = (EditText) findViewById(R.id.et_state);
        et_state.setText("WA");
        et_country = (EditText) findViewById(R.id.et_country);
        et_country.setText("US");

        et_check_in_date = (EditText) findViewById(R.id.et_check_in_date);
        et_check_in_date.setInputType(InputType.TYPE_NULL);


        et_check_out_date = (EditText) findViewById(R.id.et_check_out_date);
        et_check_out_date.setInputType(InputType.TYPE_NULL);

        et_adults = (EditText) findViewById(R.id.et_adults);
        et_childs = (EditText) findViewById(R.id.et_childs);


        btn_submit = (Button) findViewById(R.id.btn_submit);

        rv_hotelList= (RecyclerView) findViewById(R.id.rv_hotelList);
        mLayoutManager1 = new LinearLayoutManager(this);
        rv_hotelList.setHasFixedSize(true);
        rv_hotelList.setLayoutManager(mLayoutManager1);


        et_check_in_date.setOnClickListener(this);
        et_check_out_date.setOnClickListener(this);
        btn_submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_submit:

                String room = et_rooms.getText().toString();
                String city = et_city.getText().toString();
                String state = et_state.getText().toString();
                String country = et_country.getText().toString();
                String checkInDate = et_check_in_date.getText().toString();
                String checkOutDate = et_check_out_date.getText().toString();
                String adults = et_adults.getText().toString();
                String childs = et_childs.getText().toString();


                apiFunctions.hotelList(Api.HotelListUrl, Constants.cid, Constants.minorRev,
                        Constants.apiKey, Constants.locale, Constants.currencyCode,
                        Constants.sig, checkInDate, checkOutDate, room, city, state, country);
                break;
            case R.id.et_check_in_date:
                checkInDatePickerDialog.show();
                break;
            case R.id.et_check_out_date:
                checkOutDatePickerDialog.show();
                break;
            default:
                break;
        }
    }

    //for Date picker Dialog
    private void setDateTimeField() {

        checkInDatePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                et_check_in_date.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        checkOutDatePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                et_check_out_date.setText(dateFormatter.format(newDate.getTime()));
            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

    }


    @Override
    public void onFailure(String message) {

        Log.e("Hotel Failure", message);
    }

    @Override
    public void onSuccess(final int responseCode, String responseString, String url) {
        Log.e("Hotel Success", responseString);

        Gson gson = new Gson();
        final ArrayList<HotelSummaryItem> hotelListArrayList = new ArrayList<>();

        if (responseCode == Api.ResponseOk) {

            try {
                JSONObject jsonObject = new JSONObject(responseString);
                JSONObject getHotelResponse = jsonObject.getJSONObject("HotelListResponse");
                JSONObject getHotels = getHotelResponse.getJSONObject("HotelList");
                JSONArray jsonArray = getHotels.getJSONArray("HotelSummary");
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject getFirstObj = jsonArray.getJSONObject(i);
                    hotelSummaryItem = gson.fromJson(getFirstObj.toString(), HotelSummaryItem.class);
                    hotelListArrayList.add(hotelSummaryItem);
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (responseCode == Api.ResponseOk) {
                    hotelListAdapter = new HotelListAdapter(hotelListArrayList,et_check_in_date.getText().toString(),et_check_out_date.getText().toString(),MainActivity.this);
                    rv_hotelList.setAdapter(hotelListAdapter);



                }

            }
        });
    }
}
