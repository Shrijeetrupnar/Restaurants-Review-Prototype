package com.restaurantsreview.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.domain.Users;
import com.restaurantsreview.repositories.RestaurantListRepository;
import com.restaurantsreview.service.RestaurantRegistrationService;
import com.restaurantsreview.service.UserService;

@Controller
public class RestaurantListDisplayController {
	
	
	@Autowired
	private RestaurantRegistrationService restaurantRegistrationService;
	
	
	@GetMapping("/restaurantListDisplay")
	public String restaurantListDisplay(Model model) {
		
		List<RestaurantList> restaurantList	= restaurantRegistrationService.getResaturantList();
		model.addAttribute("restaurantList",restaurantList);
		
		return "restaurantListDisplay";
		
		
		
	}
	
	

}
