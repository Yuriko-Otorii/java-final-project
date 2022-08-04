package com.example.demo.controllers;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.dao.ProductInfoRepository;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Orders;
import com.example.demo.entities.ProductsInfo;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	OrderRepository orderRepo;
	@Autowired
	CustomerRepository customerRepo;
	@Autowired
	ProductInfoRepository productInfoRepo;
	
	private Customers customerObj;
	
//	@GetMapping("")
//	public String customerHomePage(Model model) {
//		List<Customers> customers = customerRepo.findAll();
//		model.addAttribute("customerList", customers);
//		return "customer/customer-list";
//	}
	
	@GetMapping("")
	public String registrationPage(Model model) {
		model.addAttribute("customer", new Customers());
		return "customer/registration";
	}
	
	@PostMapping("/save")
	public String saveOrder(Customers customer) {
		customerObj = customerRepo.save(customer);
		Long customerId = customerObj.getCustomerId();
		
		return "redirect:/order?user="+customerId;
	}
	
	
	
	
	
}
