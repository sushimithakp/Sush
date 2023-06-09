package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ohrm.base.TestBase;


public class LoginPage extends TestBase
{
	
		@FindBy(id = "txtUsername")
		WebElement username;

		@FindBy(id = "txtPassword")
		WebElement password;

		@FindBy(id = "btnLogin")
		WebElement login;
		
		public LoginPage() 
		{
			PageFactory.initElements(driver, this);
		}
		
		public String getLoginPageTitle()
		{
			
			return driver.getTitle();
		}
		public HomePage login()
		{
			username.sendKeys(prop.getProperty("username"));
			password.sendKeys(prop.getProperty("password"));
			login.click();
			return new HomePage();
		}
}
