package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO_11;

@Controller
public class SampleController4_11 {

	/* 페이지가 안 열리는 Whitelabel 오류는 Controller 통해 들어가야 한다. */
	@GetMapping("/SampleController4_11")
	public String getForm4() {
		return"/post/sc4Form";
	}
	@PostMapping("/sc4View")
	public String postView(UserDTO_11 userDTO, Model model) {
		
		model.addAttribute("heading", "I love you");
		return "/post/sc4View";
		
	}
}
