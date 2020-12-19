package com.restaurantsreview.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import com.restaurantsreview.domain.Users;

@Entity
public class Authority implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3592740171106880519L;
	private Long id;
	private String authority;
	private Users User;
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne        
	public Users getUser() {
		return User;
	}
	public void setUser(Users user) {
		User = user;
	}

	

}
