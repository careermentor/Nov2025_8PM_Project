package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.auto.saucedemo.utilities.ReadPropFile;

public class ProductSearchPage
{

	WebDriver driver;
	
	public ProductSearchPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void click_product_link() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("home_product_xpath"))).click();
		
	}
	
}
