package com.niit.mecakesfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.category1;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.category1Dao;

@Controller
public class CategoryController
{

	@Autowired
	category1 category1;
	@Autowired
	category1Dao category1Dao;
	@Autowired
	ProductDao  productDao;
	
	
	@RequestMapping("/category")
	public ModelAndView categorypage()
	{
		ModelAndView obj=new ModelAndView("q2");
		obj.addObject("category", new category1());
		List<category1> listc=category1Dao.list();
		obj.addObject("categories", listc);
		return obj;
	}
	
	@RequestMapping(value="/addcat",method=RequestMethod.POST)
	public ModelAndView addcat(@ModelAttribute("category")category1 category1)
	{
		ModelAndView obj= new ModelAndView("redirect:/category");
		if(category1Dao.saveupdate(category1)==true)
		{
			obj.addObject("msg", "category added successfully");
		}
		else
		{
			obj.addObject("msg1", "category not added");
		}
		return obj;
	}
	
	@RequestMapping("/editcategory/{cid}")
	public ModelAndView editcat(@PathVariable("cid")String cid)
	{
		ModelAndView obj=new ModelAndView("q2");
		category1=category1Dao.get(cid);
		List<category1> lc1=category1Dao.list();
		obj.addObject("categories", lc1);
		obj.addObject("category", category1);
		return obj;
	}
	
	@RequestMapping("/deletecategory/{cid}")
	public ModelAndView deletecat(@PathVariable("cid")String cid)
	{
		ModelAndView obj=new ModelAndView("redirect:/category");
		category1=category1Dao.get(cid);
		List<Product> lc1=productDao.getProductByCategory("category1");
		if(lc1==null||lc1.isEmpty())
		{
			category1Dao.delete(category1);
			obj.addObject("msg", "category deleted successfully");
		}
		else
		{
			for(Product p:lc1)
			{
				productDao.delete(p);
			}
			category1Dao.delete(category1);
			obj.addObject("msg1", "category not deleted");
		}
		return obj;
		
	}
}
