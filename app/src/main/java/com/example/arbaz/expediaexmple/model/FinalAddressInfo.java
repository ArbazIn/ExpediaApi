package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

/**
 * Created by arbaz on 8/11/16.
 */

public class FinalAddressInfo implements Serializable {
    public String address1;
    public String city;
    public String stateProvinceCode;
    public String countryCode;
    public String postalCode;

    public FinalAddressInfo(String address1, String city, String stateProvinceCode, String countryCode, String postalCode) {
        this.address1 = address1;
        this.city = city;
        this.stateProvinceCode = stateProvinceCode;
        this.countryCode = countryCode;
        this.postalCode = postalCode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
