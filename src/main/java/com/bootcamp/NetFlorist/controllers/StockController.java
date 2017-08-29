package com.bootcamp.NetFlorist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.NetFlorist.Entitites.Stock;
import com.bootcamp.NetFlorist.Entitites.Stock;
import com.bootcamp.NetFlorist.services.StockService;
import com.bootcamp.NetFlorist.services.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService stockService;

	@RequestMapping( method=RequestMethod.GET,  value="/stocks")
	
	public List<Stock>  bankNames()
	{
		
	List <Stock>allStocks=	stockService.getAllStock();
	
		return allStocks;
	}
	

	@RequestMapping( method = RequestMethod.POST, value ="/saveStock")
	public  void  postStock(@RequestBody Stock stock)
	{
		stockService.AddStock(stock);
	}
	

	
	@RequestMapping( method = RequestMethod.DELETE, value ="/deleteStock/{id}")
	public  void  deleteStock(@PathVariable int id)
	{
		stockService.deleteStock(id);
	}
	
	@RequestMapping( method = RequestMethod.PUT, value ="/updateStock/{id}")
	public  void  updateStock(@PathVariable int id)
	{
		stockService.deleteStock(id);
	}
	
	
	@RequestMapping( method = RequestMethod.GET, value ="/getStock/{id}")
	public  Stock  getStock(@PathVariable int id)
	{
		return  stockService.getStock(id);
	}

}
