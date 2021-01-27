package com.restaurantsreview.web;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.restaurantsreview.domain.RestaurantList;
import com.restaurantsreview.domain.Review;
import com.restaurantsreview.domain.Users;
import com.restaurantsreview.repositories.UserRepository;
import com.restaurantsreview.security.Authority;
import com.restaurantsreview.service.RestaurantRegistrationService;
import com.restaurantsreview.service.ReviewRegistrationService;
import com.restaurantsreview.service.UserDetailsServiceImp;


@Controller
public class RestaurantInfoController {

	@Autowired
	private ReviewRegistrationService reviewRegistrationService;

	@Autowired
	private RestaurantRegistrationService restaurantRegistrationService;

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserDetailsServiceImp userDetailsServiceImp;

	@GetMapping("/restaurantInfo/{restaurantId}")
	public String register(@PathVariable("restaurantId") Long restaurantId, ModelMap model) {
		System.out.println(restaurantId);

		RestaurantList restaurantList = restaurantRegistrationService.getRestaurantInfo(restaurantId);

		System.out.println(restaurantList);

		model.addAttribute(restaurantList);
		model.put("review", new Review());
		return "restaurantInfo";
	}

	@PostMapping("/restaurantInfo/{restaurantId}")
	public String registerPost(Review review) {

		// review.setPk(userDetailsServiceImp.getId());

		// ReviewId reviewId= new ReviewId();

		// review.setPk(review.getPk());

//		reviewId.setPk(reviewId.se);
		System.out.println(review);
		System.out.println();
		System.out.println();
		System.out.println();
		org.springframework.security.core.Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentPrincipalName = authentication.getName();
		
		Users user= userRepo.findByUserName(currentPrincipalName);
		review.setUserId(user.getId());
		
		reviewRegistrationService.save(review);
		return "redirect:/restaurantInfo/" + review.restaurantId;

	}

}
