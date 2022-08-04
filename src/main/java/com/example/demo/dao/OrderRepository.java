package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Customers;
import com.example.demo.entities.Drivers;
import com.example.demo.entities.Orders;
import com.example.demo.entities.ProductsInfo;

public interface OrderRepository extends CrudRepository<Orders, Long> {

	@Override
	public List<Orders> findAll(); 
	
	public Orders findByOrderId(Long id);
	
	public List<Orders> findByDriverRel(Drivers driver);

//	public Customers findByCustomer(Customers user);

	
	
	
}
