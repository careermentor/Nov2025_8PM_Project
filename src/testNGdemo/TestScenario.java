package testNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScenario 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
		//Assert.assertEquals("Hello", "Hello World"); //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Hello", "Hello World");
		
		
		
		System.out.println("This test case is failed");
		
		sa.assertAll();
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test(enabled=false)
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test(priority=0)
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	@Test(priority=-1)
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test(priority=-2)
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
