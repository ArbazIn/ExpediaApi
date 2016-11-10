package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class HotelRoomReservationResponse implements Serializable {
    public int hotelPostalCode;
    public String reservationStatusCode;
    public boolean existingItinerary;
    public int tripAdvisorReviewCount;
    public String hotelCountryCode;
    public String drivingDirections;
    public String customerSessionId;
    public String hotelAddress;
    public String hotelName;
    public String tripAdvisorRatingUrl;
    public String arrivalDate;
    public int confirmationNumbers;
    public double tripAdvisorRating;
    public String hotelCity;
    public String roomDescription;
    public boolean processedWithConfirmation;
    public int itineraryId;
    public String checkInInstructions;
    public int numberOfRoomsBooked;
    public int rateOccupancyPerRoom;
    public String departureDate;
    public String supplierType;
    public String hotelStateProvinceCode;
    public RateInfos RateInfos;

    public HotelRoomReservationResponse(int hotelPostalCode, String reservationStatusCode, boolean existingItinerary, int tripAdvisorReviewCount, String hotelCountryCode, String drivingDirections, String customerSessionId, String hotelAddress, String hotelName, String tripAdvisorRatingUrl, String arrivalDate, int confirmationNumbers, double tripAdvisorRating, String hotelCity, String roomDescription, boolean processedWithConfirmation, int itineraryId, String checkInInstructions, int numberOfRoomsBooked, int rateOccupancyPerRoom, String departureDate, String supplierType) {
        this.hotelPostalCode = hotelPostalCode;
        this.reservationStatusCode = reservationStatusCode;
        this.existingItinerary = existingItinerary;
        this.tripAdvisorReviewCount = tripAdvisorReviewCount;
        this.hotelCountryCode = hotelCountryCode;
        this.drivingDirections = drivingDirections;
        this.customerSessionId = customerSessionId;
        this.hotelAddress = hotelAddress;
        this.hotelName = hotelName;
        this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
        this.arrivalDate = arrivalDate;
        this.confirmationNumbers = confirmationNumbers;
        this.tripAdvisorRating = tripAdvisorRating;
        this.hotelCity = hotelCity;
        this.roomDescription = roomDescription;
        this.processedWithConfirmation = processedWithConfirmation;
        this.itineraryId = itineraryId;
        this.checkInInstructions = checkInInstructions;
        this.numberOfRoomsBooked = numberOfRoomsBooked;
        this.rateOccupancyPerRoom = rateOccupancyPerRoom;
        this.departureDate = departureDate;
        this.supplierType = supplierType;
    }

    public int getHotelPostalCode() {
        return hotelPostalCode;
    }

    public void setHotelPostalCode(int hotelPostalCode) {
        this.hotelPostalCode = hotelPostalCode;
    }

    public String getReservationStatusCode() {
        return reservationStatusCode;
    }

    public void setReservationStatusCode(String reservationStatusCode) {
        this.reservationStatusCode = reservationStatusCode;
    }

    public boolean isExistingItinerary() {
        return existingItinerary;
    }

    public void setExistingItinerary(boolean existingItinerary) {
        this.existingItinerary = existingItinerary;
    }

    public int getTripAdvisorReviewCount() {
        return tripAdvisorReviewCount;
    }

    public void setTripAdvisorReviewCount(int tripAdvisorReviewCount) {
        this.tripAdvisorReviewCount = tripAdvisorReviewCount;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public String getDrivingDirections() {
        return drivingDirections;
    }

    public void setDrivingDirections(String drivingDirections) {
        this.drivingDirections = drivingDirections;
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTripAdvisorRatingUrl() {
        return tripAdvisorRatingUrl;
    }

    public void setTripAdvisorRatingUrl(String tripAdvisorRatingUrl) {
        this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getConfirmationNumbers() {
        return confirmationNumbers;
    }

    public void setConfirmationNumbers(int confirmationNumbers) {
        this.confirmationNumbers = confirmationNumbers;
    }

    public double getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    public void setTripAdvisorRating(double tripAdvisorRating) {
        this.tripAdvisorRating = tripAdvisorRating;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public boolean isProcessedWithConfirmation() {
        return processedWithConfirmation;
    }

    public void setProcessedWithConfirmation(boolean processedWithConfirmation) {
        this.processedWithConfirmation = processedWithConfirmation;
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    public void setCheckInInstructions(String checkInInstructions) {
        this.checkInInstructions = checkInInstructions;
    }

    public int getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    public void setNumberOfRoomsBooked(int numberOfRoomsBooked) {
        this.numberOfRoomsBooked = numberOfRoomsBooked;
    }
}