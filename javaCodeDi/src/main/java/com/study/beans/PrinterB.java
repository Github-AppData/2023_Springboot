package com.study.beans;


import org.springframework.stereotype.Component;

@Component("printerB") // 객체이다. - new 하고 만들 것을 이렇게 하는 것이다.
public class PrinterB implements Printer{

	@Override
	public void print(String message) {
		System.out.println("Printer B"+message);
		
	}

}
