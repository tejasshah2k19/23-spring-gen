package com.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class EmployeeController {

	@GetMapping("/newemp")
	public String newEmp() {
		return "EmployeeRegi";
	}

	@PostMapping("/uploadprofile")
	public String uploadProfile(@RequestParam("profile") MultipartFile file) {
		System.out.println(file.getOriginalFilename());

		// file
		String mainPath = "E:\\Tejas Shah\\boot\\23-spring-web-r\\src\\main\\webapp\\profiles";

		File myFile = new File(mainPath, file.getOriginalFilename());

		try {
			byte b[] = file.getBytes();

			FileUtils.writeByteArrayToFile(myFile, b);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "EmployeeRegi";
	}
}
