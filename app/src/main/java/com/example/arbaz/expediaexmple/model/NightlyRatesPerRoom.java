package com.example.arbaz.expediaexmple.model;

import java.util.List;

public class NightlyRatesPerRoom{
	private String size;
	private List<NightlyRateItem> nightlyRate;

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