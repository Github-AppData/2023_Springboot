package com.study.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Member member1() {
		Member member = new Member();
		member.setName("hong gildong");
		member.setNickname("조선 서자");
		member.setPrinter(new PrinterA());
		return member;
	}
	@Bean(name="hello")
	public Member member2() {
		return new Member("kim","dog", new PrinterA()); // 익명객체
	}
	
	@Bean
	public PrinterA printerA() {
		return new PrinterA();
	}
	
	@Bean
	public PrinterB printerB() {
		return new PrinterB();
	}
}
