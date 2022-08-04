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
import javax.persistence.OneToOne;

@Entity
public class Customers {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long customerId;
	  private String name;
	  private String address;
	  private String phoneNumber;
	  private String email;
	  
	  
	  @OneToMany
	  @JoinTable(
			name = "customer_order",
			joinColumns = @JoinColumn(name="customer_id"),
			inverseJoinColumns = @JoinColumn(name="order_id")
			)		
	  private List<Orders> orders;
	 
//	  @OneToOne(		
//			cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
//	        fetch = FetchType.LAZY
//			)	
//		
//	  @JoinColumn(name="order_id")
	  
	  
	  
	    public Customers(){}

	    public Customers(long customerId, String name, String address, String phoneNumber, String email) {
	    	this.customerId = customerId;
	    	this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }
	    
	    

		public Long getCustomerId() {
			return customerId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	
	
}
