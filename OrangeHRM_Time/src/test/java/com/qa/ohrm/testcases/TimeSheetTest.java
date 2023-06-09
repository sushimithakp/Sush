package com.qa.ohrm.testcases;

import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.TimePage;
import com.qa.ohrm.pages.TimeSheet;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TimeSheetTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	TimeSheet ts;
	
  @Test(priority=8)
  public void timeSheet() 
  {
	  ts.getTimeSheet();
	  
  }
  @Test(priority=9)
  public void employee()
  {
	  ts.enterEmployee();
  }
  
  @Test(priority=10)
  public void getRecord()
  {
	  ts.viewRecord();
  }
  
  @BeforeMethod
  public void launchURL() 
  {initialization();
  driver.get(prop.getProperty("url"));
  lp = new LoginPage();
  hp = new HomePage();
  tp = new TimePage();
  ts = new TimeSheet();
  lp.login();
  hp.clickTime(); 
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.close();
  }

}
