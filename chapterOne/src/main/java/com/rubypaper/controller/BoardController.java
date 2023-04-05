package com.rubypaper.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
		
	
	@RequestMapping(value="/hello")
	@ResponseBody 
	// localhost:(server.port 번호)/hello?name=김이나 응답이 들어오면 아래로 대답할 것이다.
	public String getName(String name) {
		String result = "반가워요 " + name + "님" ;
		return result;
	}
	@RequestMapping("/hi")
	@ResponseBody 
	public String hi() {
		return "hihi";
	}
}
