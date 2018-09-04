package com.wkrzywiec.simplespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SimpleSpringMVCController {

	@GetMapping("/")
	public String showHomePage() {
		
		return "home";
	}
	
	@GetMapping("/meme/{name}")
	public String showNotsure(	@PathVariable("name") String name) {
		
		if (name.equals("notsure")) {
			return "notsure";
		} else if (name.equals("instead")) {
			return "instead";
		} else {
			return "works";
		}
	}
}
