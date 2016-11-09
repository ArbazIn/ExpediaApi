package com.example.arbaz.expediaexmple.Listner;

/**
 * Created by arbaz on 9/8/16.
 */
public interface OnApiCallListener {
    public void onFailure(String message);

    public void onSuccess(int responseCode, String responseString, String url);

}
