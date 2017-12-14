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
public class Supplier1 {
	private static final long SerialVersionUID=1l;
	@Id
	private String sid;
	private String sname;
	private String address;
	private long scontact;
	@OneToMany(mappedBy="supplier")
	private List<Product> product;
	public Supplier1()
	{
		this.sid="S"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	
	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getScontact() {
		return scontact;
	}
	public void setScontact(long scontact) {
		this.scontact = scontact;
	}
	
	

}
