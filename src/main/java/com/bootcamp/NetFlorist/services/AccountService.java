package com.bootcamp.NetFlorist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.bootcamp.NetFlorist.Entitites.Account;
import com.bootcamp.NetFlorist.repository.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public List<Account> getAllAccounts()
	{
		List<Account> accounts= new ArrayList<>();
		accountRepository.findAll().forEach(accounts::add);
		return accounts;
	}
	
	public String getAllAccountsString()
	{
		
		return accountRepository.findAll().toString();
	}
	
	
	
	public void AddAccount(Account account)
	{
		accountRepository.save(account);
	}
	
	public void  updateAccount(Account account)
	{
		accountRepository.save(account);
	}
	
	public Account getAccount(int id)
	{
		 return accountRepository.findOne(id);
	}
	
	public void deleteAccount(int id)
	{
		accountRepository.delete(id);
	}
	public void deleteAllAccounts()
	{
		accountRepository.deleteAll();;
	}
	

}
