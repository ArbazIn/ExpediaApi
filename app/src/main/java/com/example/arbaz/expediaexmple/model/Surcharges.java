package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class Surcharges implements Serializable{
	public Surcharge Surcharge;
	public String size;

	public com.example.arbaz.expediaexmple.model.Surcharge getSurcharge() {
		return Surcharge;
	}

	public void setSurcharge(com.example.arbaz.expediaexmple.model.Surcharge surcharge) {
		Surcharge = surcharge;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
