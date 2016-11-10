package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class HotelItineraryResponse implements Serializable{
	public Itinerary Itinerary;
	public String size;
	public String customerSessionId;

	public com.example.arbaz.expediaexmple.model.Itinerary getItinerary() {
		return Itinerary;
	}

	public void setItinerary(com.example.arbaz.expediaexmple.model.Itinerary itinerary) {
		Itinerary = itinerary;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCustomerSessionId() {
		return customerSessionId;
	}

	public void setCustomerSessionId(String customerSessionId) {
		this.customerSessionId = customerSessionId;
	}
}
