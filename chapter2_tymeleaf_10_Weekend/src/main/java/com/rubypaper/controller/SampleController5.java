package com.rubypaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rubypaper.dto.BookDTO1;

@Controller
public class SampleController5 {
	@GetMapping("/sc5Form")
	public String insertBook1(Model model)
	{
		model.addAttribute("bookDTO1", new BookDTO1());
		return "/post/sc5Form";
	}
	@PostMapping("/sc5View")
	public String insertView1 (BookDTO1 bookDTO, Model model)
	{
		model.addAttribute("heading", "Book Information");
		
		System.out.println("----------------------------");
		System.out.println(bookDTO.getTitle());
		System.out.println(bookDTO.getAuthor());
		System.out.println(bookDTO.getPublisher());
		System.out.println(bookDTO.getDate());
		System.out.println("----------------------------");
		return "/post/sc5View";
	}

}
