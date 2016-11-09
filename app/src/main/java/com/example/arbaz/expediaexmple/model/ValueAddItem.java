package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class ValueAddItem implements Serializable{
	public String description;
	public String id;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}
