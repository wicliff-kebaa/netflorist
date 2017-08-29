package com.bootcamp.NetFlorist.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bootcamp.NetFlorist.repository.PersonRepository;
import com.bootcamp.NetFlorist.Entitites.Person;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepo;
	
	
	public List <Person>   getAllPeople()
	{
		
		List <Person> people = new ArrayList<> ();  
		personRepo.findAll().forEach(people::add);
		return people;
	}
	
	public  void addPerson(Person person)
	{
		
		personRepo.save(new Person(person.getEmail(),person.getFirstname(),person.getLastname(),person.getGender(),person.getCellphone(),person.getRole(),person.getPassword()));
	}
	
	
	public Person   getPerson(String email)
	{
		return personRepo.findOne(email);
	}
	
	public  void updatePassword(Person person,String email,String newPassword)
	{
		person= getPerson(email);
		person.setPassword(newPassword);
		updatePerson(person);
		
	}
	
	
	public  void  updatePerson(Person person)
	{
		personRepo.save(person);
	}
	
	public  void  deleteAll()
	{
		personRepo.deleteAll();
	}
	
	public   void   deletePerson(String  email)
	{
		personRepo.delete(email);
	}
	
	public   void  deletePerso(Person person)
	{
		personRepo.delete(person);
	}
	
	
	public  List<Person>  authicateUser(String email,String password)
	{
				
		List<Person> profiles=personRepo.findByEmailAndPassword(email, password);
		return  profiles;
	}
	
	
}
