package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.List;

public class CancelPolicyInfoList implements Serializable{
	public List<CancelPolicyInfoItem> cancelPolicyInfo;

	public void setCancelPolicyInfo(List<CancelPolicyInfoItem> cancelPolicyInfo){
		this.cancelPolicyInfo = cancelPolicyInfo;
	}

	public List<CancelPolicyInfoItem> getCancelPolicyInfo(){
		return cancelPolicyInfo;
	}
}