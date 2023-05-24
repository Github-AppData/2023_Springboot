package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.userDTO_12;

@Controller
public class ControllerFriend {
	@GetMapping("/form")
	public String getForm4() {
		return "/post/form";
	}
	
	@PostMapping("/view")
	public String postView(userDTO_12 userDTO, Model model) {
		model.addAttribute("userName", "Kim Tae Wook");
		model.addAttribute("userMbti", "ISFJ");
		model.addAttribute("userGender", "Man");
		model.addAttribute("userAge", "22");
		model.addAttribute("heading", "Friends");
		return "/post/view";
	}
}
