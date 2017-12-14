package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Supplier1;

public interface Supplier1Dao
{
	public boolean saveupdate(Supplier1 supplier);  //true if succesful else false
	  
	  public boolean delete(Supplier1 supplier);
	  
	  public Supplier1 get(String sid);
	  
	  public List<Supplier1> list();   //return list of cateogry
	  
}
