package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Cart;



public interface CartDao 
{
	public boolean saveupdate(Cart cart);  //true if succesful else false
	  
	  public boolean delete(Cart cart);
	  
	  public Cart get(String cart_id);
	  
	  public List<Cart> list();   //return list of cateogry

}
