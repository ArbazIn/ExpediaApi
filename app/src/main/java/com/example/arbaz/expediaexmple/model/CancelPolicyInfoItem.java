package com.example.arbaz.expediaexmple.model;

public class CancelPolicyInfoItem{
	private int nightCount;
	private int versionId;
	private String cancelTime;
	private int startWindowHours;
	private String timeZoneDescription;
	private String currencyCode;

	public void setNightCount(int nightCount){
		this.nightCount = nightCount;
	}

	public int getNightCount(){
		return nightCount;
	}

	public void setVersionId(int versionId){
		this.versionId = versionId;
	}

	public int getVersionId(){
		return versionId;
	}

	public void setCancelTime(String cancelTime){
		this.cancelTime = cancelTime;
	}

	public String getCancelTime(){
		return cancelTime;
	}

	public void setStartWindowHours(int startWindowHours){
		this.startWindowHours = startWindowHours;
	}

	public int getStartWindowHours(){
		return startWindowHours;
	}

	public void setTimeZoneDescription(String timeZoneDescription){
		this.timeZoneDescription = timeZoneDescription;
	}

	public String getTimeZoneDescription(){
		return timeZoneDescription;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}
