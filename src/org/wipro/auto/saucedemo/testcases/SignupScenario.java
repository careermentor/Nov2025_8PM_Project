package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basePkg.InitiateBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_signup_successful_valid_data() throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		
		signup.click_createnewaccount_button();
		signup.enter_firstname_text("John");
		signup.enter_lastname_text("Leo");
		signup.select_dob_day("25");
		signup.select_dob_month("Jul");
		signup.select_dob_year("1999");
		
		signup.click_gender_male();
		
		signup.enter_username_text("user123");
		signup.enter_password_text("Test12345");
		//signup.click_signup_button();
		
	}
			
	
}
