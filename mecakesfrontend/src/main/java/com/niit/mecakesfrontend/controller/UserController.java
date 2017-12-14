package com.niit.mecakesfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.user1;
@Controller
public class UserController
{
	@Autowired
	user1 user1;
	@Autowired
	user1Dao user1Dao;
	@RequestMapping(value="/adduser",method=RequestMethod.POST)
	public ModelAndView addcat(@ModelAttribute("user1")user1 user1)
	{
		ModelAndView obj= new ModelAndView("redirect:/user");
		if(user1Dao.saveupdate(user1)==true)
		{
			obj.addObject("msg", "user added successfully");
		}
		else
		{
			obj.addObject("msg1", "user not added");
		}
		return obj;
	}
}
