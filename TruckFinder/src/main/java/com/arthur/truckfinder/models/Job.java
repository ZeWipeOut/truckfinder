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
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="jobs")
public class Job {
	// Automatically generated/incremented ID
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Total weight of shipment
	@NotNull
	@DecimalMin(value="0.0", message="Weight must be greater than 0")
	private Double weight;
	
	// Number of pallets in shipment
	@NotNull
	@Min(value=1, message="Must have at least 1 pallet")
	private Integer pallets;
	
	// Trailer type for shipment
	@NotNull
	private String trailer;
	
	// Shipment description
	@NotNull
	private String description;
	
	// Internally managed created/updated at timestamps
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    // Many to many relationship with users
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        	name = "jobs_taken",
        	joinColumns = @JoinColumn(name="job_id"),
        	inverseJoinColumns = @JoinColumn(name="user_id")
        )
    List<User> users;
    
    // Many to many relationship with locations
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "job_locations",
    		joinColumns = @JoinColumn(name="job_id"),
    		inverseJoinColumns = @JoinColumn(name="location_id")
    	)
    List<Location> locations;
    
    // Empty constructor
    public Job() {}

    // Getters/setters
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getPallets() {
		return pallets;
	}

	public void setPallets(Integer pallets) {
		this.pallets = pallets;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Location> getLocations() {
		return locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
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