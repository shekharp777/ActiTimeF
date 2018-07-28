package com.ActiTimeF.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActiTimeF.generic.BaseTest;
import com.ActiTimeF.generic.ExcelData;
import com.ActiTimeF.pages.LoginPage;

@Listeners(com.ActiTimeF.generic.ListenersTest.class)
public class InvalideLoginTest extends BaseTest {
	
	@Test(priority=2)
	public void testInvalidLogin()
	{
			//user name
			String un = ExcelData.getData(File_Path, "Sheet1", 2, 0);
			
			//password
			String pwd = ExcelData.getData(File_Path, "Sheet1", 2, 1);
			
			//login page title
			String lpTitle = ExcelData.getData(File_Path, "Sheet1", 3, 2);
			
			LoginPage lp=new LoginPage(driver);
			
			//To verify login page title
			lp.verifyingTitle(lpTitle);
			
			
			//enter invalid user name
			lp.enterUserName(un);
			System.out.println(un);

			//enter invalid password
			lp.enterPassword(pwd);
			System.out.println(pwd);
			
			//click on login
			lp.clickOnLogin();
			System.out.println("click on login");
			
			//verify error message
			lp.verifyErrorMessage();
			
	}

}
