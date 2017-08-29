package com.bootcamp.NetFlorist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.NetFlorist.Entitites.Account;
import com.bootcamp.NetFlorist.Entitites.Stock;

import com.bootcamp.NetFlorist.repository.StockRepo;

@Service
public class StockService
{
	@Autowired
	private StockRepo stockRepo;
	
	public List<Stock> getAllStock()
	{
		List<Stock> accounts= new ArrayList<>();
		stockRepo.findAll().forEach(accounts::add);
		return accounts;
	}
	
	public void AddStock(Stock stock)
	{
		
		stockRepo.save(new  Stock(stock.getName(),stock.getQuantity(),stock.getDescription(),stock.getPrice()));
	}
	
	public void  updateStockt(Stock stock)
	{
		stockRepo.save(stock);
	}
	
	public Stock getStock(int id)
	{
		 return stockRepo.findOne(id);
	}
	
	public void deleteStock(int id)
	{
		stockRepo.delete(id);
	}
	public void deleteAllStock()
	{
		stockRepo.deleteAll();;
	}
	

}
