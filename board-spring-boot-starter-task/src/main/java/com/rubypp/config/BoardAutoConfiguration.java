package com.rubypp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypp.jdbc.MyDescription;



@Configuration
public class BoardAutoConfiguration {

	public BoardAutoConfiguration() {
		System.out.println("====BoardAutoConfiguration====");
	}
	@Bean // 오라클 객체를 리턴하는 빈
	@ConditionalOnMissingBean // 메모리에 이 타입에 객체가 없다면
	MyDescription mydescription () { 
		MyDescription script = new MyDescription();
		script.setDriverclass("oracle.jdbc.driver.OracleDriver");
		script.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		script.setBirthday("2002-12-03");
		script.setFavorite_food("Steak");
		script.setName("김태욱");
		script.setSchool("유한대학교");
		
		return script;
	}
}
