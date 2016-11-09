package com.example.arbaz.expediaexmple.model;

public class RoomRateDetails{
	private int roomTypeCode;
	private int expediaPropertyId;
	private int maxRoomOccupancy;
	private String roomDescription;
	private boolean propertyRestricted;
	private int quotedRoomOccupancy;
	private RateInfos rateInfos;
	private boolean propertyAvailable;
	private int rateCode;
	private int minGuestAge;

	public void setRoomTypeCode(int roomTypeCode){
		this.roomTypeCode = roomTypeCode;
	}

	public int getRoomTypeCode(){
		return roomTypeCode;
	}

	public void setExpediaPropertyId(int expediaPropertyId){
		this.expediaPropertyId = expediaPropertyId;
	}

	public int getExpediaPropertyId(){
		return expediaPropertyId;
	}

	public void setMaxRoomOccupancy(int maxRoomOccupancy){
		this.maxRoomOccupancy = maxRoomOccupancy;
	}

	public int getMaxRoomOccupancy(){
		return maxRoomOccupancy;
	}

	public void setRoomDescription(String roomDescription){
		this.roomDescription = roomDescription;
	}

	public String getRoomDescription(){
		return roomDescription;
	}

	public void setPropertyRestricted(boolean propertyRestricted){
		this.propertyRestricted = propertyRestricted;
	}

	public boolean isPropertyRestricted(){
		return propertyRestricted;
	}

	public void setQuotedRoomOccupancy(int quotedRoomOccupancy){
		this.quotedRoomOccupancy = quotedRoomOccupancy;
	}

	public int getQuotedRoomOccupancy(){
		return quotedRoomOccupancy;
	}

	public void setRateInfos(RateInfos rateInfos){
		this.rateInfos = rateInfos;
	}

	public RateInfos getRateInfos(){
		return rateInfos;
	}

	public void setPropertyAvailable(boolean propertyAvailable){
		this.propertyAvailable = propertyAvailable;
	}

	public boolean isPropertyAvailable(){
		return propertyAvailable;
	}

	public void setRateCode(int rateCode){
		this.rateCode = rateCode;
	}

	public int getRateCode(){
		return rateCode;
	}

	public void setMinGuestAge(int minGuestAge){
		this.minGuestAge = minGuestAge;
	}

	public int getMinGuestAge(){
		return minGuestAge;
	}
}
