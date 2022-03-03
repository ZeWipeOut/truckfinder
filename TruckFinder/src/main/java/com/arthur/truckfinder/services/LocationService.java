package com.arthur.truckfinder.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.truckfinder.models.Location;
import com.arthur.truckfinder.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locRepo;
	
	public List<Location> findJobLocations(Long id) {
		return locRepo.findAllByJobId(id);
	}
	
	public Location createLocation(Location l) {
		return locRepo.save(l);
	}
	
	public Location updateLocation(Long id, Location l) {
		Optional<Location> potentialLoc = locRepo.findById(id);
		if (potentialLoc.isEmpty())
			return null;
		Location loc = potentialLoc.get();
		loc.setAddress(l.getAddress());
		loc.setCity(l.getCity());
		loc.setState(l.getState());
		loc.setZip(l.getZip());
		loc.setRole(l.getRole());
		loc.setCompany(l.getCompany());
		loc.setContact(l.getContact());
		loc.setAddInfo(l.getAddInfo());
		return locRepo.save(loc);
	}
	
	public void deleteLocation(Long id) {
		locRepo.deleteById(id);
	}
}