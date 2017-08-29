package com.bootcamp.NetFlorist.Entitites;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class Customer {
	
	
	@Id
	@Column (name ="email")
	private String email;
	
	@Column (name ="name",nullable=false)
	private String name;
	
	@Column (name ="surname", nullable=false)
	private String surname;
		
	@Column (name ="password", nullable=false)
	private String password;
	
	public Customer()
	{
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(String email, String name, String surname, String password) {
		super();
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.password = password;
	}
	
	
	

}
