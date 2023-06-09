package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class PunchIn extends TestBase
{
	@FindBy(id="currentDate")
	WebElement Date;
	
	@FindBy(id="currentTime")
	WebElement Time;
	
	@FindBy(id ="note")
	WebElement Note;
	
	@FindBy(id="btnPunch")
	WebElement In;
	
	
	public PunchIn()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterNote()
	{
		Note.click();
		Note.sendKeys("GoodMorning");
	}
	
	public PunchOut clickIn()
	{
		In.click();
		return new PunchOut();
	}
	
	
	
	
}
