package org.xyz.automation.sd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomationScript 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
		
	}
	
	
	@Test(enabled=false)
	public void validate_valid_loginPage()
	{
		WebElement username_textbox = driver.findElement(By.id("user-name"));
		username_textbox.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test
	public void validate_invalid_loginPage()
	{
		
		WebElement username_textbox = driver.findElement(By.id("user-name"));
		username_textbox.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce123");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("[data-test='error']")), "Epic sadface: Username and password do not match any user in this service"));
		
		driver.findElement(By.cssSelector("[data-test='error']")).getText();
		
		
		
	}
	
}
