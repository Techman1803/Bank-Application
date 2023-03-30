package com.example.Insurance.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Insurance.model.Insurance;

public interface InsuranceRepository extends CrudRepository<Insurance, Long>{
	
	List<Insurance> findByCustomerId(int customerId);

}
