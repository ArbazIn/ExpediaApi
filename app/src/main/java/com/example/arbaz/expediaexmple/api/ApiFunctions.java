package com.example.arbaz.expediaexmple.api;

import android.content.Context;

import com.example.arbaz.expediaexmple.Listner.OnApiCallListener;
import com.example.arbaz.expediaexmple.model.FinalAddressInfo;
import com.example.arbaz.expediaexmple.model.FinalReservationInfo;
import com.example.arbaz.expediaexmple.model.FinalRoomGroup;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.OkHttpClient.Builder;


/**
 * Created by arbaz on 7/11/16.
 */

public class ApiFunctions {
    public OkHttpClient client;
    public Context context;
    public OnApiCallListener acListener;
    public Gson gson;
    public final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    public Builder builder = new Builder();

    public ApiFunctions(Context context, OnApiCallListener acListener) {
        this.client = new OkHttpClient();
        this.context = context;
        this.acListener = acListener;
        this.gson = new Gson();

        try {
            /*client.setConnectTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            client.setWriteTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            client.setReadTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);*/
            builder.connectTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            builder.writeTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
            builder.readTimeout(Api.ConnectionTimeout, TimeUnit.SECONDS);
        } catch (Exception e) {
        }

        File cacheDirectory = new File(context.getCacheDir(), "http");
        int cacheSize = 10 * 1024 * 1024;
        try {
            Cache cache = new Cache(cacheDirectory, cacheSize);
            builder.cache(cache);
            client=builder.build();
        } catch (Exception e) {
            //Log.v("Exception" + e.getMessage());
        }
    }

    public void executeRequest(final String url, Request request) {

        client.newCall(request).enqueue(new Callback() {

            @Override
            public void onFailure(Call call, IOException e) {
                acListener.onFailure(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
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
                                     String room1, String room1FirstName, String room1LastName, String room1BedTypeId, String room1SmokingPreference,
                                     String email, String firstName, String lastName, String homePhone, String workPhone, String creditCardType, String creditCardNumber,
                                     String creditCardIdentifier, String creditCardExpirationMonth, String creditCardExpirationYear, String address1,
                                     String city, String stateProvinceCode, String countryCode, String postalCode) {


        try {
           /* String getUrl =
                    url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale +
                    "&currencyCode=" + currencyCode + "&sig=" + sig + "" +
                    "&hotelId=" + hotelId + "&arrivalDate=" + arrivalDate + "&departureDate=" + departureDate +
                    "&supplierType=" + supplierType + "&rateKey=" + rateKey + "&roomTypeCode=" + roomTypeCode +
                    "&rateCode=" + rateCode + "&chargeableRate=" + chargeableRate + "&RoomGroup=" + finalRoomGroup +
                    "&ReservationInfo=" + finalReservationInfo +
                    "&AddressInfo=" + finalAddressInfo;*/


            RequestBody reservationData = new FormBody.Builder()
                    .add("cid", cid)
                    .add("minorRev", minorRev)
                    .add("apikey", apiKey)
                    .add("locale", locale)
                    .add("currencyCode", currencyCode)
                    .add("sig", sig)
                    .add("hotelId", String.valueOf(hotelId))
                    .add("arrivalDate", arrivalDate)
                    .add("departureDate", departureDate)
                    .add("supplierType", supplierType)
                    .add("rateKey", rateKey)
                    .add("roomTypeCode", String.valueOf(roomTypeCode))
                    .add("rateCode", String.valueOf(rateCode))
                    .add("chargeableRate", chargeableRate)
                    .add("room1", room1)
                    .add("room1FirstName", room1FirstName)
                    .add("room1LastName", room1LastName)
                    .add("room1BedTypeId", room1BedTypeId)
                    .add("room1SmokingPreference", room1SmokingPreference)
                    .add("email", email)
                    .add("firstName", firstName)
                    .add("lastName", lastName)
                    .add("homePhone", homePhone)
                    .add("workPhone", workPhone)
                    .add("creditCardType", creditCardType)
                    .add("creditCardNumber", creditCardNumber)
                    .add("creditCardIdentifier", creditCardIdentifier)
                    .add("creditCardExpirationMonth", creditCardExpirationMonth)
                    .add("creditCardExpirationYear", creditCardExpirationYear)
                    .add("address1", address1)
                    .add("city", city)
                    .add("stateProvinceCode", stateProvinceCode)
                    .add("countryCode", countryCode)
                    .add("postalCode", postalCode)
                    .build();
                    /*.add("RoomGroup","finalRoomGroup")
                    .add("ReservationInfo","finalReservationInfo")
                    .add("AddressInfo","finalAddressInfo")*/
            Request request = new Request.Builder().url(url).post(reservationData).build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*Api Function For  Hotel BookRoom Itinerary  */
    public void hotelRoomItineary(String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig, int itineraryId, String email) {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&itineraryId=" + itineraryId + "&email=" + email;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Api Function For  Hotel Cancel BookRoom Itinerary  */
    public void hotelCancelRoomItineary(String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig, int itineraryId, String email, String reason, int confirmationNumber) {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&itineraryId=" + itineraryId + "&email=" + email + "&reason=" + reason + "&confirmationNumber=" + confirmationNumber;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*Api Function For  Hotel Images*/
    public void hotelRoomImages(String url, String cid, String minorRev, String apiKey, String locale, String currencyCode, String sig, long hotelId) {

        try {
            String getUrl = url + "&cid=" + cid + "&minorRev=" + minorRev + "&apikey=" + apiKey + "&locale=" + locale + "&currencyCode=" + currencyCode + "&sig=" + sig + "&hotelId=" + hotelId;
            Request request = new Request.Builder().url(getUrl).get().build();
            executeRequest(url, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
