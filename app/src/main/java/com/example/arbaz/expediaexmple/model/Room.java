package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;
import java.util.List;

public class Room implements Serializable{
	public String rateKey;
	public List<ChargeableNightlyRatesItem> ChargeableNightlyRates;
	public int numberOfChildren;
	public int numberOfAdults;
	public String firstName;
	public String lastName;
	public String bedTypeId;
	public String smokingPreference;

	public Room(int numberOfAdults, String firstName, String lastName, String bedTypeId, String smokingPreference) {
		this.numberOfAdults = numberOfAdults;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bedTypeId = bedTypeId;
		this.smokingPreference = smokingPreference;
	}

	public String getRateKey() {
		return rateKey;
	}

	public void setRateKey(String rateKey) {
		this.rateKey = rateKey;
	}

	public List<ChargeableNightlyRatesItem> getChargeableNightlyRates() {
		return ChargeableNightlyRates;
	}

	public void setChargeableNightlyRates(List<ChargeableNightlyRatesItem> chargeableNightlyRates) {
		ChargeableNightlyRates = chargeableNightlyRates;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
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

	public String getBedTypeId() {
		return bedTypeId;
	}

	public void setBedTypeId(String bedTypeId) {
		this.bedTypeId = bedTypeId;
	}

	public String getSmokingPreference() {
		return smokingPreference;
	}

	public void setSmokingPreference(String smokingPreference) {
		this.smokingPreference = smokingPreference;
	}
}