package com.restaurantsreview.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurantsreview.domain.RestaurantList;

public interface RestaurantListRepository extends JpaRepository<RestaurantList,Long> {

	List<RestaurantList> findByTitle(String title);
	
}
