package com.restaurantsreview.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurantsreview.domain.Users;
import com.restaurantsreview.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	
	@GetMapping("/register")
	public String register(ModelMap model) {
		model.put("user", new Users());
		return "register";
	}

	
	@PostMapping("/register")
	public String registerPost(Users user) {
		
		userService.save(user);
		
		return "redirect:/login";
		
	}
	
}
