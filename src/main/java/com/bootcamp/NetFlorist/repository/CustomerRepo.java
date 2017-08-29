package com.bootcamp.NetFlorist.repository;

import org.springframework.data.repository.CrudRepository;

import com.bootcamp.NetFlorist.Entitites.Customer;



public interface CustomerRepo extends CrudRepository<Customer, String> {
	
	

}
