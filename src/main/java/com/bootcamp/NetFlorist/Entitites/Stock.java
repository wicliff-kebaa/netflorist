package com.bootcamp.NetFlorist.Entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "stock")
public class Stock {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column (name ="id")
	private int id;
	
	@Column (name ="name")
	private String name;
	
	@Column (name ="quantity")
	private int quantity;
	
	@Column (name ="description")
	private String description;
	
	@Column (name ="price")
	private int price;

	public Stock(String name, int quantity, String description, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public   Stock()
	{
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
