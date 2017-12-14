package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table
public class BillingAddress
{
	private static final long SerialVersionUID=1l;
	@Id
   private String bid;
   private String doorno;
   private String street;
   private String locality;
   private String city;
   private String state;
   private int pincode;
   
   public  BillingAddress() 
   {
		this.bid = "B"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
public String getBid()
{
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}


public String getDoorno()
{
	return doorno;
}
public void setDoorno(String doorno)
{
	this.doorno = doorno;
}

public String getStreet()
{
	return street;
}
public void setStreet(String street)
{
	this.street = street;
}

public String getLocality()
{
	return locality;
}
public void setLocality(String locality)
{
	this.locality = locality;
}

public String getCity()
{
	return city;
}
public void setCity(String city)
{
	this.city = city;
}

public String getState()
{
	return state;
}
public void setState(String state)
{
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
