package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class PunchOut extends TestBase
{
	@FindBy(id="note")
	WebElement Note;
	
	
	@FindBy(id="btnPunch")
	WebElement Out;
	
	public PunchOut()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickNote()
	{
		Note.click();
		Note.sendKeys("ThankYou");
	}
	
	public PunchIn clickOut()
	{
		Out.click();
		return new PunchIn();
		
	}
	
}
