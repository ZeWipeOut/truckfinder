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
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	// Automatically generated/incremented ID
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	// Role identifier (0 for trucker, 1 for shipper)
	@NotNull
	private Integer role;
	
	// Username
	@NotEmpty(message="Username is required")
	private String userName;
	
	// User email address
	@NotEmpty(message="Email address is required")
	@Email(message="Please enter a valid email")
	private String email;
	
	// Phone number
	@NotEmpty(message="Phone number is required")
	private String phone;
	
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
	
	// Password + transient password confirm
	@NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;
    
    // Internally managed created/updated at timestamps
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    // Many to many relationship with jobs
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        	name = "jobs_taken",
        	joinColumns = @JoinColumn(name="user_id"),
        	inverseJoinColumns = @JoinColumn(name="job_id")
        )
    List<Job> jobs;
    
    // Empty constructor
    public User() {}
    
    // Getters/setters
    public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
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
