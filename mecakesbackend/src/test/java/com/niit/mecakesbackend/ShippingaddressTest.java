package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.mecakesbackend.Dao.ShippingaddressDao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.Shippingaddress;
import com.niit.mecakesbackend.model.user1;

public class ShippingaddressTest 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		ShippingaddressDao ShippingaddressDao = (ShippingaddressDao) context.getBean("ShippingaddressDao");
		Shippingaddress Shippingaddress= (Shippingaddress) context.getBean("shippingaddress");
		
		user1Dao user1Dao = (user1Dao) context.getBean("user1Dao");
        user1 user1 = (user1) context.getBean("user1");
        user1=user1Dao.get("UA8F608");

		Shippingaddress.setDoorno("101");
		Shippingaddress.setStreet("mc layout");
		Shippingaddress.setLocality("hal");
		Shippingaddress.setCity("bidar");
		Shippingaddress.setState("karnataka");
		Shippingaddress.setPincode("560010");
		
         
//        save and update
        if(ShippingaddressDao.saveupdate(Shippingaddress)==true)
        {
        	System.out.println("saved");
        }
        else
        	System.out.println("Sorry");
          
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



