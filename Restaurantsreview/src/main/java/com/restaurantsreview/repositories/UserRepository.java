package com.restaurantsreview.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsreview.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	
	Users findByUserName(String username);

}
