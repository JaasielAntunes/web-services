package com.antunes.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antunes.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
