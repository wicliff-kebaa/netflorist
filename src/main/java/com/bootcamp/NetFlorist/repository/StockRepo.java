package com.bootcamp.NetFlorist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.NetFlorist.Entitites.Stock;


@Repository
public interface StockRepo extends  CrudRepository<Stock,Integer> {

}
