package com.bootcamp.NetFlorist.Entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "orders")
public class Order {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column (name ="order_number")
	private  String   order_number;
	
	@Column (name ="firstname")
	private  String  firstname;
	
	@Column (name ="lastname")
	private  String lastname;
	
	@Column (name ="email")
	private  String  email;
	
	@Column (name ="contact_number")
	private String contact_number;
	
	@Column (name ="product_name")
	private  String product_name;
	
	@Column (name ="delivery_status")
	private   String  delivery_status;
	
	@Column (name ="date_created")
	private  String date_created;
	
	
	public  Order()
	{
		
	}


	public Order(String order_number, String firstname, String lastname, String email, String contact_number,
			String product_name, String delivery_status, String date_created) {
		super();
		this.order_number = order_number;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contact_number = contact_number;
		this.product_name = product_name;
		this.delivery_status = delivery_status;
		this.date_created = date_created;
	}


	public String getOrderNumer() {
		return order_number;
	}


	public void setOrderNumer(String order_number) {
		this.order_number = order_number;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact_number() {
		return contact_number;
	}


	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public String getDelivery_status() {
		return delivery_status;
	}


	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}


	public String getDate_created() {
		return date_created;
	}


	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	
	
	

}
