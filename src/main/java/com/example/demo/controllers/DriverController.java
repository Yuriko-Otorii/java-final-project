package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DriverRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Drivers;
import com.example.demo.entities.Orders;


@Controller
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	DriverRepository driverRepo;
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	CustomerRepository customerRepo;
	
	
	@GetMapping("")
	public String displayDrivers(Model model) {
		List<Drivers> drivers = driverRepo.findAll();
		model.addAttribute("driverList", drivers);
		return "driver/driver-list";
	}
	
	@GetMapping("/check/{id}")
	public String displayOrderInfo(@PathVariable Long id, Model model) {		
		Drivers driver = driverRepo.findByDriverId(id);
		model.addAttribute("eachDriver", driver);
		
		List<Orders> orders = orderRepo.findByDriverRel(driver);
		model.addAttribute("assignedOrders", orders);
	
		return "driver/check-order-info";
	}

}
