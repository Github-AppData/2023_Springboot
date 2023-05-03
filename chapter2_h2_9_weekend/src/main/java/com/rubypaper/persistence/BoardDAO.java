package com.rubypaper.persistence;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate; // jdbcTemplate 클래스 포함한 라이브러리
import org.springframework.stereotype.Repository;

@Repository // 저장소 개념 - 9주차 PT 16 Page 참고.
public class BoardDAO {
	// 멤버 변수
	// Database Source 객체 필요 --> DB 연결하기 위해 접속하기 위한 모든 정보가 들어 있는 곳.
	private JdbcTemplate spring;
	String s1 = "insert into Board (seq, title, writer, content) values(?,?,?,?)";
	private final static String BOARD_INSERT = 
			"insert into Board (seq, title, writer, content) values("
			+"select nvl(max(seq),0)+1 from board)',?,?,?)"; // 띄워쓰기가 엄청 중요하다.
	private static final String BOARD_LIST = "select * from Board order by seq desc"; // 내림차순으로 보여달라.

	
	// 멤버 메소드
	// HashMap, Map - 다 키와 값으로 이루어진 애들이다.
	public void insertBoard(Map<String, Object> board) {
		spring.update(BOARD_INSERT,
				board.get("title"), board.get("writer"),board.get("content"));
	}
	public List<Map<String, Object>> getBoard(){
		return  spring.queryForList(BOARD_LIST); // 여러 데이터를 한번에 가져오는 것 
	}
}
