package com.example.AtmCard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.AtmCard.model.Cards;

public interface AtmCardRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}
