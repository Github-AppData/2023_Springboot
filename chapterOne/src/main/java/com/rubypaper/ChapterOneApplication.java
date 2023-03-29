package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication*/ // 자동설정하는 애
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rubypaper", "com.controller"}) // 읽어야 할 패키지
public class ChapterOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChapterOneApplication.class, args);
	}

}
