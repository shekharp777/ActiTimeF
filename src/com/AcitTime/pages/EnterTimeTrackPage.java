package com.AcitTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EnterTimeTrackPage extends BasePage {

	//Declaration
	@FindBy(id="logoutLink")
	private WebElement logoutBTN;
	
	
	//Initialization
	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);

		PageFactory.initElements(driver, this);
	}

	//Utilization
		public void clickOnLogOut()
		{
			try
			{
			logoutBTN.click();
			}
			catch(Exception e)
			{
				
			}
		}
		
}
