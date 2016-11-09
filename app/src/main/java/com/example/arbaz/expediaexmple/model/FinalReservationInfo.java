package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

/**
 * Created by arbaz on 8/11/16.
 */

public class FinalReservationInfo implements Serializable{
    public  String email;
    public  String firstName;
    public  String lastName;
    public  String homePhone;
    public  String creditCardType;
    public  String creditCardNumber;
    public  String creditCardIdentifier;
    public  String creditCardExpirationMonth;
    public  String creditCardExpirationYear;

    public FinalReservationInfo(String email, String firstName, String lastName, String homePhone, String creditCardType, String creditCardNumber, String creditCardIdentifier, String creditCardExpirationMonth, String creditCardExpirationYear) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
        this.creditCardType = creditCardType;
        this.creditCardNumber = creditCardNumber;
        this.creditCardIdentifier = creditCardIdentifier;
        this.creditCardExpirationMonth = creditCardExpirationMonth;
        this.creditCardExpirationYear = creditCardExpirationYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardIdentifier() {
        return creditCardIdentifier;
    }

    public void setCreditCardIdentifier(String creditCardIdentifier) {
        this.creditCardIdentifier = creditCardIdentifier;
    }

    public String getCreditCardExpirationMonth() {
        return creditCardExpirationMonth;
    }

    public void setCreditCardExpirationMonth(String creditCardExpirationMonth) {
        this.creditCardExpirationMonth = creditCardExpirationMonth;
    }

    public String getCreditCardExpirationYear() {
        return creditCardExpirationYear;
    }

    public void setCreditCardExpirationYear(String creditCardExpirationYear) {
        this.creditCardExpirationYear = creditCardExpirationYear;
    }
}
