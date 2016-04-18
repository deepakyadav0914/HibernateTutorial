package com.advanced.Hibernate.dto8.ProxyObj_Eager_LazyFetchTypes;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails8 {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	@JoinTable(name="USER_ADDRESSES",
	joinColumns=@JoinColumn(name="USER_ID")
	)
	
	@GenericGenerator(name = "increment", strategy = "increment")
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "increment", type = @Type(type="long"))
	private Collection<Address8> listofAddresses=new ArrayList<Address8>();
	
		
	
	public Collection<Address8> getListofAddresses() {
		return listofAddresses;
	}
	public void setListofAddresses(Collection<Address8> listofAddresses) {
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
