package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RateInfo implements Serializable{
	public String priceBreakdown;
	public int currentAllotment;
	public boolean depositRequired;
	public boolean nonRefundable;
	public ChargeableRateInfo chargeableRateInfo;
	public boolean guaranteeRequired;
	public CancelPolicyInfoList cancelPolicyInfoList;
	public String rateType;
	public double taxRate;
	public String rateChange;
	public String promo;
	public RoomGroup roomGroup;
	public String cancellationPolicy;

	public void setPriceBreakdown(String priceBreakdown){
		this.priceBreakdown = priceBreakdown;
	}

	public String getPriceBreakdown(){
		return priceBreakdown;
	}

	public void setCurrentAllotment(int currentAllotment){
		this.currentAllotment = currentAllotment;
	}

	public int getCurrentAllotment(){
		return currentAllotment;
	}

	public void setDepositRequired(boolean depositRequired){
		this.depositRequired = depositRequired;
	}

	public boolean isDepositRequired(){
		return depositRequired;
	}

	public void setNonRefundable(boolean nonRefundable){
		this.nonRefundable = nonRefundable;
	}

	public boolean isNonRefundable(){
		return nonRefundable;
	}

	public void setChargeableRateInfo(ChargeableRateInfo chargeableRateInfo){
		this.chargeableRateInfo = chargeableRateInfo;
	}

	public ChargeableRateInfo getChargeableRateInfo(){
		return chargeableRateInfo;
	}

	public void setGuaranteeRequired(boolean guaranteeRequired){
		this.guaranteeRequired = guaranteeRequired;
	}

	public boolean isGuaranteeRequired(){
		return guaranteeRequired;
	}

	public void setCancelPolicyInfoList(CancelPolicyInfoList cancelPolicyInfoList){
		this.cancelPolicyInfoList = cancelPolicyInfoList;
	}

	public CancelPolicyInfoList getCancelPolicyInfoList(){
		return cancelPolicyInfoList;
	}

	public void setRateType(String rateType){
		this.rateType = rateType;
	}

	public String getRateType(){
		return rateType;
	}

	public void setTaxRate(double taxRate){
		this.taxRate = taxRate;
	}

	public double getTaxRate(){
		return taxRate;
	}

	public void setRateChange(String rateChange){
		this.rateChange = rateChange;
	}

	public String getRateChange(){
		return rateChange;
	}

	public void setPromo(String promo){
		this.promo = promo;
	}

	public String getPromo(){
		return promo;
	}

	public void setRoomGroup(RoomGroup roomGroup){
		this.roomGroup = roomGroup;
	}

	public RoomGroup getRoomGroup(){
		return roomGroup;
	}

	public void setCancellationPolicy(String cancellationPolicy){
		this.cancellationPolicy = cancellationPolicy;
	}

	public String getCancellationPolicy(){
		return cancellationPolicy;
	}
}
