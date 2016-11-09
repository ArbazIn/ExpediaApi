package com.example.arbaz.expediaexmple.model;

/**
 * Created by arbaz on 7/11/16.
 */

public class HotelListMain {
    public String name;
    public String city;
    public String countryCode;

    public HotelListMain(String name, String city, String countryCode) {
        this.name = name;
        this.city = city;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
