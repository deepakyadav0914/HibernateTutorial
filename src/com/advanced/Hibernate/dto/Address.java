package com.advanced.Hibernate.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private String city;
	private String state;
	private String pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	/*java

	what is static block ? static and @before class
	what is final ? can we override final method
	Constructor ? can we override a constructor
	Iterating a map ? answer : using entry set


	webservices 

	all types of ws, diff between put and post , get and delete
	keyword used to declare a variable in groovy


	selenium

	how to handle windows based pop-ups, can it be handled
	How do you handle Ajax controls using selenium (ex: auto-suggestions) 
	assert and verify?*/

	
}
