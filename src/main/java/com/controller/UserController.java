package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class UserController {

	// User->Signup -> S
	// User->Login -> S

	@GetMapping("/signup")
	public String signup() {
		// data jsp
		// jsp open
		System.out.println("Signup");
		return "Signup";// jsp -> location xyz
	}

	@GetMapping(path = {"/","/login"})
	public String login() {
		// 
		return "Login";
	}

	
	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		//temp class -> read -> variable -> firstName email password
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "Login";//jsp 
	}
}
