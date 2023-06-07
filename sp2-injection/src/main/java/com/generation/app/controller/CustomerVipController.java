package com.generation.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.app.model.Customer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/customers-vip")
public class CustomerVipController {
	
	@Autowired
	@Qualifier ("customerVip")
	Customer customer;
	{
		log.info("Se inicializa CustomerVipController");
	}
	
	@GetMapping
	public Customer getCustomerById() {
		
		customer.setFirstName("Rico Mac Pato");
		customer.setLastName("Donald");
		customer.setEmail("dinerodinerodinero@google.com");
		
		return customer;
	}
}
