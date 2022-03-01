package com.arthur.truckfinder.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.arthur.truckfinder.services.DriverService;

@Controller
public class DriverController {
	
	@Autowired
	private DriverService driverService;
	
	@GetMapping("/dashboardd")
	public String dasboardd(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		return null;
		
	}
	
	@GetMapping("/inboxd")
	public String inboxd () {
		return null;
		
	} 
	
	@GetMapping("/lookatjob")
	public String lookatjob () {
		return null;
		
	}
	
	@GetMapping("/searchjobs")
	public String searchjobs() {
		return null;
		
	}
}
