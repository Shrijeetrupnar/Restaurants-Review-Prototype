package com.restaurantsreview.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsreview.domain.Review;
import com.restaurantsreview.domain.ReviewId;

public interface RestaurantReviewRepository extends JpaRepository<Review, Long> {
	
	
//	List<Review> findByPk(Review pk); by
	
	Optional<Review> findById(Long id);
		
}
