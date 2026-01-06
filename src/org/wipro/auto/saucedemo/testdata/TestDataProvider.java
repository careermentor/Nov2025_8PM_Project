package org.wipro.auto.saucedemo.testdata;

import org.testng.annotations.DataProvider;

public class TestDataProvider
{

	@DataProvider(name="login")
	public Object[][] testdata1()
	{
		//String data1 = "user1";
		
		//Object[] data2 = {"user1", "pass1"};  //1-D array
		
		Object[][] data3 = {{"standard_user", "secret_sauce"},{"problem_user", "secret_sauce"},{"error_user", "secret_sauce"}};  //2-D array
		return data3;
		
	}
	
	@DataProvider(name="signup")
	public Object[][] testdata2()
	{
		//String data1 = "user1";
		
		//Object[] data2 = {"user1", "pass1"};  //1-D array
		
		Object[][] data3 = {{"John", "Leo", "user1", "pass1"},{"David", "Seo", "user2", "pass2"}};  //2-D array
		return data3;
		
	}
	
}
