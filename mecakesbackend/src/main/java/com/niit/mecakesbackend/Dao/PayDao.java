package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Pay;



public interface PayDao
{
	public boolean saveupdate(Pay pay);  //true if succesful else false
	  
	  public boolean delete(String payment_id);
	  
	  public Pay get(String payment_id);
	  
	  public List<Pay> list();   //return list of cateogry


}
