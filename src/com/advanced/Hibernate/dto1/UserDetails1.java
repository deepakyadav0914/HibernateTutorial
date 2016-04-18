package com.advanced.Hibernate.dto1;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails1 {
	
	@Id
	private int userId;
	
	//Basic annotation is for hibernate to treat below data as basic, which means it will take field name as column name
	@Basic
	private String userName;
	
	//Temporal is for date and time prefrences, it is enumration type which has some predefined set of values
	@Temporal(TemporalType.TIME)
	private Date createdDate;
	
	private String address;
	
	//Transient means to ignore below field
	//Lob is for large objects
	@Transient
	@Lob
	private String Description;
	
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
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
