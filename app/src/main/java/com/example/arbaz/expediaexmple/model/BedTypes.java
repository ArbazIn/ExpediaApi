package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class BedTypes implements Serializable{
	public BedType bedType;
	public String size;

	public void setBedType(BedType bedType){
		this.bedType = bedType;
	}

	public BedType getBedType(){
		return bedType;
	}

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}
}
