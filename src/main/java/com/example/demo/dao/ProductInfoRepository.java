package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Orders;
import com.example.demo.entities.ProductsInfo;

public interface ProductInfoRepository extends CrudRepository<ProductsInfo, Long> {

	@Override
	public List<ProductsInfo> findAll();
	
	
	
	
}
