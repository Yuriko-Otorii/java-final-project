package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Drivers;


public interface DriverRepositry extends CrudRepository<Drivers, Long> {
	
	@Override
	public List<Drivers> findAll(); 
}
