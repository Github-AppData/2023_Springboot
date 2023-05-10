package com.rubypaper.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class BoardConfiguration {
	
	// 데이터 베이스 연결 설정
	@Bean
	DataSource dataSource() {
		// Database Source 
		// => DB 연결하기 위해 접속하기 위한 모든 정보가 들어 있는 곳.
		HikariDataSource dataSource = new HikariDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setJdbcUrl("jdbc:h2:tcp://localhost/~/test");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		
		return dataSource;
	}
}
