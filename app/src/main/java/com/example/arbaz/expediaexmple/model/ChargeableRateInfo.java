package com.example.arbaz.expediaexmple.model;

public class ChargeableRateInfo{
	private NightlyRatesPerRoom nightlyRatesPerRoom;
	private String maxNightlyRate;
	private String surchargeTotal;
	private String commissionableUsdTotal;
	private Surcharges surcharges;
	private String nightlyRateTotal;
	private String total;
	private String averageBaseRate;
	private String averageRate;
	private String currencyCode;

	public void setNightlyRatesPerRoom(NightlyRatesPerRoom nightlyRatesPerRoom){
		this.nightlyRatesPerRoom = nightlyRatesPerRoom;
	}

	public NightlyRatesPerRoom getNightlyRatesPerRoom(){
		return nightlyRatesPerRoom;
	}

	public void setMaxNightlyRate(String maxNightlyRate){
		this.maxNightlyRate = maxNightlyRate;
	}

	public String getMaxNightlyRate(){
		return maxNightlyRate;
	}

	public void setSurchargeTotal(String surchargeTotal){
		this.surchargeTotal = surchargeTotal;
	}

	public String getSurchargeTotal(){
		return surchargeTotal;
	}

	public void setCommissionableUsdTotal(String commissionableUsdTotal){
		this.commissionableUsdTotal = commissionableUsdTotal;
	}

	public String getCommissionableUsdTotal(){
		return commissionableUsdTotal;
	}

	public void setSurcharges(Surcharges surcharges){
		this.surcharges = surcharges;
	}

	public Surcharges getSurcharges(){
		return surcharges;
	}

	public void setNightlyRateTotal(String nightlyRateTotal){
		this.nightlyRateTotal = nightlyRateTotal;
	}

	public String getNightlyRateTotal(){
		return nightlyRateTotal;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setAverageBaseRate(String averageBaseRate){
		this.averageBaseRate = averageBaseRate;
	}

	public String getAverageBaseRate(){
		return averageBaseRate;
	}

	public void setAverageRate(String averageRate){
		this.averageRate = averageRate;
	}

	public String getAverageRate(){
		return averageRate;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}
