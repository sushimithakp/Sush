package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	
	
  @Test(priority=2)
  public void getTimePage()
  {
	  hp.clickTime();
  }
  @BeforeMethod
  public void setUp() 
  {
	  initialization();
	  driver.get(prop.getProperty("url"));
	  lp = new LoginPage();
	  hp = new HomePage();
	  tp = new TimePage();
	  lp.login();
	 
	  
  }

  @AfterMethod
  public void breakDown() 
  {
	  driver.quit();
  }

}
