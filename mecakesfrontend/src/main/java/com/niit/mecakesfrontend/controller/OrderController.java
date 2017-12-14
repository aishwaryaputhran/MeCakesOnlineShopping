package com.niit.mecakesfrontend.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.mecakesbackend.Dao.BillingAddressDao;
import com.niit.mecakesbackend.Dao.CardDao;
import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.Dao.OrderDao;
import com.niit.mecakesbackend.Dao.OrderItemsDao;
import com.niit.mecakesbackend.Dao.PayDao;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.ShippingaddressDao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.BillingAddress;
import com.niit.mecakesbackend.model.Card;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;
import com.niit.mecakesbackend.model.Order;
import com.niit.mecakesbackend.model.OrderItems;
import com.niit.mecakesbackend.model.Pay;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.Shippingaddress;
import com.niit.mecakesbackend.model.user1;
import com.niit.mecakesfrontend.otp.Otpganarater;


@Controller
public class OrderController {


	@Autowired
	Cart cart;
	@Autowired
	CartDao cartDao;
	@Autowired
	CartItem cartItem;
	@Autowired
	CartItemDao cartItemDao;
	@Autowired
	Card card;
	@Autowired
	CardDao cardDao;
	@Autowired
	BillingAddress billingAddress;
	@Autowired
	BillingAddressDao billingAddressDao;
	@Autowired
	Shippingaddress shippingaddress;
	@Autowired
	ShippingaddressDao shippingaddressDao;
	@Autowired
	Pay pay;
	@Autowired
	PayDao payDao;
	@Autowired
	Order order;
	@Autowired
	OrderDao orderDao;
	@Autowired
	OrderItems orderItems;
	@Autowired
	OrderItemsDao orderItemsDao;
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	@Autowired
	user1 user1;
	@Autowired
	user1Dao user1Dao;
	@Autowired
	List<CartItem> cartItems;
	
	@Autowired
    private JavaMailSender mailSender;
	
	String o;
	
