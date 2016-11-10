package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class HotelConfirmation implements Serializable {
    public ReservationGuest ReservationGuest;
    public int supplierId;
    public int confirmationNumber;
    public String chainCode;
    public int nights;
    public String departureDate;
    public Hotel Hotel;
    public String arrivalDate;
    public RateInfos RateInfos;

    public com.example.arbaz.expediaexmple.model.ReservationGuest getReservationGuest() {
        return ReservationGuest;
    }

    public void setReservationGuest(com.example.arbaz.expediaexmple.model.ReservationGuest reservationGuest) {
        ReservationGuest = reservationGuest;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public com.example.arbaz.expediaexmple.model.Hotel getHotel() {
        return Hotel;
    }

    public void setHotel(com.example.arbaz.expediaexmple.model.Hotel hotel) {
        Hotel = hotel;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public com.example.arbaz.expediaexmple.model.RateInfos getRateInfos() {
        return RateInfos;
    }

    public void setRateInfos(com.example.arbaz.expediaexmple.model.RateInfos rateInfos) {
        RateInfos = rateInfos;
    }
}