package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entity.Customer;
import com.example.customer.service.CustomerSrv;

import lombok.RequiredArgsConstructor;

@RestController 
@RequiredArgsConstructor
@RequestMapping ("/customer")
@CrossOrigin("http://localhost:4200")
public class CustomerController {
	
	private final CustomerSrv customerSrv;
	 
	@GetMapping("")
	public Optional<List<Customer>> listCustomer(){
		
		Optional<List<Customer>> res = customerSrv.getAll();
		return res;
	}
	
	@PostMapping("")
	public List<Customer> saveAllCustomer(@RequestBody List<Customer> customers){
		
		List<Customer> res = customerSrv.saveAll(customers);
		return res;
	}

}
