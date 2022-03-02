package com.arthur.truckfinder.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arthur.truckfinder.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
	List<Location> findAllByJobId(Long id);
}
