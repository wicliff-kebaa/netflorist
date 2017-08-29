package com.bootcamp.NetFlorist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bootcamp.NetFlorist.Entitites.Account;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.NetFlorist.services.AccountService;



@RestController
public class AccountController
{
		@Autowired
		private AccountService accountService;
	
		@RequestMapping( method=RequestMethod.GET,  value="/accounts")
		
		public List<Account>  bankNames()
		{
			
		List <Account>allAccount=	accountService.getAllAccounts();
		String username= "";
		for(Account acc:allAccount)
		{
			username=username+ " " + acc.getBank_name();
		}
		
			return allAccount;
		}
		

		@RequestMapping( method = RequestMethod.POST, value ="/saveAcccount")
		public  void  postAccount(@RequestBody Account account)
		{
			accountService.AddAccount(account);
		}
		
	
		
		@RequestMapping( method = RequestMethod.DELETE, value ="/deleteAcccount/{id}")
		public  void  deleteAccount(@PathVariable int id)
		{
			accountService.deleteAccount(id);
		}
		
		@RequestMapping( method = RequestMethod.PUT, value ="/updateAcccount/{id}")
		public  void  updateAccount(@PathVariable int id)
		{
			accountService.deleteAccount(id);
		}
		
		
		@RequestMapping( method = RequestMethod.GET, value ="/getAcccount/{id}")
		public  Account  getAccount(@PathVariable int id)
		{
			return  accountService.getAccount(id);
		}
}
