package com.qa.ohrm.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.ohrm.base.TestBase;
import com.qa.ohrm.pages.HomePage;
import com.qa.ohrm.pages.LoginPage;
import com.qa.ohrm.pages.TimePage;
import com.qa.ohrm.pages.TimeSheet;
import com.qa.ohrm.pages.WeekTimeSheet;

public class WeekTimeSheetTest extends TestBase
{
	LoginPage lp;
	HomePage hp;
	TimePage tp;
	TimeSheet ts;
	WeekTimeSheet wts;
	
  @Test(priority=11)
  public void edit()
  {
	  wts.clickEdit();
  }
  
  @Test(priority=12)
  public void clickAddRow()
  {
	  wts.clickEdit();
	  wts.addRow();
  }
  
  /*@Test(priority=13)
  public void clickRemoveRow()
  {
	  wts.removeRow();
  }*/
  
  @Test(priority=13)
  public void clickReset()
  {
	  wts.clickEdit();
	  wts.reset();
  }
  @Test(priority=14)
  public void clickCancel()
  {
	  wts.clickEdit();
	  wts.cancel();
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
  ts.getTimeSheet();
  ts.enterEmployee();
  ts.viewRecord();
  wts = new WeekTimeSheet();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.close();
  }

}
