package com.rubypaper.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypp.jdbc.ConnectionManager;

@Configuration
public class BoardConfiguration {

	@Bean // 오라클 객체를 리턴하는 빈
	ConnectionManager connectionManager() {
		ConnectionManager manager = new ConnectionManager();
		manager.setDriverclass("org.h2.Driver");
		manager.setUrl("jdbc:h2:tc[://localhost/~/test");
		manager.setUsername("sa");
		manager.setPassword("");
		
		return manager; 
	}
}
