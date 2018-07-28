package com.ActiTimeF.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActiTimeF.generic.BaseTest;
import com.ActiTimeF.generic.ExcelData;
import com.ActiTimeF.pages.EnterTimeTrackPage;
import com.ActiTimeF.pages.LoginPage;

@Listeners(com.ActiTimeF.generic.ListenersTest.class)
public class ValidLoginLogoutTest extends BaseTest {

	@Test(priority=1)
	public void testValidLogin()
	{
				
				
				//user name
				String un = ExcelData.getData(File_Path, "Sheet1", 1, 0);
				
				//password
				String pwd = ExcelData.getData(File_Path, "Sheet1", 1, 1);
				
				//login page title
				String loginTitle = ExcelData.getData(File_Path, "Sheet1", 1, 2);
						
				
				//enter time track title
				String enterTimeTitle = ExcelData.getData(File_Path, "Sheet1", 2, 2);
				
				
				LoginPage lp=new LoginPage(driver);
				EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);
				
				//verify login page title
				lp.verifyingTitle(loginTitle);
				
				//enter valid user name
				lp.enterUserName(un);
				System.out.println(un);

				//enter valid password
				lp.enterPassword(pwd);
				System.out.println(pwd);
				
				
				//click on login
				lp.clickOnLogin();
				System.out.println("click on login");
				
				
				
				//verify enter time track page title
				lp.verifyingTitle(enterTimeTitle);
				
				//click on logout
				ep.clickOnLogOut();
				System.out.println("click on logout");
				
				
	}

}
