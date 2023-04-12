package com.rubypaper.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypp.jdbc.MyDescription;

@Configuration
public class BoardConfiguration {

	@Bean // 오라클 객체를 리턴하는 빈
	MyDescription mydescription() {
		MyDescription script = new MyDescription();
		script.setDriverclass("org.h2.Driver");
		script.setUrl("jdbc:h2:tc[://localhost/~/test");
		script.setBirthday("2002-12-03");
		script.setFavorite_food("OMG");
		script.setName("김태욱");
		script.setSchool("연세대학교");
		return script; 
	}
}
