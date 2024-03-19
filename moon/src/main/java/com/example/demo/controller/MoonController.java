package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoonController {
	
	@GetMapping("/moon")
	public String four() {
		return "30 집에 가자!!!"; 
	}
}
