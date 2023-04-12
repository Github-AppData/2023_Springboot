package com.rubypp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypp.jdbc.ConnectionManager;



@Configuration
public class BoardAutoConfiguration {

	public BoardAutoConfiguration() {
		System.out.println("====BoardAutoConfiguration====");
	}
	@Bean // 오라클 객체를 리턴하는 빈
	@ConditionalOnMissingBean // 메모리에 이 타입에 객체가 없다면
	ConnectionManager connectionmanager () { 
		ConnectionManager manager = new ConnectionManager();
		manager.setDriverclass("oracle.jdbc.driver.OracleDriver");
		manager.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		manager.setUsername("scott");
		manager.setUsername("tiger");
		
		return manager;
	}
}
