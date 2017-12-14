package com.niit.mecakesfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.Supplier1Dao;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.Supplier1;


@Controller
public class SupplierController 
{
	@Autowired
	Supplier1 supplier1;
	@Autowired
	Supplier1Dao supplier1Dao;
	@Autowired
	ProductDao  productDao;
	
	@RequestMapping("/supplier")
	public ModelAndView supplierpage()
	{
		ModelAndView obj=new ModelAndView("q3");
		obj.addObject("supplier", new Supplier1());
		List<Supplier1> ls=supplier1Dao.list();
		obj.addObject("suppliers", ls);
		return obj;
	}
	@RequestMapping(value="/addsup",method=RequestMethod.POST)
	public ModelAndView addsup(@ModelAttribute("supplier")Supplier1 supplier1)
	{
		ModelAndView obj= new ModelAndView("redirect:/supplier");
		if(supplier1Dao.saveupdate(supplier1)==true)
		{
			obj.addObject("msg", "Supplier added successfully");
		}
		else
		{
			obj.addObject("msg1", "Supplier1 not added");
		}
		return obj;
	}
	@RequestMapping("/editSupplier/{sid}")
	public ModelAndView editsup(@PathVariable("sid")String sid)
	{
		ModelAndView obj=new ModelAndView("q3");
		supplier1=supplier1Dao.get(sid);
		List<Supplier1> ls1=supplier1Dao.list();
		obj.addObject("suppliers", ls1);
		obj.addObject("supplier", supplier1);
		return obj;
	}
	@RequestMapping("/deleteSupplier/{sid}")
	public ModelAndView deletesup(@PathVariable("sid")String sid)
	{
		ModelAndView obj=new ModelAndView("redirect:/supplier");
		supplier1=supplier1Dao.get(sid);
		List<Product> ls2=productDao.getProductBySupplier1("supplier1");
		if(ls2==null||ls2.isEmpty())
		{
			supplier1Dao.delete(supplier1);
			obj.addObject("msg", "supplier deleted successfully");
		}
		else
		{
			for(Product p:ls2)
			{
				productDao.delete(p);
			}
			supplier1Dao.delete(supplier1);
			obj.addObject("msg1", "supplier not deleted");
		}
		return obj;
		
	}

	
}
