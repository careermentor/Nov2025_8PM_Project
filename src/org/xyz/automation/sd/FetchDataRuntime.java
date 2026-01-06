package org.xyz.automation.sd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	@Test
	public void signup() throws Exception
	{
		
		driver = new EdgeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	
		
		//driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		
		//Thread.sleep(5000);
		
		
		//driver.findElement(By.id("email")).clear();
		
		System.out.println(driver.findElement(By.linkText("Create new account")).getLocation());
		
		System.out.println(driver.findElement(By.linkText("Create new account")).isEnabled());
		
		System.out.println(driver.findElement(By.linkText("Create new account")).isDisplayed());
		
		//System.out.println(driver.getPageSource());
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		
		
		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.name("lastname")).sendKeys("Seo");
		
		WebElement birth_day = driver.findElement(By.name("birthday_day"));
		Select day = new Select(birth_day);
		
		//day.selectByIndex(0);
		//day.selectByVisibleText("5");
		
		day.selectByValue("4");
		
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("May");
		//month.selectByVisibleText("jun");
		//month.selectByVisibleText("jul");
		
		//month.deselectByVisibleText("Jun");
		
		//month.selectByVisibleText("aug");
		
		//month.deselectAll();
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("2020");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("2345678900");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass12345");
		
		//driver.findElement(By.name("websubmit")).click();
		
		
		
	}
	
	
	
}
