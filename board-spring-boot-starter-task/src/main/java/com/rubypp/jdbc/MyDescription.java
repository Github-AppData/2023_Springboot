package com.rubypp.jdbc;

import lombok.Data;

@Data
public class MyDescription {

	private String driverclass;
	private String url;
	private String name;
	private String birthday;
	private String school;
	private String favorite_food;
	public MyDescription(){
		System.out.println("====connectionManager====");
	}
}
