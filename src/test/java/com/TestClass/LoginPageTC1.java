package com.TestClass;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BaseClass.BaseClass;
import com.PageClass.LoginPageClass;
import com.UtilityFiles.ExtendReportsClass;

@Listeners(ExtendReportsClass.class)
public class LoginPageTC1 extends BaseClass{
	
	@Test(priority = 1)
	public void text1test() {
		Driver.get(mainURL);
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String Expectedtxt = "Admin area demo";
		String ActualTxt = LPC.text1();
		soft.assertEquals(ActualTxt, Expectedtxt);
		soft.assertAll();
	}
	
	@Test(priority = 2)
	public void text2test() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String Expectedtxt = "Welcome, please sign in!";
		String Actualtxt = LPC.text2();
		soft.assertEquals(Actualtxt, Expectedtxt);
		soft.assertAll();
	}
	
	@Test (priority = 3)
	public void login() {
		
		LoginPageClass LPC = new LoginPageClass(Driver);
		LPC.cleartabuname();
		LPC.cleartabpassw();
		LPC.creds(mainUserName, mainPassword);
		Assert.assertTrue(LPC.loginbtn().isDisplayed());
		LPC.loginbtn().click();
		
	}
}
