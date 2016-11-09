package com.example.arbaz.expediaexmple.model;

public class Surcharges{
	private Surcharge surcharge;
	private String size;

	public void setSurcharge(Surcharge surcharge){
		this.surcharge = surcharge;
	}

	public Surcharge getSurcharge(){
		return surcharge;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}
}
