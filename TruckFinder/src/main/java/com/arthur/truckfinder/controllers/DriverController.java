package com.arthur.truckfinder.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.arthur.truckfinder.services.UserService;

@Controller
public class DriverController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/driver/dashboard")
	public String driverDash(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		
		model.addAttribute("user", userService.getOne(long)session.getAttribute("userId")));
	}
	
	@GetMapping("/driver/search")
	public String driverSearch(Model model, HttpSession session) {
		return null;
		
	}
	
	@GetMapping("/driver/job/show")
	public String showjob(Model model, HttpSession session) {
		return "showonejob.jsp";
		
	}
	
}
