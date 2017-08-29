package com.bootcamp.NetFlorist.Entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="person")
public class Person {
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Id
	@Column (name ="email")
	private String email;
	
	@Column (name ="firstname",nullable=false)
	private String firstname;
	
	@Column (name ="lastname", nullable=false)
	private String lastname;
		
	@Column (name ="gender", nullable=false)
	private String gender;
	
	@Column (name ="cellphone", nullable=false)
	private String cellphone;
	
	@Column (name ="role", nullable=false)
	private String role;
	
	public Person()
	{
		
	}
	
	
	public Person(String email, String firstname, String lastname, String gender, String cellphone, String role,
			String password) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.cellphone = cellphone;
		this.role = role;
		this.password = password;
	}


	@Column (name ="password", nullable=false)
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
