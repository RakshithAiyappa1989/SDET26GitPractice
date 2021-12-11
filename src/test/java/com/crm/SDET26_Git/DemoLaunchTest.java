package com.crm.SDET26_Git;

import org.testng.annotations.Test;

public class DemoLaunchTest {
	@Test
	public void demoLaunchTest () {
		String URL = System.getProperty("url");
		String browser = System.getProperty("browser");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		
	}
}
