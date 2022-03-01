package com.arthur.truckfinder.repositories;

import java.sql.Driver;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {
	List<Driver> findAll();
}
