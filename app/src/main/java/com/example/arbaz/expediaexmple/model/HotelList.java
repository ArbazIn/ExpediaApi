package com.example.arbaz.expediaexmple.model;

import java.util.List;

public class HotelList{
	private List<HotelSummaryItem> hotelSummary;
	private String size;
	private String activePropertyCount;

	public void setHotelSummary(List<HotelSummaryItem> hotelSummary){
		this.hotelSummary = hotelSummary;
	}

	public List<HotelSummaryItem> getHotelSummary(){
		return hotelSummary;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setActivePropertyCount(String activePropertyCount){
		this.activePropertyCount = activePropertyCount;
	}

	public String getActivePropertyCount(){
		return activePropertyCount;
	}
}