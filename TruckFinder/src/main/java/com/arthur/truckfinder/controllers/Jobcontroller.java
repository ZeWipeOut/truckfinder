package com.arthur.truckproject.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.arthur.truckproject.models.Job;
import com.arthur.truckproject.models.User;
import com.arthur.truckproject.services.JobService;
import com.arthur.truckproject.services.UserService;

@Controller
public class Jobcontroller {
	
	@Autowired
	JobService jobService;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/jobs/new")
	public String createJob(@ModelAttribute("job")Job job, Model model) {
		return "newjob.jsp";
	}
	
	@PostMapping("/jobs/new")
	public String createJobProcess(@Valid @ModelAttribute("job")Job job, BindingResult result, Model model, HttpSession session) {
		if(result.hasErrors()) {
			return "newjob.jsp";
		} else {
			Long id = (Long)session.getAttribute("userID");
			User loginUser = userService.getOne(id);
			jobService.createJob(job);
			return "redirect:/home";
		}
	}
	
	@GetMapping("/job/{id}")
	public String showOneJob(@PathVariable("id")Long id, Model model) {
		Job job = jobService.findJob(id);
		model.addAttribute("job",job);
		return "oneJob.jsp";
	}
	
	@GetMapping("/job/edit/{id}")
	public String editJob(@PathVariable("id")Long id, Model model) {
		Job job = jobService.findJob(id);
		model.addAttribute("job",job);
		return "editJob.jsp";
	}
	
	@PutMapping("/job/edit/{id}")
	public String processEditForm(@Valid @ModelAttribute("job")Job job, BindingResult result, @PathVariable("id")Long id) {
	if(result.hasErrors()) {
		return "editShow.jsp";
	} else {
		jobService.updateJob(id, job);
		return "redirect:/home";
		}
	}
	
	@DeleteMapping("/job/delete/{id}")
	public String processDeleteJob(@PathVariable("id")Long id) {
		jobService.deleteJob(id);
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String dashBoard(Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		
		Job newJob = new Job();
		model.addAttribute("user", userService.getOne((long)session.getAttribute("userId")));
		model.addAttribute("newJob", newJob);
		List<Job> jobs = jobService.allJobs();
		model.addAttribute("jobs", jobs);
		return "dashboard.jsp";
	}
	
	@PostMapping("/home")
	public String processDashBoard(@Valid @ModelAttribute("newJob")Job newJob, BindingResult result,
			Model model, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		if(result.hasErrors()) {
			List<Job> job = jobService.allJobs();
			model.addAttribute("jobs", job);
			return "dashboard.jsp";
		} else {
			jobService.createJob(newJob);
			return "redirect:/";
		}
	}
	
	
}
