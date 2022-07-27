package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Orders;

public interface OrderRepositry extends CrudRepository<Orders, Long> {
	
	@Override
	public List<Orders> findAll(); 
}
