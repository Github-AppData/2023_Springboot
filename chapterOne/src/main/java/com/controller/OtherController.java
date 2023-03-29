package com.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.main.BoardVO;

/*@Controller*/
@RestController // @RestController을 쓰면 @ResponseBody을 쓰지 않아도 된다. 
public class OtherController {

	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board  = new BoardVO();
		
		// Class를 값으로 처리하고 싶을때 - json 파일로 웹 브라우저에 표현된다.
		board.setSeq(1);
		board.setTitle("건의사항");
		board.setContent("밥 많이 주세요.");
		board.setDate(new Date());
		board.setCnt(0);
		board.setWriter("연진동은");
		
		return board;
	}
	
	//@RequestMapping("/money")
	//@ResponseBody
	@GetMapping("/daller")
	public String getMoney() {
		return "내가 벌 돈 액수 = 120억";
	}
}
