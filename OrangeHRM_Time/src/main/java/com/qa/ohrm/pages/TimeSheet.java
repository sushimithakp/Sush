package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class TimeSheet extends TestBase
{
	@FindBy(id="menu_time_Timesheets")
	WebElement timeSheet;
	
	@FindBy(id="employee")
	WebElement eName;
	
	@FindBy(id="btnView")
	WebElement view;
	
	@FindBy(xpath="//li[@class ='ac_even ac_over']")
	WebElement suggestion;
	
	public TimeSheet()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getTimeSheet()
	{
		timeSheet.click();
	}
	
	public void enterEmployee()
	{
		eName.click();
		eName.sendKeys("s");
		suggestion.click();
	}
	
	public WeekTimeSheet viewRecord()
	{
		view.click();
		return new WeekTimeSheet();
	}
}
