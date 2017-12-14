package com.niit.mecakesbackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class user1 {
	private static final long SerialVersionUID=1l;

	@Id
	private  String uid;
	private String username;
	private String password;
	private String address;
	private String email;
	private long phone;
	public String getRole() {
		return role;
	}





	public void setRole(String role) {
		this.role = role;
	}
	private String role="ROLE_USER";
	
	
	public Authentication getAuthentication() {
		return authentication;
	}





	public void setAuthentication(Authentication authentication) {
		this.authentication = authentication;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bid")
	private BillingAddress billingAddress;
	
	 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roleId")
	private Authentication authentication;
	
	 public user1()
		{
			this.uid="U"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	   
	
	
	
	
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
