package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class Hotel implements Serializable{
	public double hotelRating;
	public String city;
	public String address1;
	public int postalCode;
	public double latitude;
	public int confidence;
	public double highRate;
	public int coordinateAccuracyCode;
	public double lowRate;
	public int hotelId;
	public String stateProvinceCode;
	public double tripAdvisorRating;
	public String phone;
	public String countryCode;
	public String name;
	public String theme;
	public String fax;
	public String statusCode;
	public double longitude;

	public void setHotelRating(double hotelRating){
		this.hotelRating = hotelRating;
	}

	public double getHotelRating(){
		return hotelRating;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setPostalCode(int postalCode){
		this.postalCode = postalCode;
	}

	public int getPostalCode(){
		return postalCode;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setConfidence(int confidence){
		this.confidence = confidence;
	}

	public int getConfidence(){
		return confidence;
	}

	public void setHighRate(double highRate){
		this.highRate = highRate;
	}

	public double getHighRate(){
		return highRate;
	}

	public void setCoordinateAccuracyCode(int coordinateAccuracyCode){
		this.coordinateAccuracyCode = coordinateAccuracyCode;
	}

	public int getCoordinateAccuracyCode(){
		return coordinateAccuracyCode;
	}

	public void setLowRate(double lowRate){
		this.lowRate = lowRate;
	}

	public double getLowRate(){
		return lowRate;
	}

	public void setHotelId(int hotelId){
		this.hotelId = hotelId;
	}

	public int getHotelId(){
		return hotelId;
	}

	public void setStateProvinceCode(String stateProvinceCode){
		this.stateProvinceCode = stateProvinceCode;
	}

	public String getStateProvinceCode(){
		return stateProvinceCode;
	}

	public void setTripAdvisorRating(double tripAdvisorRating){
		this.tripAdvisorRating = tripAdvisorRating;
	}

	public double getTripAdvisorRating(){
		return tripAdvisorRating;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTheme(String theme){
		this.theme = theme;
	}

	public String getTheme(){
		return theme;
	}

	public void setFax(String fax){
		this.fax = fax;
	}

	public String getFax(){
		return fax;
	}

	public void setStatusCode(String statusCode){
		this.statusCode = statusCode;
	}

	public String getStatusCode(){
		return statusCode;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}
}
