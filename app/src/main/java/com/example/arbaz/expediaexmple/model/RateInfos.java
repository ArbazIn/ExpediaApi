package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RateInfos implements Serializable{
	public String size;
	public RateInfo RateInfo;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public com.example.arbaz.expediaexmple.model.RateInfo getRateInfo() {
		return RateInfo;
	}

	public void setRateInfo(com.example.arbaz.expediaexmple.model.RateInfo rateInfo) {
		RateInfo = rateInfo;
	}
}
