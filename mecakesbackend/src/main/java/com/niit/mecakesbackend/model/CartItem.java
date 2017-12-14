package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CartItem 
{
	private static final long SerialVersionUID=1l;
	@Id
	   private String cartitem_id;
	 double price;
	  
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	private Product product;
	
	 @ManyToOne
	   @JoinColumn(name="cart_id")
	   private Cart cart;
	   
	 public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public CartItem() 
	  {
		this.cartitem_id = "W"+UUID.randomUUID().toString().substring(30).toUpperCase();
	   }


	public String getCartitem_id() {
		return cartitem_id;
	}



	public void setCartitem_id(String cartitem_id) {
		this.cartitem_id = cartitem_id;
	}



	


}
