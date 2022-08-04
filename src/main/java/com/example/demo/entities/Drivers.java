package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;



@Entity
public class Drivers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long driverId;
	private String firstName;
	private String lastName;
	
	
	@OneToMany
	
	@JoinTable(
		name = "driver_order",
		joinColumns = @JoinColumn(name="driver_id"),
		inverseJoinColumns = @JoinColumn(name="order_id")
			)
	
	
	private List<Orders> orders;
	
	public Drivers() {}
	
	public Drivers(long driverId, String firstName, String lastName) {
		super();
		this.driverId = driverId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getDriverId() {
		return driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	
	
}
