package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.Supplier1Dao;
import com.niit.mecakesbackend.Dao.category1Dao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.Supplier1;
import com.niit.mecakesbackend.model.category1;
import com.niit.mecakesbackend.model.user1;

public class ProductTest 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		
		ProductDao ProductDao=(ProductDao) context.getBean("ProductDao");
		Product Product=(Product)context.getBean("product");
		  category1Dao category1Dao=(category1Dao) context.getBean("category1Dao");
		    category1 category=(category1)context.getBean("category1");
		    category=category1Dao.get("C25779A");
		    
		    Supplier1Dao Supplier1Dao = (Supplier1Dao) context.getBean("Supplier1Dao");
	         Supplier1 Supplier1 = (Supplier1) context.getBean("supplier1");
	         Supplier1=Supplier1Dao.get("SAE4AEB");
		
		Product.setProduct_name("vin");
		Product.setProduct_price(2222);
		Product.setQuantity(12);
		Product.setProduct_description("jahsjas hajshja jahsjas");
		Product.setCategory(category);
		Product.setSupplier(Supplier1);
	
//      save and update
      if(ProductDao.saveupdate(Product)==true)
      {
      	System.out.println("saved");
      }
      else
      	System.out.println("Sorry");
        
   //delete
//  if(category1Dao.delete("001")==true)
//     {
//     	System.out.println("Delete successfull");
//      }
//      else
//      {
//      	System.out.println("Sorry");
//      }
//  category1 c= category1Dao.get("001");
//      System.out.println(c.getCid());
//      System.out.println(c.getCname());
//      
//      
//      List<category1> list1 = category1Dao.list();
//      for( category1 c1:li)
//      {
//      	System.out.println(c1.getCid());
//      	System.out.println(c1.getCname());
//      	
//      }
//     
    
	}
}

