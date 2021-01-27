package com.restaurantsreview.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfiguartion extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		auth
			.userDetailsService(userDetailsService)
			.passwordEncoder(getPasswordEncoder());
		
		
		
//		auth.inMemoryAuthentication()
//			.passwordEncoder(getPasswordEncoder())
//		    .withUser("shrijeet")
//		    .password(getPasswordEncoder().encode("shrijeet1234"))
//		    .roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/register").permitAll()
				 .antMatchers("/restaurantRegistration").permitAll()
				 .antMatchers("/restaurantInfo").permitAll()
				.anyRequest().hasRole("USER").and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/dashboard")
				.permitAll()
				.and()
			.logout()
				.logoutUrl("/logout")
				.permitAll();
				
	}

}
