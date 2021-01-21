package com.restaurantsreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.repositories.RestaurantListRepository;

@Service
public class RestaurantRegistrationService {
	
	@Autowired
	private RestaurantListRepository restaurantRepo;
	
	public RestaurantList save(RestaurantList restaurantList) {
		restaurantRepo.save(restaurantList);
		return null;
		
		
	}

}
