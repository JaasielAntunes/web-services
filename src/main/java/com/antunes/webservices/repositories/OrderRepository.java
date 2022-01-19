package com.antunes.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antunes.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
