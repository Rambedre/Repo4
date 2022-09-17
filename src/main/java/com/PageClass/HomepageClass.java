package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageClass {
	
	public HomepageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='John Smith']")
	private WebElement accountname;
	
	public String accountname() {
		String name = accountname.getText();
		return name;
	}
	
}
