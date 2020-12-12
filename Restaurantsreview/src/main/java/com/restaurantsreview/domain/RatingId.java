package com.restaurantsreview.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class RatingId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1342409437211907114L;
	private Users users;
	private RestaurantList restaurantList;
	
	@ManyToOne
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	@ManyToOne
	public RestaurantList getRestaurantList() {
		return restaurantList;
	}
	public void setRestaurantList(RestaurantList restaurantList) {
		this.restaurantList = restaurantList;
	}
	
	

}
