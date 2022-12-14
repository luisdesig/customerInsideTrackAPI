package com.example.customer.service.interfaces;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import com.example.customer.entity.Customer;

public interface CustomerSrvInter {

	public Optional<List<Customer>> getAll();
	public Customer getById(BigInteger id);
	public Customer Save(Customer customers);
	public List<Customer> saveAll(List<Customer> customers);
	public List<Customer> delete(BigInteger id);
	
}
