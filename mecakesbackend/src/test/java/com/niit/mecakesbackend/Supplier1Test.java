package com.niit.mecakesbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.Supplier1Dao;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.Supplier1;

public class Supplier1Test
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
         Supplier1Dao Supplier1Dao = (Supplier1Dao) context.getBean("Supplier1Dao");
         Supplier1 Supplier1 = (Supplier1) context.getBean("supplier1");
         Product product=(Product)context.getBean("product");
 	    ProductDao productDao=(ProductDao) context.getBean("productDao");
         
        
         Supplier1.setSname("gsdhgfdsh");
         Supplier1.setAddress("106,avenue road,blore-66");
         Supplier1.setScontact(9620850798l);
         
//        save and update
        if(Supplier1Dao.saveupdate(Supplier1)==true)
        {
        	System.out.println("saved");
        }
        else
        	System.out.println("Sorry");
        
        Supplier1 =Supplier1Dao.get("SAE4AEB");
        List<Product> p=productDao.getProductBySupplier1(Supplier1.getSid());     
    
        if(p==null||p.isEmpty())
        {
        	Supplier1Dao.delete(Supplier1);
        }
        else
       	 for(Product P:p)
       	 {
       		 productDao.delete(P);
       	 }
        if(Supplier1Dao.delete(Supplier1 ))
        {
       	 System.out.println("supplier is deleted");
       	 
       }
        else
        {
       	 System.out.println("supplier not deleted");
        }
       
          
//        delete
 //    if(Supplier1Dao.delete("001")==true){
   //     	System.out.println("Delete successfull");
     //   }
       // else{
        //	System.out.println("Sorry");
        //}
//        Supplier1 c=Supplier1Dao.get("001");
//        System.out.println(c.getSid());
//        System.out.println(c.getSname());
//        System.out.println(c.getAddress());
//        System.out.println(c.getScontact());
//        
//        List<Supplier1> li=Supplier1Dao.list();
//        for(Supplier1 c1:li){
//        	System.out.println(c1.getSid());
//        	System.out.println(c1.getSname());
//        	System.out.println(c1.getAddress());
//        	  System.out.println(c1.getScontact());
//        }
       
	}
}


