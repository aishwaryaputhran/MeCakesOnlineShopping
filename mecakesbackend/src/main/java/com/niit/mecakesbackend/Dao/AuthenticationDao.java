package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Authentication;


public interface AuthenticationDao
{
	 public boolean saveupdate(Authentication authentication);  //true if succesful else false
	  
	  public boolean delete(Authentication authentication);
	  
	  public Authentication get(String roleId);
	  
	  public List<Authentication> list();   //return list of cateogry
	
}
