package com.niit.mecakesbackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart
{
	private static final long SerialVersionUID=1l;
	@Id
	   private String cart_id;
	   private double grandtotal=0.0;
	   private int total_items=0;
	  
	   @OneToMany(mappedBy="cart")
	   private List<CartItem> cartItem;
	   
	  public List<CartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}
	public Cart() 
	  {
		this.cart_id = "C"+UUID.randomUUID().toString().substring(30).toUpperCase();
	   }
	public String getCart_id() {
		return cart_id;
	}
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}
	public int getTotal_items() {
		return total_items;
	}
	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}

	   
}
