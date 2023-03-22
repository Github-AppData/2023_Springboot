package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter0Application {

	public static void main(String[] args) {
		/* SpringApplication.run(Chapter0Application.class, args); */
		SpringApplication application = new SpringApplication(
				Chapter0Application.class);
		
		// 웹 서버를 실행하지않고, 자바처럼 콘솔에 출력하겠다는 코드
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
