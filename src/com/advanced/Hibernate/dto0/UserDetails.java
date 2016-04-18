package com.advanced.Hibernate.dto0;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="USER_DETAILS")
public class UserDetails {
	
	@Id
	@Column(name="USER_ID")
	private int userId;
	
	//Annotaions can be added at getters also
	@Column(name="USER_NAME")
	private String userName;
	
	
	//@Id
	//@Column(name="USER_ID")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	//@Column(name="USER_NAME")
	public String getUserName() {
		return userName+" from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
