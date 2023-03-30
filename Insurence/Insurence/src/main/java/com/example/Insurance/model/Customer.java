package com.example.Insurance.model;

public class Customer {
	
	int customerId;

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
