package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Shippingaddress;



public interface ShippingaddressDao 
{
	public boolean saveupdate(Shippingaddress shippingaddress);  //true if succesful else false
	  
	  public boolean delete(String id);
	  
	  public Shippingaddress get(String id);
	  
	  public List<Shippingaddress> list();   //return list of cateogry
	  
	  public List<Shippingaddress> getAddByUser1(String uid);
	  
}
