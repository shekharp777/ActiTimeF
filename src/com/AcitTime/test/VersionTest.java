package com.AcitTime.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AcitTime.generic.BaseTest;
import com.AcitTime.generic.ExcelData;
import com.AcitTime.pages.LoginPage;

@Listeners(com.AcitTime.generic.ListenersTest.class)
public class VersionTest extends BaseTest {
	
	@Test(priority=3)
	public void testVersion()
	{
		
		
		//version of application
		String version = ExcelData.getData(File_Path, "Sheet1", 1, 3);
				
		
		//login page title
		String lpTitle = ExcelData.getData(File_Path, "Sheet1", 1, 2);
		
		LoginPage lp=new LoginPage(driver);
		
		//verify version
		lp.verifyVersion(version);
		System.out.println(version);
		
		//verify login page title
		lp.verifyingTitle(lpTitle);
		
		
		
		
	}
	
}
