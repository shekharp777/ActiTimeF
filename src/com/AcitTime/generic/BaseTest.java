package com.AcitTime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	@Parameters("myBrowser")
	@BeforeMethod
	public void preCondition(String myBrowser) 
	{
		
		if(myBrowser.equalsIgnoreCase("firefox"))
		{
		
			System.setProperty(gecko_key, gecko_value);
			driver= new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://localhost/login.do");
			
				
		}
		else if(myBrowser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(chrome_key,chrome_value);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		
		}
		
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}

}
