package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {

	
	@PostMapping("/post")
	public String demopost(
			@RequestParam String membername,
			@RequestParam String memberid,
			@RequestParam String memberemail,
			Model model
			) {
		System.out.println(membername);
		System.out.println(memberid);
		System.out.println(memberemail);
		model.addAttribute("membername", membername);
		model.addAttribute("memberid", memberid);
		model.addAttribute("memberemail", memberemail);
		return "/post/post";
		
	}
	@RequestMapping("/hello")
	public String helloMethod(){
		return "/hello";
	}
	
	@GetMapping("/home")
	public String homeMethod(){
		return "/NewFile";
	}
}