	@RequestMapping("/Buyall")
	public String orderall(Model model,HttpSession session) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currusername = authentication.getName();
			user1 = user1Dao.getEmail(currusername);
			cart = user1.getCart();
			product=null;
			cartItems = cartItemDao.getlist(cart.getCart_id());
			if(cartItems==null || cartItems.isEmpty())
			{
				return "redirect:/viewcart";
			}
			else
			{
				billingAddress = billingAddressDao.get(user1.getUid());
				List<Shippingaddress> shippingaddresies = shippingaddressDao.getAddByUser1(user1.getUid());
				
				model.addAttribute("billing", billingAddress);
				model.addAttribute("user", user1);
				model.addAttribute("shippingaddresies", shippingaddresies);
				model.addAttribute("shippingaddress", new Shippingaddress());
				session.setAttribute("p", product);
			}
			return "addressorder";
		} else {
			return "redirect:/";
		}

	}

	@RequestMapping("/Buy/{product_id}/{cartitem_id}")
	public String order(@PathVariable("product_id") String id, Model model,HttpSession session) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currusername = authentication.getName();
			user1 = user1Dao.getEmail(currusername);
			cart = user1.getCart();
			cartItem=null;
			product = productDao.get(id);
			billingAddress = billingAddressDao.get(user1.getUid());
			List<Shippingaddress> shippingaddresies = shippingaddressDao.getAddByUser1(user1.getUid());
			
			model.addAttribute("billingAddress", billingAddress);
			model.addAttribute("user1", user1);
			model.addAttribute("shippingaddresies", shippingaddresies);
			model.addAttribute("shippingaddress", new Shippingaddress());
			session.setAttribute("p", product);
			return "addressorder";
		} else {
			return "redirect:/";
		}

	}

	@RequestMapping("/orderConfirm")
	public String payment(@ModelAttribute("shippingAddress") Shippingaddress sh, Model model) {
//		if(cartItems==null || cartItems.isEmpty())
//		{
//			System.out.println("sorry");
//		}
		sh.setUser1(user1);
		shippingaddress = sh;
		model.addAttribute("billingAddress", billingAddress);
		model.addAttribute("shippingaddress", shippingaddress);
		model.addAttribute("prot", product);
		model.addAttribute("cartItems",cartItems);
		model.addAttribute("cart",cart);
		return "orderconfirm";
	}

	@RequestMapping("/previous")
	public String previous(Model model) {
		List<Shippingaddress> shippingAddresies = shippingaddressDao.getAddByUser1(user1.getUid());
		model.addAttribute("shippingAddresies", shippingAddresies);
		model.addAttribute("billingAddress", billingAddress);
		model.addAttribute("shippingaddress", shippingaddress);
		model.addAttribute("product", product);
		
		return "addressorder";
	}

	@RequestMapping("/pay")
	public String pay(Model model) {
//		List<Card> cards = cardDao.getcardbyuser(user1.getUid());
//		model.addAttribute("cards", cards);
//		model.addAttribute("card", new Card());
		return "Payment";
	}

	@RequestMapping("/payment")
	public String payment(@RequestParam("payb") String str, @RequestParam("otp")String otp, @ModelAttribute("card")Card c, Model model) {
				
 		System.out.println(1324);
		int a;
		System.out.println(str);
				
		if (str.equalsIgnoreCase("Start Subscription")) {
			a = 2;
		} else {
			a = Integer.parseInt(str);
		}
		System.out.println(a);
		
		switch (a) {
		case 1:
				if(otp.equals(o))
				{
					pay.setPayment_method("COD");
					pay.setPayment_status("no");
				}
				else
				{
					return "redirect:/pay";
				}
			 
			break;
		case 2:
			pay.setPayment_method("card");
			pay.setPayment_status("yes");
			payDao.saveupdate(pay);
			cardDao.saveupdate(c);

			break;
		case 3:
			pay.setPayment_method("Internet Banking");
			pay.setPayment_status("yes");

		}

		return "redirect:/orderconfirmation";
	}

	@RequestMapping("/orderconfirmation")
	public String orderconformation(HttpSession session) {
		System.out.println(32);
		order.setBillingAddress(billingAddress);
		order.setShippingaddress(shippingaddress);
		order.setPay(pay);
		order.setUser1(user1);
		System.out.println(524);
		if (cartItems == null || cartItems.isEmpty()) 
		{
			order.setGrandtotal(product.getProduct_price());
			orderDao.saveupdate(order);
			orderItems.setOrder(order);
			orderItems.setP_id(product.getProduct_id());
			orderItemsDao.saveupdate(orderItems);
			cart.setGrandtotal(cart.getGrandtotal() - cartItem.getPrice());
			cart.setTotal_items(cart.getTotal_items() - 1);
			
			
			session.setAttribute("items", cart.getTotal_items());
			cartDao.saveupdate(cart);
			cartItemDao.delete(cartItemDao.getlistall(cart.getCart_id(),product.getProduct_id()).getCartitem_id());
			System.out.println(324);
		}
		else
		{ 
			System.out.println(656);
			order.setGrandtotal(cart.getGrandtotal());
			orderDao.saveupdate(order);
			for(CartItem c:cartItems)
			{
				System.out.println(3444);
				orderItems.setOrder(order);
				orderItems.setP_id(c.getProduct().getProduct_id());
				System.out.println(3443);
				orderItemsDao.saveupdate(orderItems);
				cartItemDao.delete(c.getCartitem_id());
			}
			cart.setGrandtotal(0.0);
			cart.setTotal_items(0);
			System.out.println(346);
			session.setAttribute("items", cart.getTotal_items());
			cartDao.saveupdate(cart);
		}
		cartItems=null;
		cartItem=null;
		product=null;
		order=new Order();
		orderItems=new OrderItems();
		System.out.println(565);
		return "thankyou";
	}

@RequestMapping(value="/SendMail")
public void SendMail() {
	System.out.println(21312);
Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
if (!(authentication instanceof AnonymousAuthenticationToken)) {
	String currusername = authentication.getName();
	user1 = user1Dao.getEmail(currusername);      
	Otpganarater ot=new Otpganarater();
//	String o=ot.Otpga();
	o=ot.Otpga();
	String recipientAddress = user1.getEmail();
	
	String subject="OTP";
//String subject = request.getParameter("subject");
String message = "your one time password is "+o+" ";

// prints debug info
System.out.println("To:" + recipientAddress);
System.out.println("Subject: " + subject);
System.out.println("Message: " + message);

    
//System.out.println("OTP:"+ otp);
// creates a simple e-mail object
SimpleMailMessage email = new SimpleMailMessage();
email.setTo(recipientAddress);
email.setSubject(subject);
email.setText(message);
//email.setSubject(otp);
// sends the e-mail

mailSender.send(email);

 
// forwards to the view named "Result"
//return "Result";
}
}
}