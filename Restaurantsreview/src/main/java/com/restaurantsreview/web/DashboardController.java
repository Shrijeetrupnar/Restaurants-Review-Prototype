package com.restaurantsreview.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.restaurantsreview.domain.Users;
import com.restaurantsreview.service.UserService;

@Controller
public class DashboardController {


	
//	@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	public String rootView() {
		return "index";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {

	
		return "dashboard";
	}
	
	
	@GetMapping("/restaurantInfo")
	public String dashboard1(Model model) {

	
		return "restaurantInfo";
	}
	
	
}
