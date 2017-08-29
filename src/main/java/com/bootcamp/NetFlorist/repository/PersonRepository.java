package com.bootcamp.NetFlorist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bootcamp.NetFlorist.Entitites.Person;




public interface PersonRepository extends CrudRepository<Person,String>{
	
	 @Query("SELECT t FROM Person t where t.email = :email AND t.password = :password")
	    public List <Person> findByEmailAndPassword(@Param("email") String email, 
	                                                    @Param("password") String password);

}
