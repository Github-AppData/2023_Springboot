package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.UserDTO_11;

@Controller
public class SampleController4_11 {

	/* 페이지가 안 열리는 Whitelabel 오류는 Controller 통해 들어가야 한다. */
	@GetMapping("/sc4Form") // 보안 별명처럼 사용함. - 정확한 위치는 안려주면 안된다.
	public String getForm4() {
		return"/post/sc4Form"; // sc4Form이 있는 위치
	}
	@PostMapping("/sc4View")
	public String postView(UserDTO_11 userDTO, Model model) {
		
		// 키와 값으로 이루어진, 것이다. th:text에서 'heading'이라는 키 값을 부르면, 해당 텍스트가 불러와진다.
		model.addAttribute	("heading", "I love you"); 
		return "/post/sc4View";
		
	}
}
