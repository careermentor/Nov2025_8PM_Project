package org.xyz.automation.sd;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardMouse 
{

	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.testresult(driver,"handleFrames");
		
	}
		
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		CaptureScreenshot.testresult(driver,"handleAlerts_1");
		
		driver.findElement(By.className("signin-btn")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresult(driver,"handleAlerts_2");
		
	}
	
	
	@Test(enabled=false)
	public void handlemouse() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//act.doubleClick(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).perform();
		
		//control + click
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[text()=' HealthCare ']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsid = driver.getWindowHandles();
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		
		//driver.switchTo().window(win1);
		
		/*
		WebElement loc1 = driver.findElement(By.xpath(""));
		WebElement loc2 = driver.findElement(By.xpath(""));
		act.dragAndDrop(loc1, loc2).perform();
		*/
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("modisantosh1@gmail.com").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass12345").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
	}
	
	
	
}
