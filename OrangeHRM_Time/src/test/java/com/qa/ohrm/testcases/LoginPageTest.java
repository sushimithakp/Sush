package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase
{
	
	LoginPage lp;
	HomePage hp;
	
	
  @Test(priority=0)
  public void title()
  {
	 String title =lp.getLoginPageTitle();
	 Assert.assertEquals(title, prop.getProperty("title"));
	 System.out.println(title);
  }
  
  @Test(priority=1)
  public void loginSuccess()
  {
	  lp.login();
  }
  @BeforeMethod
  public void launchURL() 
  {
	  initialization();
	   lp = new LoginPage();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
