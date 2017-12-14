package com.niit.mecakesfrontend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.BillingAddress;
import com.niit.mecakesbackend.model.user1;


@Controller
public class HomeController 
{
	@Autowired
	user1 user1;
	
	@Autowired
	user1Dao user1Dao;
	
	
    @RequestMapping("/")
    public String homepage()
    {
	   return "mecakes";
    }
    @RequestMapping("/mecakes")
    public ModelAndView home()
    {
	   return new ModelAndView("mecakes");
    }
    @RequestMapping("/user")
	public ModelAndView userpage()
	{
		ModelAndView obj=new ModelAndView("q1");
		BillingAddress b1=new BillingAddress();
		user1 u1=new user1();
		u1.setBillingAddress(b1);
		obj.addObject("user", u1);
		List<user1> lu=user1Dao.list(); //here user1dao v have made list in user1Dao as static
		obj.addObject("users", lu);
		return obj;
	}
    @RequestMapping("/q1")
    public String user()
    {
	   return "user";
    }
    @RequestMapping("/q2")
    public String category()
    {
	   return "category";
    }
    @RequestMapping("/q3")
    public String supplier()
    {
	   return "supplier";
    }
    @RequestMapping("/q4")
    public String product()
    {
	   return "product";
    }
    @RequestMapping("/contact")
    public String contact()
    {
	   return "contact";
    }
    @RequestMapping("/flavours")
    public String flavours()
    {
	   return "flavours";
    }
   
    @RequestMapping("/portfolios")
    public String portfolios()
    {
	   return "portfolios";
    }
    @RequestMapping("/weddings")
    public String weddings()
    {
	   return "weddings";
    }
    @RequestMapping("/parties")
    public String parties()
    {
	   return "parties";
    }
    @RequestMapping("/sculptedcakes")
    public String sculptedcakes()
    {
	   return "sculptedcakes";
    }
    @RequestMapping("/pricing")
    public String pricing()
    {
	   return "pricing";
    }
    @RequestMapping("/signup")
    public String signup()
    {
	   return "signup";
    }
    
  }


