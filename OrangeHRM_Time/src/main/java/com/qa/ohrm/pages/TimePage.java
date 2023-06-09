package com.qa.ohrm.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class TimePage extends TestBase
{
	@FindBy(id="menu_attendance_Attendance")
	WebElement Attendance;
	
	@FindBy(id="menu_attendance_punchIn")
	WebElement PunchInOut;
	
	public TimePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Attendance()
	{
		Attendance.click();
	}
	
	public PunchIn PunchInOut()
	{
		PunchInOut.click();
		return new PunchIn();
	}

	
}
