package com.example.arbaz.expediaexmple.model;

import java.util.List;

public class HotelPaymentResponse{
	private List<PaymentTypeItem> paymentType;
	private String size;
	private String customerSessionId;
	private String currencyCode;

	public void setPaymentType(List<PaymentTypeItem> paymentType){
		this.paymentType = paymentType;
	}

	public List<PaymentTypeItem> getPaymentType(){
		return paymentType;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setCustomerSessionId(String customerSessionId){
		this.customerSessionId = customerSessionId;
	}

	public String getCustomerSessionId(){
		return customerSessionId;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}