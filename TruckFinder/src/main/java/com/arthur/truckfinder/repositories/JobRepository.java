package com.arthur.truckfinder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arthur.truckfinder.models.Job;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {
	List<Job> findAllByUserId(Long id);
	List<Job> findAll();
}