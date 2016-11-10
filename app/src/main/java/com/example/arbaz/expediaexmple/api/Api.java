package com.example.arbaz.expediaexmple.api;

import com.example.arbaz.expediaexmple.global.Constants;

/**
 * Created by arbaz on 7/11/16.
 */

public class Api {

    public static final int ConnectionTimeout = 30000;


    public static final String HotelMainUrl = "https://book.api.ean.com/ean-services/rs/hotel/v3";
//    public static final String HotelAvaiUrl = "https://book.api.ean.com/ean-services/rs/hotel/v3/avail?";
//    public static final String HotelListUrl = "http://api.ean.com/ean-services/rs/hotel/v3/list?";
//    public static final String HotelListUrl = "https://book.api.ean.com/ean-services/rs/hotel/v3";
//
//    public static final String HotelPaymentUrl = "https://book.api.ean.com/ean-services/rs/hotel/v3/paymentInfo?";
//    public static final String HotelReservation = "https://book.api.ean.com/ean-services/rs/hotel/v3/res?";
//    public static final String HotelRoomItinerary = "https://book.api.ean.com/ean-services/rs/hotel/v3/itin?";


    //response code
    public static final int ResponseOk = 200;
    public static final int ResponsePageError = 400;
    public static final int ResponseServerError = 500;

    public static final String ActionHotelListUrl = "/list?";
    public static final String ActionHotelAvaiUrl = "/avail?";
    public static final String ActionHotelPaymentUrl = "/paymentInfo?";
    public static final String ActionHotelReservation = "/res?";
    public static final String ActionHotelRoomItinerary = "/itin?";
    public static final String ActionHotelRoomCancelItinerary = "/cancel?";
    public static final String ActionHotelImages = "/roomImages?";
}
