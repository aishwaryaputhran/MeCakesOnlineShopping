package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table

public class Product 
{
	private static final long SerialVersionUID=1l;
	@Id
	   private String product_id;
	   private String product_name;
	   private double product_price;
	   private int quantity;
	   
	   
	   @Transient
	   private MultipartFile pbckgrnd;
	   
	   public MultipartFile getPbckgrnd() 
	   {
		return pbckgrnd;
	   }
	   public void setPbckgrnd(MultipartFile pbckgrnd)
	   {
		this.pbckgrnd = pbckgrnd;
	   }
	
	   public double getProduct_price()
	   {
		return product_price;
	   }

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private String product_description;
	   @ManyToOne
	   @JoinColumn(name="cid")
	   private category1 category;
	   
	   @ManyToOne
	   @JoinColumn(name="sid")
	   private Supplier1 supplier;
	   
	   public Product()
		{
			this.product_id="P"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	   
	
	public category1 getCategory() {
		return category;
	}
	public void setCategory(category1 category) {
		this.category= category;
	}
	public Supplier1 getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier1 supplier) {
		this.supplier = supplier;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	   
}
