package com.bootcamp.NetFlorist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.NetFlorist.Entitites.Customer;

import com.bootcamp.NetFlorist.repository.CustomerRepo;

@Service
public class CustServ {
	
	@Autowired
	private CustomerRepo custo;
	
	
	public List<Customer> getAllCustomer()
	{
		List<Customer> customers= new ArrayList<>();
		custo.findAll().forEach(customers::add);
		return customers;
	}
	
	public void AddCustomer(Customer customer)
	{
		custo.save(customer);
	}
	
	public void  updateAccount(Customer customer)
	{
		custo.save(customer);
	}
	
	public Customer getCustomer(String email)
	{
		 return custo.findOne(email);
	}
	
	public void deleteCustomer(String  email)
	{
		custo.delete(email);
	}
	
	public void  deleteAllCustomer()
	{
		custo.deleteAll();
	}
	

}
