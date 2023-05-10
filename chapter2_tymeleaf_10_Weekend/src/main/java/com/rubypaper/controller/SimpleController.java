package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
	
	@PostMapping("/post/form")
	public String memberform() {
		
		return "post/post";
	}
	
	// Parameter - 주소를 쳤을 때 그 때 넣겠다.
	@GetMapping("/userinfo")
	public String userinfo(
			@RequestParam(value = "user_name") String uid ,
			@RequestParam(value = "user_age") String age ,
			@RequestParam(value = "user_email") String email ,
			@RequestParam(value = "user_hp") String hp ,
			@RequestParam(value = "user_addr") String address ,
			Model model)
	{
		model.addAttribute("user_name", uid);
		model.addAttribute("user_age", age);
		model.addAttribute("user_email", email);
		model.addAttribute("user_hp", hp);
		model.addAttribute("user_addr", address);
		return "/user/userinfo";
	}
	


	// 단순요청
	@GetMapping("/userinfo1")
	public String userMethod()
	{
		return "/user/userinfo1";
	}
	
	@GetMapping("/userdata")
	public String userdataMethod(Model model) // 데이터 바구니
	{
		model.addAttribute("username", "Leesunshin"); // 키와 값으로 이루어져 있다.
		model.addAttribute("age", 22);
		return "/user/userdata";
	}
}
