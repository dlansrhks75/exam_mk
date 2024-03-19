package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SunController {
	
	@GetMapping("/sun")
	public String Sun() {
		return "sun";
	}
}
