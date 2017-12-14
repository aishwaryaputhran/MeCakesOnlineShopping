package com.niit.mecakesbackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="orders")
@Component
public class Order 
{

	private static final long SerialVersionUID=1l;
	@Id
	   private String order_id;
	   private double grandtotal=0.0;
	   
	   @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
		@JoinColumn(name="bid")
	   private BillingAddress billingAddress;
	   @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
		@JoinColumn(name="id")
	    private Shippingaddress shippingaddress;
	   @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
		@JoinColumn(name="uid")
	   private user1 user1;
	   @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
		@JoinColumn(name="payment_id")
	   private Pay pay;
	
	   @OneToMany(mappedBy="order", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	   private List<OrderItems> orderItems;
	   
	  public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Shippingaddress getShippingaddress() {
		return shippingaddress;
	}

	public void setShippingaddress(Shippingaddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}

	public user1 getUser1() {
		return user1;
	}

	public void setUser1(user1 user1) {
		this.user1 = user1;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	
	public Order() 
	  {
		this.order_id = "O"+UUID.randomUUID().toString().substring(30).toUpperCase();
	   }

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}
	
}
