package com.arthur.truckfinder.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="locations")
public class Location {
	// Automatically generated/incremented ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Location role (0 = pickup, 1 = destination)
	@NotNull
	private Integer role;
	
	// Company name of location
	@NotEmpty
	private String company;
	
	// Contact name
	@NotEmpty
	private String contact;
	
	// Additional contact info (can be empty?)
	private String addInfo;
	
	// Address fields
	@NotEmpty(message="Address is required")
	private String address;
	@NotEmpty(message="City is required")
	private String city;
	// should we do a dropdown for state?
	@NotNull
	private String state;
	@NotEmpty(message="ZIP code is required")
	private Integer zip;
	
	// Internally managed created/updated at timestamps
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
	
    // Many to many relationship with jobs
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "job_locations",
    		joinColumns = @JoinColumn(name="location_id"),
    		inverseJoinColumns = @JoinColumn(name="job_id")
    	)
    List<Job> jobs;
    
    // Empty constructor
    public Location() {}
    
    // Getters/setters
	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddInfo() {
		return addInfo;
	}

	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	// Auto-managed create/update
    @PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
}
