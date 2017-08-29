package com.bootcamp.NetFlorist.controllers;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@EnableAutoConfiguration
public class MainController 
{
	@RequestMapping("/i")
	public  String index()
	{
		return "welcome";
	}
	
	@RequestMapping("/main")
	public  String landingPage()
	{
		return "main";
	}
	
	@RequestMapping("/reg")
	public  String landingPager()
	{
		return "reg";
	} 
	
	@RequestMapping("/forgot")
	public  String forgotPassword()
	{
		return "forgot";
	}
	
	@RequestMapping("/adminIndex")
	public  String indexAdmin()
	{
		return "adminindex";
	}
	
	@RequestMapping("/allproductsAdmin")
	public  String allproductsAdmin()
	{
		return "allproducts";
	}
	
	
	@RequestMapping("/addProduct")
	public  String addProduct()
	{
		return "addproduct";
	}
	
	@RequestMapping("/index")
	public  String home()
	{
		return "index";
	}
	
}
