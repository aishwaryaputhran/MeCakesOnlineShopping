package com.niit.mecakesbackend.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table

public class category1 
{
	private static final long SerialVersionUID=1l;
	@Id
   private String cid;
   private String cname;
   @OneToMany(mappedBy="category")
   private List<Product> product;
   
   public category1()
	{
		this.cid="C"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
   
public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
   
}
