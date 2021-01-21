package com.restaurantsreview.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsreview.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	
	Users findByUserName(String username);
	
	
}
