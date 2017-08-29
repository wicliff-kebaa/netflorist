package com.bootcamp.NetFlorist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.bootcamp.NetFlorist.Entitites.Person;

import com.bootcamp.NetFlorist.services.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping( method=RequestMethod.GET,  value="/people")
	
	public List<Person> getPeople()
	{
		
		List <Person>people=	personService.getAllPeople();
		return people;
	}
	
	@RequestMapping( method=RequestMethod.POST,  value="/addPerson")
	public  void addPerson(@RequestBody Person person)
	{
		personService.addPerson(person);
	}
	
	
	@RequestMapping(value ="/person/{email}", method = RequestMethod.GET)
	public  Person   getPerson(@PathVariable String email)
	{
		return personService.getPerson(email);
	}
	
	@RequestMapping(value ="/person/{email}", method = RequestMethod.PUT)
	public void  updatePerson(@RequestBody Person person,@PathVariable String email)
	{
		personService.updatePerson(person);
	}
	
	@RequestMapping(value ="/person/{email},{password}", method = RequestMethod.PUT)
	public void  updatePassword(@RequestBody Person person,@PathVariable String email,@PathVariable String password)
	{
		person =getPerson(email);
		updatePerson(person, email);
	}
	
	@RequestMapping(value ="/del_person/{email}", method = RequestMethod.DELETE)
	public    void  deletePerson(@PathVariable String  email)
	{
		personService.deletePerson(email);
	}

	
//	@RequestMapping(value ="/login", method = RequestMethod.GET )
//	public List<Profile>   login(@RequestParam String  email,@RequestParam String password)
//	{
//		return  profileService.authicateUser(email, password);
//	}
	
	
	@RequestMapping(value ="/userlogin", method = RequestMethod.GET )
	public List<Person>   login(@RequestParam String  email,@RequestParam String password)
	{
		return  personService.authicateUser(email, password);
	}
	
	
}
