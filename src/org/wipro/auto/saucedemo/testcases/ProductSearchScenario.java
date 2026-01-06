package org.wipro.auto.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.saucedemo.basePkg.InitiateBrowser;
import org.wipro.auto.saucedemo.pages.LoginPage;
import org.wipro.auto.saucedemo.pages.LoginPage_PF;
import org.wipro.auto.saucedemo.pages.ProductSearchPage;

public class ProductSearchScenario extends InitiateBrowser
{

	@Test
	public void Test_Case_9_Search_Product() throws Exception
	{
		ProductSearchPage product = new ProductSearchPage(driver);
		
		product.click_product_link();
		
		
	}
	
}
