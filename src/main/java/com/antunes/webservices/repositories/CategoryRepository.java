package com.antunes.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antunes.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
