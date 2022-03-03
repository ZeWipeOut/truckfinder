package com.arthur.truckfinder.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.truckfinder.models.Job;
import com.arthur.truckfinder.repositories.JobRepository;

@Service
public class JobService {
	@Autowired
	private JobRepository jobRepo;
	
	public List<Job> allJobs() {
		return jobRepo.findAll();
	}
	
	public List<Job> allJobsByUser(Long id) {
		return jobRepo.findAllByUserId(id);
	}
	
	// Function to fetch only the jobs that aren't taken, will work on later
	/* public List<Job> openJobs() {
		
	} */
	
	// validations to add?
	public Job createJob(Job j) {
		return jobRepo.save(j);
	}
	
	public Job findJob(Long id) {
		Optional<Job> potentialJob = jobRepo.findById(id);
		return potentialJob.isPresent() ? potentialJob.get() : null;
	}
	
	public Job updateJob(Long id, Job j) {
		Optional<Job> potentialJob = jobRepo.findById(id);
		if (potentialJob.isEmpty())
			return null;
		Job job = potentialJob.get();
		job.setWeight(j.getWeight());
		job.setPallets(j.getPallets());
		job.setDescription(j.getDescription());
		job.setTrailer(j.getTrailer());
		return jobRepo.save(job);
	}
	
	public void deleteJob(Long id) {
		jobRepo.deleteById(id);
	}
}
