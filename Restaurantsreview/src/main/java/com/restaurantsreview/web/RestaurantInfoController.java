package com.restaurantsreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.domain.Review;
import com.restaurantsreview.service.RestaurantRegistrationService;
import com.restaurantsreview.service.ReviewRegistrationService;
import com.restaurantsreview.service.UserDetailsServiceImp;

@Controller
@RequestMapping("restaurantInfo")
public class RestaurantInfoController {

	@Autowired
	private ReviewRegistrationService reviewRegistrationService;

	@Autowired
	private RestaurantRegistrationService restaurantRegistrationService;

	@Autowired
	private UserDetailsServiceImp userDetailsServiceImp;

	@GetMapping("{restaurantId}")
	public String register(@PathVariable("restaurantId") Long restaurantId, ModelMap model) {
		System.out.println(restaurantId);

		RestaurantList restaurantList = restaurantRegistrationService.getRestaurantInfo(restaurantId);

		System.out.println(restaurantList);

		model.addAttribute(restaurantList);
		model.put("review", new Review());
		return "restaurantInfo";
	}

	@PostMapping("/restaurantInfo")
	public String registerPost(Review review) {

		// review.setPk(userDetailsServiceImp.getId());

		// ReviewId reviewId= new ReviewId();

		// review.setPk(review.getPk());

//		reviewId.setPk(reviewId.se);
		System.out.println(review);

		reviewRegistrationService.save(review);
		return "redirect:/restaurantInfo";

	}

}
