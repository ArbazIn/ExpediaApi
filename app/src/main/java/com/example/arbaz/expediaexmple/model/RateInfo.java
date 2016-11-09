package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class RateInfo implements Serializable{
	public String priceBreakdown;
	public int currentAllotment;
	public boolean depositRequired;
	public boolean nonRefundable;
	public ChargeableRateInfo ChargeableRateInfo;
	public boolean guaranteeRequired;
	public CancelPolicyInfoList CancelPolicyInfoList;
	public String rateType;
	public double taxRate;
	public String rateChange;
	public String promo;
	public RoomGroup RoomGroup;
	public String cancellationPolicy;

	public String getPriceBreakdown() {
		return priceBreakdown;
	}

	public void setPriceBreakdown(String priceBreakdown) {
		this.priceBreakdown = priceBreakdown;
	}

	public int getCurrentAllotment() {
		return currentAllotment;
	}

	public void setCurrentAllotment(int currentAllotment) {
		this.currentAllotment = currentAllotment;
	}

	public boolean isDepositRequired() {
		return depositRequired;
	}

	public void setDepositRequired(boolean depositRequired) {
		this.depositRequired = depositRequired;
	}

	public boolean isNonRefundable() {
		return nonRefundable;
	}

	public void setNonRefundable(boolean nonRefundable) {
		this.nonRefundable = nonRefundable;
	}

	public com.example.arbaz.expediaexmple.model.ChargeableRateInfo getChargeableRateInfo() {
		return ChargeableRateInfo;
	}

	public void setChargeableRateInfo(com.example.arbaz.expediaexmple.model.ChargeableRateInfo chargeableRateInfo) {
		ChargeableRateInfo = chargeableRateInfo;
	}

	public boolean isGuaranteeRequired() {
		return guaranteeRequired;
	}

	public void setGuaranteeRequired(boolean guaranteeRequired) {
		this.guaranteeRequired = guaranteeRequired;
	}

	public com.example.arbaz.expediaexmple.model.CancelPolicyInfoList getCancelPolicyInfoList() {
		return CancelPolicyInfoList;
	}

	public void setCancelPolicyInfoList(com.example.arbaz.expediaexmple.model.CancelPolicyInfoList cancelPolicyInfoList) {
		CancelPolicyInfoList = cancelPolicyInfoList;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public String getRateChange() {
		return rateChange;
	}

	public void setRateChange(String rateChange) {
		this.rateChange = rateChange;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public com.example.arbaz.expediaexmple.model.RoomGroup getRoomGroup() {
		return RoomGroup;
	}

	public void setRoomGroup(com.example.arbaz.expediaexmple.model.RoomGroup roomGroup) {
		RoomGroup = roomGroup;
	}

	public String getCancellationPolicy() {
		return cancellationPolicy;
	}

	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}
}
