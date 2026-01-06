package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basePkg.InitiateBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;

public class LoginScenario extends InitiateBrowser
{

	@Test
	public void tc01_validate_login_successful_valid_credential() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_text("standard_user");
		
		login.enter_password_text("secret_sauce");
		
		login.click_login_button();
		
		//because "this.driver" is null
		
	}
			
	@Test
	public void tc02_validate_login_failed_invalid_credential() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_text("error_user");
		
		login.enter_password_text("secret_sauce");
		
		login.click_login_button();
		
		//because "this.driver" is null
		
	}
}
