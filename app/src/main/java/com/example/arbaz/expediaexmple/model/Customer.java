package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class Customer implements Serializable{
	public CustomerAddresses CustomerAddresses;
	public String firstName;
	public String lastName;
	public int homePhone;
	public int workPhone;
	public String email;

	public com.example.arbaz.expediaexmple.model.CustomerAddresses getCustomerAddresses() {
		return CustomerAddresses;
	}

	public void setCustomerAddresses(com.example.arbaz.expediaexmple.model.CustomerAddresses customerAddresses) {
		CustomerAddresses = customerAddresses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}

	public int getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(int workPhone) {
		this.workPhone = workPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
