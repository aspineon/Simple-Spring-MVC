package com.wkrzywiec.simplespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleSpringMVCController {

	@GetMapping("/home")
	public String showHomePage() {
		
		return "home";
	}
}
