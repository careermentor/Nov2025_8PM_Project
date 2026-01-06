package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basePkg.InitiateBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.pages.SignupPage;
import org.wipro.auto.saucedemo.testdata.TestDataProvider;

public class SignupScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="signup",dataProviderClass=TestDataProvider.class)
	public void tc01_validate_signup_successful_valid_data(String fname, String lname, String uname, String pass) throws Exception
	{
		SignupPage signup = new SignupPage(driver);
		
		signup.click_createnewaccount_button();
		signup.enter_firstname_text(fname);
		signup.enter_lastname_text(lname);
		signup.select_dob_day("25");
		signup.select_dob_month("Jul");
		signup.select_dob_year("1999");
		
		signup.click_gender_male();
		
		signup.enter_username_text(uname);
		signup.enter_password_text(pass);
		//signup.click_signup_button();
		
	}
			
	
}
