package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.DriverRepositry;
import com.example.demo.entities.Drivers;

@Controller
@RequestMapping("/drivers")
public class DriverController {

	@Autowired
	DriverRepositry driverRepo;
	
//	@GetMapping("")
//	public String displayOders(Model model) {
//		List<Drivers> drivers = driverRepo.findAll();
//		model.addAttribute("DriverList", drivers);
//		return "redirect:/drivers";
//	};
	
	@GetMapping("/new")
	public String addNewDriver(Model model) {
		model.addAttribute("driver", new Drivers());
		return "";
	}
	
	
}
