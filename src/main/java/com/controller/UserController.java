package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		model.addAttribute("users", users);
		return "ListUser";
	}

	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam("userId") Integer userId, Model model) {

		// delete
		// read userid from url
		System.out.println("delete => "+userId);
		// delete query using dao
		userDao.deleteUser(userId);
		
		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users", users);
		return "ListUser";// jsp
	}

	

	//	@GetMapping("/deleteuser2/{userId}/{roleId}/{countryName}")
	//public String deleteUser2(@PathVariable("userId") Integer userId,@PathVariable("roleId") Integer roleId, Model model) {


	@GetMapping("/deleteuser2/{userId}")
	public String deleteUser2(@PathVariable("userId") Integer userId, Model model) {
		//who authentication : authorization 
		//delete -> comment  
		//
		// delete
		// read userid from url
		System.out.println("delete => "+userId);
		// delete query using dao
		userDao.deleteUser(userId);
		
		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users", users);
		return "ListUser";// jsp
	}

	
	@GetMapping("/viewuser")
	public String viewUser(@RequestParam("userId") Integer userId,Model model) {
		UserBean user = userDao.getUserById(userId);
		model.addAttribute("user",user);
		return "ViewUser";
	}
}
