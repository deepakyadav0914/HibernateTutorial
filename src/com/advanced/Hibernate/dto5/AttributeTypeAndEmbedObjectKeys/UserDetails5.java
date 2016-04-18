package com.advanced.Hibernate.dto5.AttributeTypeAndEmbedObjectKeys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails5 {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USER_NAME")
	private String userName;
	
	@Embedded
	private Address5 homeAddress;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET_NAME")),
	@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY_NAME")),
	@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE_NAME")),
	@AttributeOverride(name="pincode",column=@Column(name="OFFICE_PIN_CODE"))
	})
	private Address5 officeAddress;
	
	
	
	public Address5 getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address5 homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address5 getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address5 officeAddress) {
		this.officeAddress = officeAddress;
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
