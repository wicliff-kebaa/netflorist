package com.bootcamp.NetFlorist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bootcamp.NetFlorist.Entitites.Customer;
import com.bootcamp.NetFlorist.services.CustServ;

@RestController
public class CustController {

	@Autowired
	private  CustServ custServ; 
	
	
	@RequestMapping( method=RequestMethod.GET,  value="/customers")
	
	public List<Customer>  bankNames()
	{
		
	List <Customer>customers=	custServ.getAllCustomer();
	
	
	return customers;
	}
	
	@RequestMapping( value ="/customer/{email}")
	public  Customer  getCustomer(@PathVariable  String email)
	{
		return  custServ.getCustomer(email);
	}
	
}
