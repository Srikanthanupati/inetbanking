package com.inet.TestCases;

import org.testng.annotations.Test;

import com.inet.pageObjects.LoginPage;

public class Login_TestCase001 extends BaseClass
{
	@Test
	public void Login_test() 
	{
		driver.get(url);
	
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(UserName);
		lp.SetPassword(Pasword);
		lp.Login();
	}
	
	
}
