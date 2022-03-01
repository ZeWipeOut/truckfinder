package com.arthur.truckfinder.models;

@Entity
@Table(name="drivers")
public class driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String driverName;
	
	private String email;
	
	private String contactinfo;
	
	

}
