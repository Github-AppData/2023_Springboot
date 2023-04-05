package com.study.beans;

// 인터페이스 
// 1. 객체를 못 만든다.
// 2. 생성자가 없다.  
public interface Printer {
	
	// 멤버변수
	final double PI = 3.141592; // 상수화
	
	// 생성자 없음
	
	// 멤버 메소드
	public void print(String message);
}
