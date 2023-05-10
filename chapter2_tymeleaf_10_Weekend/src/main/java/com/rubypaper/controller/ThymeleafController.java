package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/hello")
	public String helloMethod(){
		return "/hello";
	}
	
	@GetMapping("/home")
	public String homeMethod(){
		return "/NewFile";
	}
}
