package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class CustomerAddresses implements Serializable{
	private String city;
	private String address1;
	private String countryCode;
	private boolean isPrimary;
	private int postalCode;
	private int type;
	private String stateProvinceCode;

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setIsPrimary(boolean isPrimary){
		this.isPrimary = isPrimary;
	}

	public boolean isIsPrimary(){
		return isPrimary;
	}

	public void setPostalCode(int postalCode){
		this.postalCode = postalCode;
	}

	public int getPostalCode(){
		return postalCode;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setStateProvinceCode(String stateProvinceCode){
		this.stateProvinceCode = stateProvinceCode;
	}

	public String getStateProvinceCode(){
		return stateProvinceCode;
	}
}
