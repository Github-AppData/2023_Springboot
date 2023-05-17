package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO_11;

@Controller
public class SampleController3_11 {

	@PostMapping("/SampleController3_11")
	// 11 주차 실습
	public String userForm (
		UserDTO_11 userDTO, Model model){
		/*
		 * model.addAttribute("heading", "I love Springboot ");
		 * model.addAttribute("middle", "I love Springboot ");
		 * model.addAttribute("bottom", "I love Springboot ");
		 */
			
			System.out.println(userDTO.getUserId());
			System.out.println(userDTO.getUserName());
			System.out.println(userDTO.getUserPhone());
			return "/post/sc3View_11";
	}
}
