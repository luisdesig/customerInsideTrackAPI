package com.example.customer.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.customer.dao.CustomerDao;
import com.example.customer.entity.Customer;
import com.example.customer.service.interfaces.CustomerSrvInter;

import lombok.RequiredArgsConstructor;


@Service @RequiredArgsConstructor
public class CustomerSrv implements CustomerSrvInter{

	private final CustomerDao customerDao; 
	
	public Optional<List<Customer>> getAll() {
		
		List<Customer> res =new ArrayList<Customer>();
		
		customerDao.findAll().forEach(it -> res.add(it));
		return Optional.ofNullable(res);
	}

	@Override
	public Customer getById(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer Save(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> saveAll(List<Customer> customers) {
		List<Customer> res =new ArrayList<Customer>();
		customerDao.saveAll(customers).forEach(it -> res.add(it));
		return res;
	}

	@Override
	public List<Customer> delete(BigInteger id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
