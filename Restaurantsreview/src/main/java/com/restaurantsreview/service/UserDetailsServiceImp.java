package com.restaurantsreview.service;

import java.util.List;

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
	
	public Long id; 

	public Long getId() {
		return id;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = userRepo.findByUserName(username);

			id=user.getId();

		if (user == null)
			throw new UsernameNotFoundException("Invalid username and password");
		return new CustomSecurityUser(user);
	}

}
