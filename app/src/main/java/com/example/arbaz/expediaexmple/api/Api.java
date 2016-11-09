package com.example.arbaz.expediaexmple.api;

import com.example.arbaz.expediaexmple.global.Constants;

/**
 * Created by arbaz on 7/11/16.
 */

public class Api {

    public static final int ConnectionTimeout = 30000;


    public static final String HotelListUrl = "http://api.ean.com/ean-services/rs/hotel/v3/list?";
    public static final String HotelAvaiUrl = "https://book.api.ean.com/ean-services/rs/hotel/v3/avail?";
    public static final String HotelPaymentUrl= "https://book.api.ean.com/ean-services/rs/hotel/v3/paymentInfo?";
    public static final String HotelReservation= "https://book.api.ean.com/ean-services/rs/hotel/v3/res?";


    //response code
    public static final int ResponseOk = 200;
    public static final int ResponsePageError = 400;
    public static final int ResponseServerError = 500;
}
