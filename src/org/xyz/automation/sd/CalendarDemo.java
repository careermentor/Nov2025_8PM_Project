package org.xyz.automation.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CalendarDemo 
{

	WebDriver driver;
	
	
	@Test(enabled=true)
	public void icon_calendar1() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("SearchBoxTextDescription__title")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[aria-label='Fri Dec 19 2025 ']")).click();
		
Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[aria-label='Sat Dec 20 2025 ']")).click();
	}
	
	
	@Test(enabled=false)
	public void icon_calendar() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("commonModal__close")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[data-cy='departureDate']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("[aria-label='Sat Dec 20 2025']")).click();
		
	}	
	
	@Test(enabled=false)
	public void text_calendar() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://practice-automation.com/calendars/");
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("1990-05-17");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		driver.findElement(By.xpath("//button[text()='17']")).click();
		
		
	}
	
	
	
}
