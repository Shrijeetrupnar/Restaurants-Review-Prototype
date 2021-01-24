package com.restaurantsreview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.repositories.RestaurantListRepository;

@Service
public class RestaurantRegistrationService {
	
	@Autowired
	private RestaurantListRepository restaurantRepo;
	List<RestaurantList> restaurantList ;
	
	
	public RestaurantList getRestaurantInfo(Long id) {
		
		return restaurantRepo.getOne(id);
		
	}

	public List<RestaurantList> getResaturantList(){
		
		List<RestaurantList> restaurantList	=  restaurantRepo.findAll();
		return restaurantList;
	}
	
	public RestaurantList save(RestaurantList restaurantList) {
		restaurantRepo.save(restaurantList);
		return null;
		
		
	}

}
