package com.example.arbaz.expediaexmple.model;

public class HotelListResponse{
	private String cacheKey;
	private int numberOfRoomsRequested;
	private HotelList hotelList;
	private String customerSessionId;
	private String cacheLocation;
	private CachedSupplierResponse cachedSupplierResponse;
	private boolean moreResultsAvailable;

	public void setCacheKey(String cacheKey){
		this.cacheKey = cacheKey;
	}

	public String getCacheKey(){
		return cacheKey;
	}

	public void setNumberOfRoomsRequested(int numberOfRoomsRequested){
		this.numberOfRoomsRequested = numberOfRoomsRequested;
	}

	public int getNumberOfRoomsRequested(){
		return numberOfRoomsRequested;
	}

	public void setHotelList(HotelList hotelList){
		this.hotelList = hotelList;
	}

	public HotelList getHotelList(){
		return hotelList;
	}

	public void setCustomerSessionId(String customerSessionId){
		this.customerSessionId = customerSessionId;
	}

	public String getCustomerSessionId(){
		return customerSessionId;
	}

	public void setCacheLocation(String cacheLocation){
		this.cacheLocation = cacheLocation;
	}

	public String getCacheLocation(){
		return cacheLocation;
	}

	public void setCachedSupplierResponse(CachedSupplierResponse cachedSupplierResponse){
		this.cachedSupplierResponse = cachedSupplierResponse;
	}

	public CachedSupplierResponse getCachedSupplierResponse(){
		return cachedSupplierResponse;
	}

	public void setMoreResultsAvailable(boolean moreResultsAvailable){
		this.moreResultsAvailable = moreResultsAvailable;
	}

	public boolean isMoreResultsAvailable(){
		return moreResultsAvailable;
	}
}
