package com.restaurantsreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.restaurantsreview.domain.Users;
import com.restaurantsreview.repositories.UserRepository;
import com.restaurantsreview.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user =userRepo.findByUserName(username);
		
		if(user == null)
			throw new UsernameNotFoundException("Invalid username and password");
		return new CustomSecurityUser(user);
	}

}
