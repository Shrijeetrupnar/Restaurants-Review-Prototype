package com.restaurantsreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.restaurantsreview.domain.Users;
import com.restaurantsreview.repositories.UserRepository;
import com.restaurantsreview.security.Authority;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Users save(Users user) {
		
		String encode= passwordEncoder.encode(user.getPassword());
		
		user.setPassword(encode);
		
		Authority authority=new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user); 
		user.getAuthorities().add(authority);
		
		userRepo.save(user);
		
		return null;
	}

}
