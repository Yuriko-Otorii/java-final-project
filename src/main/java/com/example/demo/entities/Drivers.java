package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.websocket.OnError;

@Entity
public class Drivers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long driverId;
	private String firstNameString;
	private String lastNameString;
	
	
//	@OneToMany(
//		cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
//		fetch = FetchType.LAZY
//	)
//	
//	@JoinTable(
//		name =  "driver_order",
//		joinColumns = @JoinColumn("driver_id"),
//		inverseJoinColumns = @JoinColumn("order_id")
//	)
		
	
	public Drivers() {}
	
	public Drivers(long driverId, String firstNameString, String lastNameString) {
		super();
		this.driverId = driverId;
		this.firstNameString = firstNameString;
		this.lastNameString = lastNameString;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}
	
	
	
	
	
	
}

	
