package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;

import jakarta.validation.Valid;

@Controller
public class StudentController {

	@GetMapping("/newstudent")
	public String newStudent(Model model) {
		model.addAttribute("student",new StudentBean());
		return "StudentReg";
	}

	@PostMapping("/savestudent")
	public String saveStudent(@ModelAttribute("student") @Valid StudentBean student, BindingResult result,Model model) {
		//@Valid -> will perform validation and return result -> isError true or false ->
		//BindingResult -> 
		
		// miss
		model.addAttribute("student",student);
		if (result.hasErrors()) {
			return "StudentReg";

		} else {
			return "Login";
		}
	}
}
