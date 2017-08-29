package com.bootcamp.NetFlorist.Entitites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="shopping_cart")
public class ShoppingCart implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column (name ="id")
	private int id;
	
	@Column (name ="product_ID",nullable=false)
	private int productID;
	
	@Column (name ="product_name",nullable=false)
	private String name;
	
	@Column (name ="product_price",nullable=false)	
	private String price;
	
	@Column (name ="date_created",nullable=false)	
	private String date_created;
	
	 public ShoppingCart()
	 {
		
	 }
	
	public ShoppingCart(int productID, String name, String price, String date_created) {
		
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.date_created = date_created;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	
	
	
}
