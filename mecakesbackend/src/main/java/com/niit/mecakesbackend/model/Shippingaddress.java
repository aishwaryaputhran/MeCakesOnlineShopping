package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table

public class Shippingaddress 
{private static final long SerialVersionUID=1l;
	@Id
	private String id;
	private String doorno;
	   private String street;
	   private String locality;
	   private String city;
	   private String state;
	   private String pincode;
	   
	 @ManyToOne
	 @JoinColumn(name="uid")
	   private user1 user1;
	  

	public user1 getUser1() {
		return user1;
	}

	public void setUser1(user1 user1) {
		this.user1 = user1;
	}

	public Shippingaddress()
		{
			this.id="S"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	   
	 public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
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
}
