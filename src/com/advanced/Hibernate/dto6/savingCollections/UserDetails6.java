package com.advanced.Hibernate.dto6.savingCollections;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails6 {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	private Set<Address6> listofAddresses=new HashSet<Address6>();
	
		
	public Set<Address6> getAddresses() {
		return listofAddresses;
	}
	public void setAddresses(Set<Address6> listofAddresses) {
		this.listofAddresses = listofAddresses;
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
