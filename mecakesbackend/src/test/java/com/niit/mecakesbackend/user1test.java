package com.niit.mecakesbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.BillingAddressDao;
import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.BillingAddress;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.user1;

public class user1test {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
         user1Dao user1Dao = (user1Dao) context.getBean("user1Dao");
         user1 user1 = (user1) context.getBean("user1");
         Cart cart = (Cart) context.getBean("cart");
         CartDao cartDao=(CartDao) context.getBean("cartDao");
         BillingAddress billingAddress = (BillingAddress) context.getBean("billingAddress");
         BillingAddressDao billingAddressDao=(BillingAddressDao) context.getBean("billingAddressDao");
         cart =cartDao.get("C260313");
         billingAddress=billingAddressDao.get("BCBADAE");
        
         user1.setUsername("gsdhgfdsh");
         user1.setAddress("106,avenue road,blore-66");
         user1.setEmail("georgian@gmail.com");
         user1.setPassword("1vk1me044");
         user1.setPhone(9620850798l);
         user1.setCart(cart);
         
         user1.setBillingAddress(billingAddress);
         
//        save and update
        if(user1Dao.saveupdate(user1)==true)
        {
        	System.out.println("saved");
        }
        else
        	System.out.println("Sorry");
          
     //delete
  //  if(user1Dao.delete("001")==true)
    //   {
      // 	System.out.println("Delete successfull");
       // }
        //else
        //{
        	//System.out.println("Sorry");
        //}
        //user1 c=user1Dao.get("001");
        //System.out.println(c.getUid());
        //System.out.println(c.getUsername());
        //System.out.println(c.getAddress());
        //System.out.println(c.getEmail());
        //System.out.println(c.getPassword());
        //System.out.println(c.getPhone());
        
        //List<user1> li=user1Dao.list();
        //for(user1 c1:li){
        	//System.out.println(c1.getUid());
        	//System.out.println(c1.getUsername());
        	//System.out.println(c1.getAddress());
        	//System.out.println(c1.getEmail());
        	//System.out.println(c1.getPassword());
        	  //System.out.println(c1.getPhone());
     // }
       
	}
}

