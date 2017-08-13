package com.app.ioc.di;

public class DemoBeanIndex {

	private String userName;
	private String password;
	
	public DemoBeanIndex(String userName) {
		this.userName = userName;
	}
	
	public DemoBeanIndex(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}	
	
	public void showUserName() {
		System.out.println(userName);
	}
	public void showCredentials()
	{
		System.out.println(userName+"/"+password);
	}
}
