package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class BedTypes implements Serializable{
	public BedType BedType;
	public String size;

	public com.example.arbaz.expediaexmple.model.BedType getBedType() {
		return BedType;
	}

	public void setBedType(com.example.arbaz.expediaexmple.model.BedType bedType) {
		BedType = bedType;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
