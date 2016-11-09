package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.List;

public class NightlyRatesPerRoom implements Serializable{
	public String size;
	public List<NightlyRateItem> nightlyRate;

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setNightlyRate(List<NightlyRateItem> nightlyRate){
		this.nightlyRate = nightlyRate;
	}

	public List<NightlyRateItem> getNightlyRate(){
		return nightlyRate;
	}
}