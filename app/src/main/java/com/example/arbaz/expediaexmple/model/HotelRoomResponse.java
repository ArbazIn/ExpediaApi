package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class HotelRoomResponse implements Serializable {
	public int roomTypeCode;
	public ValueAdds valueAdds;
	public BedTypes BedTypes;
	public RateInfos RateInfos;
	public int rateCode;
	public int quotedOccupancy;
	public int minGuestAge;
	public String rateDescription;
	public String deepLink;
	public String roomTypeDescription;
	public int rateOccupancyPerRoom;
	public String supplierType;
	public int propertyId;
	public String smokingPreferences;

	public int getRoomTypeCode() {
		return roomTypeCode;
	}

	public void setRoomTypeCode(int roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public ValueAdds getValueAdds() {
		return valueAdds;
	}

	public void setValueAdds(ValueAdds valueAdds) {
		this.valueAdds = valueAdds;
	}

	public com.example.arbaz.expediaexmple.model.BedTypes getBedTypes() {
		return BedTypes;
	}

	public void setBedTypes(com.example.arbaz.expediaexmple.model.BedTypes bedTypes) {
		BedTypes = bedTypes;
	}

	public com.example.arbaz.expediaexmple.model.RateInfos getRateInfos() {
		return RateInfos;
	}

	public void setRateInfos(com.example.arbaz.expediaexmple.model.RateInfos rateInfos) {
		RateInfos = rateInfos;
	}

	public int getRateCode() {
		return rateCode;
	}

	public void setRateCode(int rateCode) {
		this.rateCode = rateCode;
	}

	public int getQuotedOccupancy() {
		return quotedOccupancy;
	}

	public void setQuotedOccupancy(int quotedOccupancy) {
		this.quotedOccupancy = quotedOccupancy;
	}

	public int getMinGuestAge() {
		return minGuestAge;
	}

	public void setMinGuestAge(int minGuestAge) {
		this.minGuestAge = minGuestAge;
	}

	public String getRateDescription() {
		return rateDescription;
	}

	public void setRateDescription(String rateDescription) {
		this.rateDescription = rateDescription;
	}

	public String getDeepLink() {
		return deepLink;
	}

	public void setDeepLink(String deepLink) {
		this.deepLink = deepLink;
	}

	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}

	public void setRoomTypeDescription(String roomTypeDescription) {
		this.roomTypeDescription = roomTypeDescription;
	}

	public int getRateOccupancyPerRoom() {
		return rateOccupancyPerRoom;
	}

	public void setRateOccupancyPerRoom(int rateOccupancyPerRoom) {
		this.rateOccupancyPerRoom = rateOccupancyPerRoom;
	}

	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getSmokingPreferences() {
		return smokingPreferences;
	}

	public void setSmokingPreferences(String smokingPreferences) {
		this.smokingPreferences = smokingPreferences;
	}
}