package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class Itinerary implements Serializable{
	public String creationTime;
	public String itineraryStartDate;
	public Customer Customer;
	public int itineraryId;
	public HotelConfirmation HotelConfirmation;
	public String creationDate;
	public String itineraryEndDate;
	public int affiliateId;

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getItineraryStartDate() {
		return itineraryStartDate;
	}

	public void setItineraryStartDate(String itineraryStartDate) {
		this.itineraryStartDate = itineraryStartDate;
	}

	public com.example.arbaz.expediaexmple.model.Customer getCustomer() {
		return Customer;
	}

	public void setCustomer(com.example.arbaz.expediaexmple.model.Customer customer) {
		Customer = customer;
	}

	public int getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(int itineraryId) {
		this.itineraryId = itineraryId;
	}

	public com.example.arbaz.expediaexmple.model.HotelConfirmation getHotelConfirmation() {
		return HotelConfirmation;
	}

	public void setHotelConfirmation(com.example.arbaz.expediaexmple.model.HotelConfirmation hotelConfirmation) {
		HotelConfirmation = hotelConfirmation;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getItineraryEndDate() {
		return itineraryEndDate;
	}

	public void setItineraryEndDate(String itineraryEndDate) {
		this.itineraryEndDate = itineraryEndDate;
	}

	public int getAffiliateId() {
		return affiliateId;
	}

	public void setAffiliateId(int affiliateId) {
		this.affiliateId = affiliateId;
	}
}
