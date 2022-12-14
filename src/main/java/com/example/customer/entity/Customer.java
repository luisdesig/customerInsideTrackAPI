package com.example.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Customer {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String purchase_date;
	private String invoice;
	private String customer_root;
	private String customer_leaf;
	private String product_description;
	private String pack_size;
	private String unit_type;
	private String category;
	private String distributor_root;
	private String distributor_leaf;
	private String manufacturer;
	private Double quantity;
	private Double price;
	private Double total;
}
