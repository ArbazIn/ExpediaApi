package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.List;

public class Room implements Serializable{
	public String rateKey;
	public List<ChargeableNightlyRatesItem> chargeableNightlyRates;
	public int numberOfChildren;
	public int numberOfAdults;

	public void setRateKey(String rateKey){
		this.rateKey = rateKey;
	}

	public String getRateKey(){
		return rateKey;
	}

	public void setChargeableNightlyRates(List<ChargeableNightlyRatesItem> chargeableNightlyRates){
		this.chargeableNightlyRates = chargeableNightlyRates;
	}

	public List<ChargeableNightlyRatesItem> getChargeableNightlyRates(){
		return chargeableNightlyRates;
	}

	public void setNumberOfChildren(int numberOfChildren){
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfChildren(){
		return numberOfChildren;
	}

	public void setNumberOfAdults(int numberOfAdults){
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfAdults(){
		return numberOfAdults;
	}
}