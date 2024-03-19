package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Moon {
	
	@GetMapping
	public String moon() {
		return "Moon";
	}

}
