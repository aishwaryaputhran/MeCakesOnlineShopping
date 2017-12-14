package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.user1;


public interface user1Dao 
{
	public boolean saveupdate(user1 user);  //true if succesful else false
	  
	  public boolean delete(String uid);
	  
	  public user1 get(String uid);
	  
	  public user1 isvalid(String email,String password);
	  
	  public List<user1> list(); 
	  public user1 getEmail(String email);
	 
}
