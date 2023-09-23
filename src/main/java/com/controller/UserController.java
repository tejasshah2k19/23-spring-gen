package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

//4 stereotype 
@Controller
public class UserController {

	// User->Signup -> S
	// User->Login -> S
	@Autowired
	UserDao userDao;

	@GetMapping("/signup")
	public String signup() {
		// data jsp
		// jsp open
		System.out.println("Signup");
		return "Signup";// jsp -> location xyz
	}

	@GetMapping(path = { "/", "/login" })
	public String login() {
		//
		return "Login";
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		// temp class -> read -> variable -> firstName email password
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		// db save
		userDao.addUser(user);

		return "Login";// jsp
	}
	
	@GetMapping("/users")
	public String getAllUsers(Model model) {
		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users",users);
		return "ListUser";
	}










}
