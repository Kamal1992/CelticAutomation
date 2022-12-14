package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class LoginPage {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='UserName']") WebElement LoginUserId;  
	@FindBy(xpath="//input[@id='Password']") WebElement LoginPassword;
	@FindBy(xpath="//input[@id='btnlogin']") WebElement LoginbtnLogin;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enterUsername(String username) throws Exception {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(LoginUserId,username);
	}
	public void enterPassword(String password) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(LoginPassword,password);
	}
	public void clickLoginBtn() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(LoginbtnLogin);
	}
	public void clickLoginBtn1() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(LoginPassword);
	}
}
