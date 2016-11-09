package com.example.arbaz.expediaexmple.model;

import java.util.List;

public class ValueAdds{
	public String size;
	public List<ValueAddItem> valueAdd;

	public void setSize(String size){
		this.size = size;
	}

	public String getSize(){
		return size;
	}

	public void setValueAdd(List<ValueAddItem> valueAdd){
		this.valueAdd = valueAdd;
	}

	public List<ValueAddItem> getValueAdd(){
		return valueAdd;
	}
}