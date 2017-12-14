package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.mecakesbackend.Dao.PayDao;

import com.niit.mecakesbackend.model.Pay;

public class PayTest 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		PayDao PayDao = (PayDao) context.getBean("PayDao");
		Pay Pay= (Pay) context.getBean("pay");
		
		Pay.setPayment_method("COD");
		Pay.setPayment_status("paid");
		
         
//        save and update
        if(PayDao.saveupdate(Pay)==true)
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


