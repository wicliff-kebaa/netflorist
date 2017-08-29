package com.bootcamp.NetFlorist.Entitites;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "account")
public class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column (name ="id")
	private int id;
	
	@Column (name ="account_holder", nullable=false)
	private String acc_holder;
	
	@Column (name ="account_number", nullable=false)
	private String acc_number;
			
	@Column (name ="bank",nullable=false)
	private String bank_name;
	
	@Column (name ="account_type",nullable=false)
	private String acc_type;
	
	@Column (name ="balance",nullable=false)
	private int balance;
	
	public Account()
	{
		
	}
	

	public Account(String acc_holder, String acc_number,String bank_name, String acc_type,  int balance) {
		
		this.acc_holder = acc_holder;
		this.acc_number = acc_number;
		this.acc_type = acc_type;
		this.bank_name = bank_name;
		this.balance = balance;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcc_holder() {
		return acc_holder;
	}

	public void setAcc_holder(String acc_holder) {
		this.acc_holder = acc_holder;
	}

	public String getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
