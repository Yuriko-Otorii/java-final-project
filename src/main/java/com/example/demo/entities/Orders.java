package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	private String product;
	private String version;
	private long quantity;
	
	@ManyToOne(
		cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
        fetch = FetchType.LAZY
		)
	
	@JoinColumn(name="driver_id")
	
	private Drivers driverRel;
	
	
	@OneToOne(		
		cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
        fetch = FetchType.LAZY
		)	
	
	@JoinColumn(name="customer_id")
	
	private Customers customerRel;

	
	public Orders() {}
	
	public Orders(long orderId, String product, String version, long quantity) {
		this.orderId = orderId;
		this.product = product;
		this.version = version;
		this.quantity = quantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Drivers getDriverRel() {
		return driverRel;
	}

	public void setDriverRel(Drivers driverRel) {
		this.driverRel = driverRel;
	}
	

}
