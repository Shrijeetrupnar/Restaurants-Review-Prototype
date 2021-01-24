package com.restaurantsreview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurantsreview.domain.Review;
import com.restaurantsreview.repositories.RestaurantReviewRepository;

@Service
public class ReviewRegistrationService {
	
	@Autowired
	private RestaurantReviewRepository restaurantReviewRepo;
	List<Review> restaurantReviewList ;
	

	public List<Review> getResaturantReviewList(){
		
		List<Review> restaurantReviewList	=  restaurantReviewRepo.findAll();
		return restaurantReviewList;
	}
	
	public Review save(Review review) {
		restaurantReviewRepo.save(review);
		return null;
		
		
	}
	

}
