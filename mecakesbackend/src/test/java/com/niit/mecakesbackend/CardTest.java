package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.mecakesbackend.Dao.CardDao;
import com.niit.mecakesbackend.model.Card;



public class CardTest 
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		CardDao CardDao = (CardDao) context.getBean("CardDao");
		Card Card= (Card) context.getBean("card");
		
		
		Card.setCard_id("001");
		Card.setCard_holdername("paul");
		Card.setCard_no(888456);
		Card.setCard_expirydate("5_06_2018");
		
         
//        save and update
        if(CardDao.saveupdate(Card)==true)
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




