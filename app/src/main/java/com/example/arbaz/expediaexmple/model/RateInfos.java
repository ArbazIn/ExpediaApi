package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RateInfos implements Serializable{
	public String size;
	public RateInfo rateInfo;

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setRateInfo(RateInfo rateInfo){
		this.rateInfo = rateInfo;
	}

	public RateInfo getRateInfo(){
		return rateInfo;
	}
}
