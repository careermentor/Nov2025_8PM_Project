package org.xyz.automation.sd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoLists 
{

	WebDriver driver;
	
	
	
	@Test
	public void validate_valid_loginPage() throws Exception
	{
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username_textbox = driver.findElement(By.id("user-name"));
		username_textbox.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> productlist = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
		
		System.out.println(productlist.size());
		
		//productlist.get(1).click();
		if(productlist.size()>0)
		{
			for(WebElement alllink:productlist )
			{
				System.out.println(alllink.getText());
			}
		}
		
		
		
	}
	}
