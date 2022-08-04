package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DriverRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.entities.Drivers;
import com.example.demo.entities.Orders;

@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	DriverRepository driverRepo;
	@Autowired
	OrderRepository orderRepo;
	
	@GetMapping("")
	public String displayOrders(Model model) {
		List<Orders> orders = orderRepo.findAll();
		model.addAttribute("ordersList", orders);
		
		return "manager/order-list";
	}
	
//	@GetMapping("/assign/{id}")
//	public String chooseDriverForm(@PathVariable Long id, Model model) {
//		List<Drivers> drivers = driverRepo.findAll();
//		model.addAttribute("driverList", drivers);
//		
//		Orders order = orderRepo.findByOrderId(id);
//		model.addAttribute("eachOrder", order);
//		return "manager/driver-assign-test";
//	}
	
//	@PostMapping("/edit")
//	public String assignDriver(Orders order) {
//		orderRepo.save(order);
//		return "redirect:/manager";
//	}
	
	@PutMapping("/edit/{id}")
	public String assignDriver(@PathVariable Long id, @ModelAttribute Orders order) {
		order.setOrderId(id);
		orderRepo.save(order);
		
		return "redirect:/manager";
	}
	
}



