package com.example.demo.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.OrderRepository;
import com.example.demo.dao.ProductInfoRepository;
import com.example.demo.entities.Customers;
import com.example.demo.entities.Orders;
import com.example.demo.entities.ProductsInfo;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	ProductInfoRepository productInfoRepo; 
	
	@GetMapping("")
	public String orderPage(Model model, @PathParam("user") Long user) {
		List<ProductsInfo> products = productInfoRepo.findAll();
		model.addAttribute("productList", products);
		model.addAttribute("user", user);
		Customers customer = customerRepo.findByCustomerId(user);
		model.addAttribute("eachCustomer", customer);
		
		model.addAttribute("order", new Orders());
		
		return "order/order-page";
		
	}
	
	@PostMapping("/save")
	public String saveOrder(Orders order) {
		orderRepo.save(order);	
		return "redirect:/customer";
	}
	
}
