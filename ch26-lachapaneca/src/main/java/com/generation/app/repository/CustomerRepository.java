package com.generation.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long >{
	
}
