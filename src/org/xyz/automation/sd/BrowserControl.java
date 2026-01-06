package org.xyz.automation.sd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
	//	driver.close();  // one active window
		driver.quit();  //all the open window
		
	}
	
	
	
}
