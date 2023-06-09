package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rubypaper.test.BoardVO;

@Controller
public class BoardController {

	@RequestMapping("/board")
	@ResponseBody
	public BoardVO board()
	{
		BoardVO board = new BoardVO();
		board.setNo(1);
		board.setTitle("건의사항");
		board.setContent("1. 메론을 갖다 놓는다.");
		board.setDate(new Date());
		board.setWriter("KTW");
		board.setCnt(1);
		
		return board;
	}
	
	@RequestMapping("/boardlist")
	@ResponseBody
	public List<BoardVO> boardlist()
	{
		List<BoardVO> boardlist = new ArrayList<BoardVO>();
		for(int i = 0; i < 5; i++)
		{
			BoardVO board = new BoardVO();
			board.setNo(1);
			board.setTitle("건의사항");
			board.setContent("밥 많이 주세요 제발");
			board.setDate(new Date());
			board.setWriter("KTW");
			board.setCnt(1);
			boardlist.add(board);
		}
		
		
		return boardlist;
	}
	
	public BoardController() {
		System.out.println("===> BoardController 생성");
	}
	
	// index처럼 읽어드릴려면,
	@RequestMapping("/main")
	@ResponseBody
	public String name() {
		String result = "여러분 방가워요";
		return result;
	}
	@RequestMapping (value="/use/main", method = RequestMethod.GET)
	@ResponseBody
	public String showMain()
	{
		return "유한대학교";
	}
	@RequestMapping("/girl")
	public @ResponseBody String girl()
	{
		return "아무리 찾아도 없음";
	}
	@RequestMapping("/boy")
	public @ResponseBody String boy(String name)
	{
		// http://localhost:9000/boy - X
		// http://localhost:9000/boy?name=강동원 - O
		
		return "남자친구 : " + name;
	}
}
