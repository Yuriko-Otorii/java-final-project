package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Drivers;
import com.example.demo.entities.Orders;

public interface DriverRepository extends CrudRepository<Drivers, Long> {
	@Override
	public List<Drivers> findAll(); 
	
//	public List<Drivers> findByDriverId(Long id);
	
	public Drivers findByDriverId(Long id);
}

