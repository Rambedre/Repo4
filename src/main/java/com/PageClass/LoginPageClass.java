package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	WebDriver Driver; 
	
	public LoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement email;
	
	public void cleartabuname() {
		email.clear();
	}
	
	
	public String gettitle() {
		String title = Driver.getTitle();
		return title;
	}
	
	
	@FindBy(id = "Password")
	private WebElement password;
	
	public void cleartabpassw() {
		password.clear();
	}
	
	public void creds(String uname, String passw) {
		email.sendKeys(uname);
		password.sendKeys(passw);
	}
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement LoginBtn;
	
	public WebElement loginbtn() {
		WebElement logbtn = LoginBtn;
		return logbtn;
	}
	
	@FindBy(xpath = "//h1[text()='Admin area demo']")
	private WebElement text1;
	
	public String text1() {
		String txt1 = text1.getText();
		return txt1;
	}
	
	@FindBy(xpath = "//strong[text()='Welcome, please sign in!']")
	private WebElement text2;
	
	public String text2() {
		String txt = text2.getText();
		return txt;
	}
	
}
