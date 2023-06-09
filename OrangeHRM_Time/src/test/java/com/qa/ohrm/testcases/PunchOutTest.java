package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.PunchIn;
import com.qa.ohrm.pages.PunchOut;
import com.qa.ohrm.pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PunchOutTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	PunchIn pi;
	PunchOut po;
	
	
  @Test(priority=6)
  public void enterNote() 
  {
	  po.clickNote();
  }
  
  @Test(priority=7)
  public void Out()
  {
	  po.clickOut();
  }
  
  @BeforeMethod
  public void launchBrowser()
  {
	  initialization();
	  driver.get(prop.getProperty("url"));
	  lp = new LoginPage();
	  hp = new HomePage();
	  tp = new TimePage();
	  pi = new PunchIn();
	  po = new PunchOut();
	  lp.login();
	  hp.clickTime(); 
	  tp.Attendance();
	  tp.PunchInOut();
	  pi.clickIn();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.close();
  }

}
