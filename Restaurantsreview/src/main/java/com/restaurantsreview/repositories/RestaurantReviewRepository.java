package com.restaurantsreview.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsreview.domain.Review;
import com.restaurantsreview.domain.ReviewId;

public interface RestaurantReviewRepository extends JpaRepository<Review, Long> {
	
	
	List<Review> findByPk(ReviewId pk); 
}
