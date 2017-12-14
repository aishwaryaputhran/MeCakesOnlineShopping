package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.BillingAddressDao;

import com.niit.mecakesbackend.model.BillingAddress;


public class BillingAddressTest 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		BillingAddressDao BillingAddressDao = (BillingAddressDao) context.getBean("BillingAddressDao");
		BillingAddress BillingAddress = (BillingAddress) context.getBean("billingAddress");
		
		BillingAddress.setDoorno("1001");
		BillingAddress.setStreet("106,avenue road,blore-66");
		BillingAddress.setLocality("vijaynagar");
		BillingAddress.setCity("bangalore");
		BillingAddress.setState("kArnataka");
		BillingAddress.setPincode(560040);
         
//        save and update
        if(BillingAddressDao.saveupdate(BillingAddress)==true)
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



