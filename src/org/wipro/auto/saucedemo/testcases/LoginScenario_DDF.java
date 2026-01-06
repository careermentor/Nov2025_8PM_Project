package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basePkg.InitiateBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.testdata.TestDataProvider;

public class LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="login",dataProviderClass=TestDataProvider.class)
	public void tc01_validate_login_successful_valid_credential(String username, String password) throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_text(username);
		
		login.enter_password_text(password);
		
		login.click_login_button();
		
		
	}
			
	
	
}
