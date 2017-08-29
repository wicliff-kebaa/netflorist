package com.bootcamp.NetFlorist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bootcamp.NetFlorist.Entitites.ShoppingCart;
import com.bootcamp.NetFlorist.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {
	
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	public List<ShoppingCart> getAllShoppingCarts()
	{
		List<ShoppingCart> shoppingCarts= new ArrayList<>();
		shoppingCartRepository.findAll().forEach(shoppingCarts::add);
		return shoppingCarts;
	}
	
	public void AddShoppingcart(ShoppingCart shoppingCart)
	{
		shoppingCartRepository.save(shoppingCart);
	}
	
	public void  updateShoppingcart(ShoppingCart shoppingCart)
	{
		shoppingCartRepository.save(shoppingCart);
	}
	
	public ShoppingCart getShoppingcart(int id)
	{
		 return shoppingCartRepository.findOne(id);
	}
	
	public void deleteShoppingcart(int id)
	{
		shoppingCartRepository.delete(id);
	}
	
	public void  deleteAllShoppingcart()
	{
		shoppingCartRepository.deleteAll();
	}
	


}
