package com.example.Insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Insurance.model.Customer;
import com.example.Insurance.model.Insurance;
import com.example.Insurance.repository.InsuranceRepository;

@RestController
public class InsuranceController {
	
	@Autowired
	private InsuranceRepository insuranceRepository;
	
	@PostMapping("/Insurance")
	public List<Insurance> getInsuranceDetails(@RequestBody Customer customer)
	{
		List<Insurance> insurance = insuranceRepository.findByCustomerId(customer.getCustomerId());
		return insurance;
	}

}
