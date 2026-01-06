package org.wipro.auto.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.saucedemo.utilities.ReadPropFile;

public class SignupPage
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccount_button() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("login_createnewaccount_xpath"))).click();
		
	}
	
	public void enter_firstname_text(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_firstname_name"))).sendKeys(fname);
		
	}
	
	public void enter_lastname_text(String lname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_lastname_name"))).sendKeys(lname);
		
	}
	
	
	public void select_dob_day(String day) throws Exception
	{
		Select dob_day = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_day_name"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void select_dob_month(String month) throws Exception
	{
		Select dob_month = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_month_name"))));
		dob_month.selectByVisibleText(month);
	}
	
	public void select_dob_year(String year) throws Exception
	{
		Select dob_year = new Select(driver.findElement(By.name(ReadPropFile.readelement("signup_dob_year_name"))));
		dob_year.selectByVisibleText(year);
	}
	
	
	public void click_gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelement("signup_gender_male_xpath"))).click();
		
	}
	
	public void enter_username_text(String uname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_username_name"))).sendKeys(uname);
		
	}
	
	public void enter_password_text(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_password_name"))).sendKeys(pass);
		
	}
	
	public void click_signup_button() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("signup_signupbttn_name"))).click();
		
	}
	
}
