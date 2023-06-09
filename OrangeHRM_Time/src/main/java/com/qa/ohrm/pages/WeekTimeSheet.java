package com.qa.ohrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.ohrm.base.TestBase;

public class WeekTimeSheet extends TestBase
{
	@FindBy(id="btnEdit")
	WebElement Edit;
	
	@FindBy(id="btnSubmit")
	WebElement Submit;
	
	@FindBy(xpath="//h2[contains(text(), 'Submitted')]")
	WebElement Status;
	
	@FindBy(id="btnAddRow")
	WebElement AddRow;
	
	@FindBy(id="submitRemoveRows")
	WebElement RemoveRow;
	
	@FindBy(id="btnReset")
	WebElement Reset;
	
	@FindBy(id="btnBack")
	WebElement Cancel;
	
	public WeekTimeSheet()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickEdit()
	{
		Edit.click();
	}
	
	public void addRow()
	{
		AddRow.click();
	}
	/*public void removeRow()
	{
		RemoveRow.click();
	}*/
	public void reset()
	{
		Reset.click();
	}
	public void cancel()
	{
		Cancel.click();
	}
	/* cannot find submit button once the data is submitted
	public void clickSubmit()
	{
		Submit.click();
		String text = Status.getText();
		 System.out.println(text);
		Assert.assertEquals(text, "Submitted");
	}*/
}
