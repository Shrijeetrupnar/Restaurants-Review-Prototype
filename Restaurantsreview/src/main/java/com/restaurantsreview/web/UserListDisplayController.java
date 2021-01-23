package com.restaurantsreview.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.restaurantsreview.domain.Users;
import com.restaurantsreview.service.UserService;

@Controller
public class UserListDisplayController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping("/userList")
	public String userList(Model model) {
		
		List<Users>	userList= userService.getUserList();
		model.addAttribute("userList",userList);
		
		return "userList";
		
	}
	
	
	
}
