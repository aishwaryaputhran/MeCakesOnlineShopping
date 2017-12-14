package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Product;


public interface ProductDao
{

	public boolean saveupdate(Product product);  //true if succesful else false
	  
	  public boolean delete(Product Product);
	  
	  public Product get(String product_id);
	  
	  public List<Product> list();
		
	  public  List<Product>getProductByCategory(String cid);//taking info from category with passed cid
	  
	 public  List<Product>getProductBySupplier1(String sid);

}
