package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.saucedemo.utilities.ReadPropFile;

public class LoginPage_PF
{

	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name")
	WebElement username_textbox;
	
	@FindBy(name="password")
	WebElement password_textbox;
	
	@FindBy(css="[type='submit']")
	WebElement loginbttn;
	
	public void enter_username_text(String uname) throws Exception
	{
		username_textbox.sendKeys(uname);
		
	}
	
	public void enter_password_text(String pass) throws Exception
	{
		password_textbox.sendKeys(pass);
		
	}
	
	public void click_login_button() throws Exception
	{
		loginbttn.click();
		
	}
	
}
