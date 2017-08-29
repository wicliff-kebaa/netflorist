package com.bootcamp.NetFlorist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.NetFlorist.Entitites.Account;

@Repository
public interface AccountRepository  extends CrudRepository<Account,Integer>{

}
