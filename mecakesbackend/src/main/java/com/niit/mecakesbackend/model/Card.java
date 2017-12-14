package com.niit.mecakesbackend.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table

public class Card
{private static final long SerialVersionUID=1l;
	@Id
	   private String card_id;
	   private String card_holdername;
	   private int card_no;
	   private String card_expirydate;
	   
	   
	   public Card()
		{
			this.card_id="D"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
	   
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	public String getCard_holdername() {
		return card_holdername;
	}
	public void setCard_holdername(String card_holdername) {
		this.card_holdername = card_holdername;
	}
	
	public int getCard_no() {
		return card_no;
	}

	public void setCard_no(int card_no) {
		this.card_no = card_no;
	}

	public String getCard_expirydate() {
		return card_expirydate;
	}
	public void setCard_expirydate(String card_expirydate) {
		this.card_expirydate = card_expirydate;
	}
	
		
}
