package com.example.AtmCard.model;

import javax.persistence.Entity;


public class Customer {	
	
	private int customerId;
	
	public int getCustomerId() {
		return customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
