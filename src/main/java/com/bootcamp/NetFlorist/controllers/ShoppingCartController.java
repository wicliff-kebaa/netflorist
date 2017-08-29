package com.bootcamp.NetFlorist.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.NetFlorist.Entitites.ShoppingCart;
import com.bootcamp.NetFlorist.Entitites.ShoppingCart;
import com.bootcamp.NetFlorist.services.ShoppingCartService;

@RestController
public class ShoppingCartController
{
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	
	@RequestMapping( method=RequestMethod.GET,  value="/shoppingCarts")
	
	public List<ShoppingCart>  shoppingCarts()
	{
		
	 List <ShoppingCart>allShoppingCart=shoppingCartService.getAllShoppingCarts();
	 return allShoppingCart;
	}
	

	@RequestMapping( method = RequestMethod.POST, value ="/addshoppingCart")
	public  void  postShoppingCart(@RequestBody ShoppingCart ShoppingCart)
	{
		shoppingCartService.AddShoppingcart(ShoppingCart);
	}
	

	
	@RequestMapping( method = RequestMethod.DELETE, value ="/deleteShoppingCart/{id}")
	public  void  deleteShoppingCart(@PathVariable int id)
	{
		shoppingCartService.deleteShoppingcart(id);
	}
	
	@RequestMapping( method = RequestMethod.PUT, value ="/updateshoppingCart/{id}")
	public  void  updateShoppingCart(@PathVariable int id)
	{
		//shoppingCartService.updateShoppingcart(shoppingCart);
	}
	
	
	@RequestMapping( method = RequestMethod.GET, value ="/getShoppingCart/{id}")
	public  ShoppingCart  getShoppingCart(@PathVariable int id)
	{
		return  shoppingCartService.getShoppingcart(id);
	}
	
	
	

}
