package org.wipro.auto.saucedemo.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	public static void testresult(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //capture screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./screenshot/Smoke/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
		
		//String loc = "India";
		
		//System.out.println("I live in " + loc + " it is also IT Hub");
		
		
	}
	
}
