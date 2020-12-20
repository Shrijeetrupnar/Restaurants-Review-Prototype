package com.restaurantsreview.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.restaurantsreview.domain.Users;

@Controller
public class LoginController {
	
	
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
		System.out.println(user);
		return "redirect:/register";
		
	}
	
}
