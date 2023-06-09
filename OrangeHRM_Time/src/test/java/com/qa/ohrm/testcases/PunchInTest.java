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

public class PunchInTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	PunchIn pi;
	PunchOut po;
	
	
  @Test(priority=4)
  public void Note()
  {
	  pi.enterNote();
  }
  
  @Test(priority=5)
  public void In()
  {
	  pi.clickIn();
  }
  
  
  @BeforeMethod
  public void launch() 
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
  }
  

  @AfterMethod
  public void closeBrowser()
  {
	  driver.close();
  }

}
