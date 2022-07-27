package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DriverRepositry;
import com.example.demo.dao.OrderRepositry;
import com.example.demo.entities.Drivers;
import com.example.demo.entities.Orders;

@Controller
@RequestMapping("/order_driver")
public class managerPageController {

	@Autowired
	DriverRepositry driverRepo;
	OrderRepositry orderRepo;
	
	@GetMapping("")
	public String driverChoosing(Model model) {
		List<Drivers> drivers = driverRepo.findAll();
		List<Orders> orders = orderRepo.findAll();
		model.addAttribute("driversList", drivers);
		model.addAttribute("orderList", orders);
		return "redirect:/order_driver";
	}
	
	@PostMapping("/save")
	public String assignDriver() {
		return "redirect:/order_driver";
	}
	
}
