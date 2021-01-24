package com.restaurantsreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurantsreview.domain.Review;
import com.restaurantsreview.domain.ReviewId;
import com.restaurantsreview.domain.Users;
import com.restaurantsreview.service.ReviewRegistrationService;
import com.restaurantsreview.service.UserDetailsServiceImp;
import com.restaurantsreview.service.UserService;

@Controller
public class MoghulHomePageController {
	
	
	@Autowired
	private ReviewRegistrationService reviewRegistrationService;
	
	@Autowired
	private UserDetailsServiceImp userDetailsServiceImp;

	
	@GetMapping("/moghul")
	public String register(ModelMap model) {
		model.put("review", new Review());
		return "moghul";
	}

	
	@PostMapping("/moghul")
	public String registerPost(Review review) {
		
		//review.setPk(userDetailsServiceImp.getId());
		
		//ReviewId reviewId= new ReviewId();
		
		 //     review.setPk(review.getPk());
		
//		reviewId.setPk(reviewId.se);
		
		reviewRegistrationService.save(review);
		return "redirect:/moghul";
		
	}
	
	
}
