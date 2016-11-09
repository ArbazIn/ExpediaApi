package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class ChargeableNightlyRatesItem implements Serializable{
	public String promo;
	public String rate;
	public String baseRate;

	public void setPromo(String promo){
		this.promo = promo;
	}

	public String getPromo(){
		return promo;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public String getRate(){
		return rate;
	}

	public void setBaseRate(String baseRate){
		this.baseRate = baseRate;
	}

	public String getBaseRate(){
		return baseRate;
	}
}
