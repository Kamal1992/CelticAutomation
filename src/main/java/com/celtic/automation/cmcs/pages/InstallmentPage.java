package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class InstallmentPage {

	
	private WebDriver driver;
	public InstallmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#contentMsg > div > ul > li:nth-child(1) > span") WebElement installmentPaymentMessage1;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(2) > span") WebElement installmentPaymentMessage2;
	
	@FindBy(xpath="//a[@title='Installment Payment']") WebElement installmentPayment;
	@FindBy(xpath="//a[@id='lnkGridSelectCustomerGrid']") WebElement installmentPaymentGrid;

	
	public void clickInstallmentPayment() {
		new ElementUtil(driver,ConfigReader.log).clickElement(installmentPayment);
	}
	public void clickGrid() {
		new ElementUtil(driver,ConfigReader.log).clickElement(installmentPaymentGrid);
	}
	
public String validateMessage1() {
		new ElementUtil(driver,ConfigReader.log);
		ElementUtil.highlightElement(driver, installmentPaymentMessage1);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(installmentPaymentMessage1);
	}
	public String validateMessage2() {
		new ElementUtil(driver,ConfigReader.log);
		ElementUtil.highlightElement(driver, installmentPaymentMessage2);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(installmentPaymentMessage2);
		
	}

}
