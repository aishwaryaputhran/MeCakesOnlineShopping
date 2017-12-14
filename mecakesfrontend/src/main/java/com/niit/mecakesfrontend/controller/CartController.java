package com.niit.mecakesfrontend.controller;

	import java.util.List;

	import javax.servlet.http.HttpSession;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.authentication.AnonymousAuthenticationToken;
	import org.springframework.security.core.Authentication;
	import org.springframework.security.core.context.SecurityContextHolder;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.user1;

	


	@Controller
	public class CartController 
	{
		@Autowired
		Product product;
		@Autowired 
		ProductDao productDao;
		
		@Autowired 
		user1 user;
		@Autowired 
		user1Dao userDao;
		
		@Autowired
		Cart cart;
		@Autowired
		CartDao cartDao;
		
		@Autowired
		CartItem cartItem;
		@Autowired
		CartItemDao cartItemDao;
		
		@Autowired
		HttpSession session;
		
		@RequestMapping("/addtocart/{id}")
		public ModelAndView cart(@PathVariable("id") String id) 
		{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken)) {
				String currusername = authentication.getName();
		user1 u = userDao.getEmail(currusername);
		if (user == null)
		{
			return new ModelAndView("redirect:/");
		} 
		else
		{
			cart = u.getCart();
			Product product1 = productDao.get(id);
			CartItem cartItem = new CartItem();
			cartItem.setCart(cart);
			cartItem.setProduct(product1);
			cartItem.setPrice(product1.getProduct_price());
			cartItemDao.saveupdate(cartItem);
			cart.setGrandtotal(cart.getGrandtotal() + product.getProduct_price());
			cart.setTotal_items(cart.getTotal_items() + 1);
			cartDao.saveupdate(cart);
			session.setAttribute("items", cart.getTotal_items());
			session.setAttribute("gd", cart.getGrandtotal());
			return new ModelAndView("redirect:/");
			}
			}
			else {
				return new ModelAndView("redirect:/");
			}
		}
		
		@RequestMapping(value = "/viewcart")
		public String viewcart(Model model, HttpSession session) 
		{
			System.out.println(1223);
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			
			if (!(authentication instanceof AnonymousAuthenticationToken))
			{
				String currusername = authentication.getName();
				user1 u = userDao.getEmail(currusername);
			        Cart c=u.getCart();
					List<CartItem> cartItem = cartItemDao.getlist(u.getCart().getCart_id());
					if(cartItem==null ||cartItem.isEmpty())
					{
						session.setAttribute("items",0);
						model.addAttribute("gtotal",0.0);
						model.addAttribute("msg", "no Items is added to cart");
						return "viewcart";		
					}
					
					model.addAttribute("cartItems", cartItem);
					model.addAttribute("gtotal",c.getGrandtotal());
					session.setAttribute("items",c.getTotal_items());
				    session.setAttribute("cartId", c.getCart_id());
					return "viewcart";		
		}
//			else
//			{
				return "redirect:/viewcart";
//			}
		}
		
		@RequestMapping(value="/Remove/{carId}")
		public ModelAndView RemoveFromCart(@PathVariable("carId") String id)
		{
			ModelAndView obj= new ModelAndView("redirect:/viewcart");
			cartItem=cartItemDao.get(id);
			Cart c=cartItem.getCart();
			c.setGrandtotal(c.getGrandtotal()-cartItem.getPrice());
			c.setTotal_items(c.getTotal_items()-1);
			cartDao.saveupdate(c);
			
			cartItemDao.delete(cartItem.getCartitem_id());
			return obj;
		}
		
		@RequestMapping(value="/Removeall")
		public String RemoveallFromCart(Model model,HttpSession session)
		{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			if (!(authentication instanceof AnonymousAuthenticationToken))
			{
				String currusername = authentication.getName();
				user1 u = userDao.getEmail(currusername);
			Cart c=cartDao.get(u.getCart().getCart_id());
			List<CartItem> cartItem=cartItemDao.getlist(u.getCart().getCart_id());
			for(CartItem g:cartItem)
			{
				cartItemDao.delete(g.getCartitem_id());
			}
			c.setGrandtotal(0.0);;
			c.setTotal_items(0);
			cartDao.saveupdate(c);
			session.setAttribute("items",c.getTotal_items());
			return "redirect:/viewcart";
		}
			else
			{
				return "redirect:/";
			}
		}
		
//		@RequestMapping("/addtocartR/{p_id}")
//		public ModelAndView cartr(@PathVariable("p_id") String id) {
	//
//			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//			if (!(authentication instanceof AnonymousAuthenticationToken)) {
//				String currusername = authentication.getName();
//				User u = userDao.getUseremail(currusername);
//				if (user == null) {
//					return new ModelAndView("redirect:/");
//				} else {
	//
//					cart = u.getCart();
//					product = productDao.getProduct(id);
//					CartItems cartItem = new CartItems();
//					cartItem.setCart(cart);
//					cartItem.setProduct(product);
//					cartItem.setPrice(product.getP_c());
//					cartItemDao.saveOrUpdate(cartItem);
//					cart.setGrandtotal(cart.getGrandtotal() + product.getP_c());
//					cart.setTotalitems(cart.getTotalitems() + 1);
//					cartDao.saveOrUpdate(cart);
//					session.setAttribute("items", cart.getTotalitems());
//					session.setAttribute("gd", cart.getGrandtotal());
//					return new ModelAndView("redirect:/viewcart");
//				}
//			} else {
//				return new ModelAndView("redirect:/");
//			}
	//
//		}
//		@RequestMapping("/addtocartC/{p_id}")
//		public ModelAndView cartc(@PathVariable("p_id") String id) {
	//
//			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//			if (!(authentication instanceof AnonymousAuthenticationToken)) {
//				String currusername = authentication.getName();
//				User u = userDao.getUseremail(currusername);
//				if (user == null) {
//					return new ModelAndView("redirect:/");
//				} else {
	//
//					cart = u.getCart();
//					product = productDao.getProduct(id);
//					CartItems cartItem = new CartItems();
//					cartItem.setCart(cart);
//					cartItem.setProduct(product);
//					cartItem.setPrice(product.getP_c());
//					cartItemDao.saveOrUpdate(cartItem);
//					cart.setGrandtotal(cart.getGrandtotal() + product.getP_c());
//					cart.setTotalitems(cart.getTotalitems() + 1);
//					cartDao.saveOrUpdate(cart);
//					session.setAttribute("items", cart.getTotalitems());
//					session.setAttribute("gd", cart.getGrandtotal());
//					return new ModelAndView("redirect:/viewcart");
//				}
//			} else {
//				return new ModelAndView("redirect:/");
//			}
	//
//		}


	}


