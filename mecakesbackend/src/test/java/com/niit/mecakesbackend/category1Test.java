package com.niit.mecakesbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.category1Dao;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.category1;


public class category1Test 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
	    category1Dao categoryDao=(category1Dao) context.getBean("category1Dao");
	    category1 category=(category1)context.getBean("category1");
	    Product product=(Product)context.getBean("product");
	    ProductDao productDao=(ProductDao) context.getBean("productDao");
	    
	    category.setCname("asdfad");
	    
//      save and update
      if(categoryDao.saveupdate(category)==true)
      {
      	System.out.println("saved");
      }
      else
      	System.out.println("Sorry");
      
      category=categoryDao.get("CCBE0C0");
      List<Product> p=productDao.getProductByCategory(category.getCid());     
  
      if(p==null||p.isEmpty())
      {
     	 categoryDao.delete(category);
      }
      else
     	 for(Product P:p)
     	 {
     		 productDao.delete(P);
     	 }
      if(categoryDao.delete(category))
      {
     	 System.out.println("category is deleted");
     	 
     }
      else
      {
     	 System.out.println("category not deleted");
      }
     
        
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
     
	}
}