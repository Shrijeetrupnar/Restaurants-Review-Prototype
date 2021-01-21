package com.restaurantsreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.service.RestaurantRegistrationService;

@Controller
public class RestaurantRegistrationController {
	
	@Autowired
	private RestaurantRegistrationService   restaurantRegistrationService;
	
	@GetMapping("/restaurantRegistration")
	public String restaurantRegistration(ModelMap model) {
		model.put("restaurantList", new RestaurantList());
		return "restaurantRegistration";
	}

	
	@PostMapping("/restaurantRegistration")
	public String createrestaurantRegistrationPost(RestaurantList restaurantList) {
		
		RestaurantList restaurantList1 =	restaurantRegistrationService.save(restaurantList);
		
		System.out.println("non- saved :" +restaurantList);
		System.out.println("saved :" +restaurantList1);
		return "redirect:/dashboard";
		
	}
}
