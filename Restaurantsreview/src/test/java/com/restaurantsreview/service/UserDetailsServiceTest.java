package com.restaurantsreview.service;



import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.not;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceTest {

	@SuppressWarnings("deprecation")
	@Test
	void generate_encrypted_password() {
	BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
	String rawPassword = "shrijeet1234";
	String encodePassword=encoder.encode(rawPassword);
	
	System.out.println(encodePassword);
	
	assertThat(rawPassword, not(encodePassword));
	

	}

}
