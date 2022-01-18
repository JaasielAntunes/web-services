package com.antunes.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antunes.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
