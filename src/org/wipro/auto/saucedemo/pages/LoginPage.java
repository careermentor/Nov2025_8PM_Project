package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.saucedemo.utilities.ReadPropFile;

public class LoginPage
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void enter_username_text(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("login_username_id"))).sendKeys(uname);
		
	}
	
	public void enter_password_text(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("login_password_name"))).sendKeys(pass);
		
	}
	
	public void click_login_button() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelement("login_loginbttn_css"))).click();
		
	}
	
}
