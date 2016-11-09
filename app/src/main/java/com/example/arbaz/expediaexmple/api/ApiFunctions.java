package com.example.arbaz.expediaexmple.api;

import android.content.Context;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.model.FinalAddressInfo;
import com.example.arbaz.expediaexmple.model.FinalReservationInfo;
import com.example.arbaz.expediaexmple.model.FinalRoomGroup;
import com.google.gson.Gson;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by arbaz on 7/11/16.
 */

public class ApiFunctions {
    public OkHttpClient client;
    public Context context;
    public OnApiCallListener acListener;
    public Gson gson;
    public final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    public ApiFunctions(Context context, OnApiCallListener acListener) {
        this.client = new OkHttpClient();
        this.context = context;
        this.acListener = acListener;
        this.gson = new Gson();

        try {
            client.setConnectTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            client.setWriteTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            client.setReadTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
        } catch (Exception e) {
        }

        File cacheDirectory = new File(context.getCacheDir(), "http");
        int cacheSize = 10 * 1024 * 1024;
        try {
            Cache cache = new Cache(cacheDirectory, cacheSize);
            client.setCache(cache);
        } catch (Exception e) {
            //Log.v("Exception" + e.getMessage());
        }
    }

    public void executeRequest(final String url, Request request) {

        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Request request, IOException e) {
                acListener.onFailure(e.getMessage());
            }

            @Override
            public void onResponse(Response response) throws IOException {
                int responseCode = response.code();
                String responseString = response.body().string();
                acListener.onSuccess(responseCode, responseString, url);

            }
        });
    }

    /*Api Function For  Hotel List*/
    public void hotelList(String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig, String arrivalDate, String departureDate, String room, String city, String stateProvinceCode, String countryCode) {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&arrivalDate=" + arrivalDate + "&departureDate=" + departureDate + "&room1=" + room + "&city=" + city + "&stateProvinceCode=" + stateProvinceCode + "&countryCode=" + countryCode;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Api Function For  Hotel Available*/
    public void hotelAvailable(
            String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig,
            long hotelId, String arrivalDate, String departureDate, boolean includeDetails, int numberOfAdults)

    {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&hotelId=" + hotelId + "&arrivalDate=" + arrivalDate + "&departureDate=" + departureDate + "&includeDetails=" + includeDetails + "&numberOfAdults=" + numberOfAdults;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Api Function For  Hotel Payment*/
    public void hotelPayment(String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig, long hotelId, String supplierType, String rateType) {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&hotelId=" + hotelId + "&supplierType=" + supplierType + "&rateType=" + rateType;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Api Function For  Hotel Room Reservation*/
    public void hotelRoomReservation(String url, String cid, String minorRev, String apiKey, String locale,
                                     String currencyCode, String sig, long hotelId, String arrivalDate, String departureDate,
                                     String supplierType, String rateKey, int roomTypeCode, int rateCode, String chargeableRate,
                                     FinalRoomGroup finalRoomGroup, FinalReservationInfo finalReservationInfo, FinalAddressInfo finalAddressInfo) {


        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale
                    + "&currencyCode=" + currencyCode + "&sig=" + sig + "" +
                    "&hotelId=" + hotelId + "&arrivalDate=" + arrivalDate + "&departureDate=" + departureDate + "&supplierType=" + supplierType +"&rateKey="+rateKey+"&roomTypeCode="+roomTypeCode+
                    "&rateCode="+rateCode+"&chargeableRate="+chargeableRate+"&RoomGroup="+finalRoomGroup+"&ReservationInfo="+finalReservationInfo+
                    "&AddressInfo="+finalAddressInfo;
                    ;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
