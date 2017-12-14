package com.niit.mecakesbackend.Dao;

import java.util.List;


import com.niit.mecakesbackend.model.CartItem;

public interface CartItemDao 
{

	public boolean saveupdate(CartItem CartItem);  //true if succesful else false
	  
	public boolean delete(String cartitem_id);
	  
	  public CartItem get(String cartitem_id);
	 
	  public List<CartItem> list();   //return list of cateogry
     
	  public CartItem getlistall(String cart_id,String product_id);
	  public  List<CartItem> getlistByProduct(String product_id);
	  public List<CartItem> getlist(String cart_id);
}
