package com.example.arbaz.expediaexmple.global;

import android.util.Log;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by arbaz on 7/11/16.
 */

public class Constants {

    public static final String cid = "500089";

    public static final String apiKey = "8k02cl0s57ultid3b2oicb7lh";

    public static final String signatureSecret = "emhn54ch0e8iv";

    public static final String minorRev = "99";

    public static final String locale = "en_US";

    public static final String currencyCode = "USD";

    public static final String sig = getSignature();

    public static final int MILLISECONDS_PER_SECOND = 1000;

    public static final String supplierType= "E";

    public static final String rateType= "MerchantStandard";

    public static final int numberOfAdult=2;

    private static String getSignature() {
        if (signatureSecret != null) {
            try {
                final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    final long timeInSeconds = System.currentTimeMillis() / MILLISECONDS_PER_SECOND;
                final String signatureInput = apiKey + signatureSecret + timeInSeconds;

                messageDigest.update(signatureInput.getBytes());
                return String.format("%032x", new BigInteger(1, messageDigest.digest()));
            } catch (NoSuchAlgorithmException e) {

                Log.e("MD5", "Couldn't get MD5 hashing working");
            }
        }
        return null;
    }
}
