package com.advanced.Hibernate.dto4.valueTypesEmbedObjects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails4 {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@Embedded
	private Address4 address;
	
	
	public Address4 getAddress() {
		return address;
	}
	public void setAddress(Address4 address) {
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	

	public String getUserName() {
		return userName+" from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
