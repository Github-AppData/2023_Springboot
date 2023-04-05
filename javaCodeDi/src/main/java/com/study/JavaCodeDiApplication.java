package com.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.beans.Config;
import com.study.beans.Member;
import com.study.beans.Printer;

@SpringBootApplication
public class JavaCodeDiApplication {

	public static void main(String[] args) {
		// SpringApplication.run(javaCodeDiApplication.calss, args);
				// Printer p = new Printer(); 인터페이스로는 객체를 생성 할 수 없음
				
		
		//1
		ApplicationContext context 
		= new AnnotationConfigApplicationContext(Config.class);
		//parentI pp = new Son();
		System.out.println("beans 등록중");
		
		// 2.
		Member member1 = (Member) context.getBean("member1");
		member1.print();
		
		// 3.
		Member member2 = (Member) context.getBean("hello", Member.class);
		member2.print();
		
		// 4.
		Printer printer = context.getBean("pzrinterB", Printer.class);
		member1.setPrinter(printer);
		member1.print();
		
		// 5.
		if(member1 == member2)
			System.out.println("동일객체임");
		else
			System.out.println("다른 객체임");
		
		
		
	}

}
