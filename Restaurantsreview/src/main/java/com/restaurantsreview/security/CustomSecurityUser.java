package com.restaurantsreview.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.restaurantsreview.domain.Users;

public class CustomSecurityUser extends Users implements UserDetails {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4108697326851223043L;
	
	
	public CustomSecurityUser() {
		
	}
	
	public CustomSecurityUser(Users user) {
		// TODO Auto-generated constructor stub
		
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setFirstName(user.getFirstName());
		this.setLastName(user.getLastName());
		this.setPassword(user.getPassword());
		this.setUserName(user.getUserName());
		
	}

	 @Override
	  public Set<Authority> getAuthorities() {
	    return super.getAuthorities();
	  }

	  @Override
	  public String getPassword() {
	    return super.getPassword();
	  }

	  @Override
	  public String getUsername() {
	    return super.getUserName();
	  }

	  @Override
	  public boolean isAccountNonExpired() {
	    return true;
	  }

	  @Override
	  public boolean isAccountNonLocked() {
	    return true;
	  }

	  @Override
	  public boolean isCredentialsNonExpired() {
	    return true;
	  }

	  @Override
	  public boolean isEnabled() {
	    return true;
	  }

}
