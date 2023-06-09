package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;

public class HomePage extends TestBase
{
	@FindBy(id ="menu_time_viewTimeModule")
	WebElement time;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public TimePage clickTime()
	{
		
		time.click();
		String title =driver.getTitle();
		System.out.println(title);
		return new TimePage();
	}
}
