package com.niit.mecakesfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.fileinput.Fileinput;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.model.Product;




@Controller
public class ProductController 
{
	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	String path="C:\\Users\\AISHWARYA\\workspace\\mecakesfrontend\\src\\main\\webapp\\resources\\bckgrnd\\";
	
	@RequestMapping("/product")
	public ModelAndView productpage()
	{
		ModelAndView obj=new ModelAndView("q4");
		obj.addObject("product", new Product());
		List<Product> lp=productDao.list();
		obj.addObject("products", lp);
		return obj;
	}
	@RequestMapping(value="/addprod",method=RequestMethod.POST)
	public ModelAndView addprod(@ModelAttribute("product")Product product)
	{
		ModelAndView obj= new ModelAndView("redirect:/product");
		if(productDao.saveupdate(product)==true)
		{
			Fileinput.upload(path,product.getPbckgrnd(),product.getProduct_id()+".jpg");
			obj.addObject("msg", "product added successfully");
		}
		else
		{
			obj.addObject("msg1", "product not added");
		}
		return obj;
	}
	@RequestMapping("/editProduct/{product_id}")
	public ModelAndView editprod(@PathVariable("product_id")String pid)
	{
		ModelAndView obj=new ModelAndView("q4");
		product=productDao.get(pid);
		List<Product> lp1=productDao.list();
		obj.addObject("products", lp1);
		obj.addObject("product", product);
		return obj;
	}
	
	@RequestMapping("/deleteProduct/{product_id}")
	public ModelAndView deleteprod(@PathVariable("product_id")String pid)
	{
		ModelAndView obj=new ModelAndView("redirect:/product");
		product=productDao.get(pid);
		if(productDao.delete(product))
        {
			
			obj.addObject("msg", "product deleted successfully");
		}
		else
		{
			obj.addObject("msg1", "product not deleted");
		}
		return obj;
		
    }
	
}
