package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoonController {
	
	@GetMapping
	public String four() {
		return "30 !!!!!!!!!수정 두번했지롱";
	}
}
