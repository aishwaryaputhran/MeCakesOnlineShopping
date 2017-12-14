package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.OrderItems;



public interface OrderItemsDao 
{
	public boolean saveupdate(OrderItems orderitems);  //true if succesful else false
	  
	  public boolean delete(String orderitem_id);
	  
	  public OrderItems get(String orderitem_id);
	  
	  public List<OrderItems> getOrderItemsByOrder(String order_id);   
	  
	  public List<OrderItems> list();

}
