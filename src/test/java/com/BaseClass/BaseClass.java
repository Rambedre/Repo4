package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import com.UtilityFiles.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver Driver;
	
	ReadConfig read = new ReadConfig(); 
	
	
	public String mainURL = read.BaseURL();
	public String mainUserName = read.uname();
	public String mainPassword = read.passw();
	
	@Parameters({"browser"})
	@BeforeTest
	public void browserOpen(@Optional("chrome") String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
		}
		else {
			throw new RuntimeException("Invalid Browser Value");
		}
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	
	@AfterTest 
	public void Browserclose() throws InterruptedException {
		Thread.sleep(5000);
		Driver.close();
	}
}
