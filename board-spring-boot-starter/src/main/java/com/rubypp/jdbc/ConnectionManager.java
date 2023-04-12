package com.rubypp.jdbc;

import lombok.Data;

@Data
public class ConnectionManager {

	private String driverclass;
	private String url;
	private String username;
	private String password;
	public ConnectionManager(){
		System.out.println("====connectionManager====");
	}
}
