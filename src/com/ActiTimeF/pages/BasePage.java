package com.ActiTimeF.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BasePage {
	
	public static WebDriver driver;

	public BasePage(WebDriver driver)
	{
		BasePage.driver=driver;
	}
	
	//To verify the title
	public static void verifyTitle(String eTitle)
	{
		String title=driver.getTitle();
		System.out.println("\nLoginPage Title: "+title);
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching\n",true);
			
		}
		catch(Exception e)
		{
			SoftAssert sa =new SoftAssert();
			Reporter.log("\n\nTitle is not matching"+e,true);
			sa.assertAll();
		}
		
	}
	
		//To verify the element
		public static void verifyElement(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			
			try 
			{
				wait.until(ExpectedConditions.visibilityOf(element));
				Reporter.log("Element is present"+element.getText(),true);
			}
			
			catch(Exception e)
			{
				Reporter.log("Element not present"+e,true);
				Assert.fail();
			}
			

		}
}
