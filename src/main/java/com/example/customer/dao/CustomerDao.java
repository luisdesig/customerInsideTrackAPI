package com.example.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.customer.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
