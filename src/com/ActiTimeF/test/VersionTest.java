package com.ActiTimeF.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActiTimeF.generic.BaseTest;
import com.ActiTimeF.generic.ExcelData;
import com.ActiTimeF.pages.LoginPage;

@Listeners(com.ActiTimeF.generic.ListenersTest.class)
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
