package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.BillingAddress;

public interface BillingAddressDao 
{
	
	public boolean saveupdate(BillingAddress billingAddress);  //true if succesful else false
	  
	  public boolean delete(String bid);
	  
	  public BillingAddress get(String bid);
	  
	  public List<BillingAddress> list();   //return list of cateogry
	
	  public BillingAddress getByUser1(String uid);

	
}
