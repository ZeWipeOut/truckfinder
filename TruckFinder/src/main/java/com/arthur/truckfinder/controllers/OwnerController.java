package com.arthur.truckfinder.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {
	
	@Autowired
	private OwnerService ownerService;
	
	@GetMapping("/owner/dashboard")
	public String ownerDash(Model model, HttpSession session) {
		
	}
	
	@GetMapping("/owner/previous")
	public String prevJobs(Model model, HttpSession session) {
		
	}
}
