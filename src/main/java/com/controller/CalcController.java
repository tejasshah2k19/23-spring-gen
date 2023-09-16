package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;

@Controller
public class CalcController {

	@GetMapping("inputcalc") // browser url
	public String inputCalc() {
		return "InputCalc";// jsp
	}

	@PostMapping("addition")
	public String addition(CalcBean calc,Model model) {
		// request.getParameter("n1");
		// bean-> data ->read -> variable
		// n1 n2
		Integer ans = 0;
		if (calc.getChoice() == null) {

		} else if (calc.getChoice().equals("add")) {
			System.out.println(calc.getN1() + calc.getN2());
			model.addAttribute("sym","+");
			
			ans = calc.getN1() + calc.getN2();
		} else if (calc.getChoice().equals("sub")) {
			System.out.println(calc.getN1() - calc.getN2());
			model.addAttribute("sym","-");
			
			ans = calc.getN1() - calc.getN2();
		} else if (calc.getChoice().equals("mul")) {
			System.out.println(calc.getN1() * calc.getN2());
			ans = calc.getN1() * calc.getN2();
			model.addAttribute("sym","*");
			
		} else if (calc.getChoice().equals("div")) {
			System.out.println(calc.getN1() / calc.getN2());
			ans = calc.getN1() / calc.getN2();
			model.addAttribute("sym","/");
			
		}
		model.addAttribute("n1",calc.getN1());
		model.addAttribute("n2",calc.getN2());
		model.addAttribute("answer",ans); //to transfer data from controller to jsp 
		return "OutputCalc";
	}
}
