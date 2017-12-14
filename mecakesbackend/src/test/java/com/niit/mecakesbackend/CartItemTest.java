package com.niit.mecakesbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.category1Dao;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.category1;

public class CartItemTest 
{

	public static void main(String args[]) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		CartItemDao CartItemDao = (CartItemDao) context.getBean("CartItemDao");
		CartItem CartItem= (CartItem) context.getBean("cartItem");
		Product Product=(Product)context.getBean("product");
		

		CartDao CartDao = (CartDao) context.getBean("CartDao");
		Cart Cart= (Cart) context.getBean("cart");
		Cart=CartDao.get("C260313");
         
		ProductDao productDao=(ProductDao) context.getBean("ProductDao");
		Product=productDao.get("PF051C0");
		
		
		CartItem.setProduct(Product);
		CartItem.setCart(Cart);
         
//        save and update
        if(CartItemDao.saveupdate(CartItem)==true)
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
