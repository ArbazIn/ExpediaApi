package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.List;

public class ValueAdds implements Serializable{
	public String size;
	public List<ValueAddItem> ValueAdd;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<ValueAddItem> getValueAdd() {
		return ValueAdd;
	}

	public void setValueAdd(List<ValueAddItem> valueAdd) {
		ValueAdd = valueAdd;
	}
}