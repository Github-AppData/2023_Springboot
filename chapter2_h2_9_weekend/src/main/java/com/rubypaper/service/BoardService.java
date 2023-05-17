package com.rubypaper.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.rubypaper.persistence.BoardDAO;

@Service
public class BoardService implements ApplicationRunner {
	@Autowired // 멤버변수
	private BoardDAO boardDAO; // repository
	
	// 멤버 메소드
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<String, Object> board = new HashMap<String, Object>();
		board.put("title", "SpringBoot jdbc Test !!!");
		board.put("writer", "dong su");
		board.put("content", "we are the future");
		boardDAO.insertBoard(board);
		List<Map<String, Object>> boardList = boardDAO.getBoard(); // 하나씩 가져오는 것이다.
		for(Map<String, Object> result:boardList){
				System.out.println("---->"+result.toString());
		}
		
	}

}
