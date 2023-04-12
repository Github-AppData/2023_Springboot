package com.rubypaper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.rubypp.jdbc.MyDescription;

@Component // service와 component는 차이가 없다.
public class ConnectionManagerService implements ApplicationRunner{

	@Autowired
	private MyDescription manager;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("커넥션 연결 됨 ----> " + manager.toString());
		
	}
	
	
}
