package com.crm.SDET26_Git;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo456Test {
	
	@Test (dataProvider = "getdataprovider")
	public void travelinfo (String src, String dest) {
		System.out.println("From: " + src + " we travelled to " +  dest);
	}
	
	@DataProvider
	public Object[][] getdataprovider() {
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "Bangalore";
		obj[0][1] = "Mysore";
		
		obj[1][0] = "Bangalore";
		obj[1][1] = "Madikeri";
		
		obj[2][0] = "Bangalore";
		obj[2][1] = "Mumbai";
		
		obj[3][0] = "Bangalore";
		obj[3][1] = "Hyderabad";
		
		return obj;
	}
}
