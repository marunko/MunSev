package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPages {

	// Main page
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Proj name");
		return "/main/index";
	}
	
	// About 
	
	// Income counters
	
	// Guarantees
}
