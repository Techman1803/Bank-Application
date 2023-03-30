 package com.example.AtmCard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AtmCard.model.Cards;
import com.example.AtmCard.model.Customer;
import com.example.AtmCard.repository.AtmCardRepository;

@RestController
public class AtmCardController { 
	
	@Autowired
	private AtmCardRepository atmcardRepository;
	
	@PostMapping("/AtmCard")
	public List<Cards> getAtmCardDetailsAtmCard(@RequestBody Customer customer)
	{
		List<Cards> atmcard = atmcardRepository.findByCustomerId(customer.getCustomerId());
		return atmcard;
	}
	
}
