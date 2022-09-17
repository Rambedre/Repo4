//package com.TestClass;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//import com.BaseClass.BaseClass;
//import com.PageClass.HomepageClass;
//import com.UtilityFiles.ExtendReportsClass;
//
//@Listeners(ExtendReportsClass.class)
//public class HomeClassTC2 extends BaseClass{
//	
//	
//	@Test(priority = 1)
//	public void accountname() {
//		HomepageClass HPC = new HomepageClass(Driver);
//		SoftAssert soft = new SoftAssert();
//		String expectedtxt = "John Smith";
//		String actualtxt = HPC.accountname();
//		soft.assertNotEquals(actualtxt, expectedtxt);
//		soft.assertAll();
//		
//	}
//}
