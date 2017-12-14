package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table


public class Pay
{private static final long SerialVersionUID=1l;
	@Id
	   private String payment_id;
	   private String payment_method;
	   private String payment_status;
	   
	   public Pay()
		{
			this.payment_id="Q"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	   
	public String getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		this.payment_id = payment_id;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	   
}
