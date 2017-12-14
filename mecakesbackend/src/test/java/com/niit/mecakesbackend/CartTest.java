package com.niit.mecakesbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.user1;

public class CartTest
{
	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		CartDao CartDao = (CartDao) context.getBean("CartDao");
		Cart Cart= (Cart) context.getBean("cart");
		
		 CartItem cartItem=(CartItem)context.getBean("cartItem");
		 CartItemDao CartItemDao=(CartItemDao) context.getBean("CartItemDao");
		 user1Dao user1Dao = (user1Dao) context.getBean("user1Dao");
         user1 user1 = (user1) context.getBean("user1");
     	
 		ProductDao ProductDao=(ProductDao) context.getBean("ProductDao");
 		Product product=(Product)context.getBean("product");
 		
 		user1=user1Dao.get("UA8F608");
 		Cart=user1.getCart();
 		cartItem = CartItemDao.get("WBF1A00");
// 		product=ProductDao.get("PEE3385");
	
		Cart.setGrandtotal(0.000);
		Cart.setTotal_items(10);
		
         
//        save and update
        if(CartDao.saveupdate(Cart)==true)
        {
        	System.out.println("saved");
        }
        else
        	System.out.println("Sorry");
          
        
        Cart=CartDao.get("C260313");
//        List<CartItem> p=CartItemDao.getCartItemByCart(Cart.getCart_id());     
//    
//        if(p==null||p.isEmpty())
//        {
//       	 CartDao.delete(Cart);
//        }
//        else
//       	 for(CartItem P:p)
//       	 {
//       		CartItemDao.delete(P);
//       	 }
//        if(CartItemDao.delete(cartItem))
//        {
//       	 System.out.println("cart is deleted");
//       	 
//       }
//        else
//        {
//       	 System.out.println("cart not deleted");
//        }
       
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
