package org.xyz.automation.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDifferentControl 
{

	WebDriver driver;
	
	@Test
	public void signup() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		String expURL = "https://www.facebook.com/";
		
		driver.get(expURL);  //action will be taken
		
		String actURL = driver.getCurrentUrl();
		
		Assert.assertEquals(actURL, expURL);
		
		String expPageTitle = "Facebook – log in or sign up";
		
		String actPageTitle = driver.getTitle();
		System.out.println(actPageTitle);
		
		Assert.assertEquals(actPageTitle, expPageTitle);
		
		String Exp_username_text = "Email address or phone number";
		
		String Act_username_text= driver.findElement(By.id("email")).getAttribute("placeholder");
		
		System.out.println(Act_username_text);
		
		Assert.assertEquals(Act_username_text, Exp_username_text);
		
		/*
		String exp_login_button = "Log in";
		
		String act_login_button = driver.findElement(By.name("login")).getText();
		
		Assert.assertEquals(act_login_button, exp_login_button);
		*/
		
		Assert.assertEquals(driver.findElement(By.name("login")).getText(), "Log in");
		
			
		}
	
	
	
}
