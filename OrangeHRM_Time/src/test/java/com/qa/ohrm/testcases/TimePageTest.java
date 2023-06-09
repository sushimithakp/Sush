package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.PunchIn;
import com.qa.ohrm.pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TimePageTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	PunchIn pi;
	
	
  @Test(priority=3)
  public void clickAttendance()
  {
	  tp.Attendance();
  }
  
 
   @BeforeMethod
  public void launchTimePage()
  {
	  initialization();
	  driver.get(prop.getProperty("url"));
	  lp = new LoginPage();
	  hp = new HomePage();
	  tp = new TimePage();
	  pi = new PunchIn();
	  lp.login();
	  hp.clickTime();
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}
