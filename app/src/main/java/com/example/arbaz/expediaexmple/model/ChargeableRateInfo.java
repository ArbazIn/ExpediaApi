package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class ChargeableRateInfo implements Serializable{
	public NightlyRatesPerRoom nightlyRatesPerRoom;
	public String maxNightlyRate;
	public String surchargeTotal;
	public String commissionableUsdTotal;
	public Surcharges Surcharges;
	public String nightlyRateTotal;
	public String total;
	public String averageBaseRate;
	public String averageRate;
	public String currencyCode;

	public NightlyRatesPerRoom getNightlyRatesPerRoom() {
		return nightlyRatesPerRoom;
	}

	public void setNightlyRatesPerRoom(NightlyRatesPerRoom nightlyRatesPerRoom) {
		this.nightlyRatesPerRoom = nightlyRatesPerRoom;
	}

	public String getMaxNightlyRate() {
		return maxNightlyRate;
	}

	public void setMaxNightlyRate(String maxNightlyRate) {
		this.maxNightlyRate = maxNightlyRate;
	}

	public String getSurchargeTotal() {
		return surchargeTotal;
	}

	public void setSurchargeTotal(String surchargeTotal) {
		this.surchargeTotal = surchargeTotal;
	}

	public String getCommissionableUsdTotal() {
		return commissionableUsdTotal;
	}

	public void setCommissionableUsdTotal(String commissionableUsdTotal) {
		this.commissionableUsdTotal = commissionableUsdTotal;
	}

	public com.example.arbaz.expediaexmple.model.Surcharges getSurcharges() {
		return Surcharges;
	}

	public void setSurcharges(com.example.arbaz.expediaexmple.model.Surcharges surcharges) {
		Surcharges = surcharges;
	}

	public String getNightlyRateTotal() {
		return nightlyRateTotal;
	}

	public void setNightlyRateTotal(String nightlyRateTotal) {
		this.nightlyRateTotal = nightlyRateTotal;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getAverageBaseRate() {
		return averageBaseRate;
	}

	public void setAverageBaseRate(String averageBaseRate) {
		this.averageBaseRate = averageBaseRate;
	}

	public String getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(String averageRate) {
		this.averageRate = averageRate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
