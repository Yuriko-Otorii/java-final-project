package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Customers;
import com.example.demo.entities.Orders;

public interface CustomerRepository extends CrudRepository<Customers, Long> {

	@Override
	public List<Customers> findAll(); 
	
	public Customers findByCustomerId(Long user);

}
