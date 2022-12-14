package com.celtic.automation.cmcs.pages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;


public class Enquiry {
	private WebDriver driver;
	public Enquiry(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//Fleet Enquiry
@FindBy(xpath="//table[@id='FltInquiryGrid']") WebElement fleetEnquiryGrid;
@FindBy(xpath="//td[contains(@class,'leftAlign')]") List<WebElement> fleetEnquiryRowValues;

//Supplement Enquiry
@FindBy(xpath="//input[@id='AccountNO']") WebElement supplementEnquiryAccountNo;
@FindBy(xpath="//table[@id='supplementInquiryGrid']") WebElement supplementEnquiryGrid;

//Vehicle Enquiry
@FindBy(xpath="//table[@id='VehInquiryGrid']") WebElement vehicleEnquiryGrid;
@FindBy(xpath="//th[contains(@aria-label,'VIN')]") WebElement vehicleEnquiryVIN;
@FindBy(xpath="//th[contains(@aria-label,'Unit')]") WebElement vehicleEnquiryUnitNo;

//Vehicle Supplement Enquiry
@FindBy(xpath="//table[@id='gvVinTransInquiryGrid']") WebElement vehicleSupplementEnquiryGrid;
//Fleet Enquiry

@SuppressWarnings("unused")
public void fleetenquiryvaluevalidation(String valueCheck) {
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(fleetEnquiryGrid)) {
		for(int i=0;i<fleetEnquiryRowValues.size();i++) {
			if(fleetEnquiryRowValues.get(i).getText().equalsIgnoreCase(valueCheck))
				assert true;
			break;
		}
	}
}

//Supplement Enquiry
public void entersupplementEnquiryAccountNo(String accountNoValue) throws IOException {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(supplementEnquiryAccountNo,accountNoValue);
}
@SuppressWarnings("unused")
public void SupplementEnquiryvaluevalidation(String valueCheck) {
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(supplementEnquiryGrid)) {
		for(int i=0;i<fleetEnquiryRowValues.size();i++) {
			if(fleetEnquiryRowValues.get(i).getText().equalsIgnoreCase(valueCheck))
				assert true;
			break;
		}
	}
}
//Vehicle Enquiry

public void clickVehicleEnquiryUnitNo() {
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(vehicleEnquiryGrid)) {
		if(!(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleEnquiryUnitNo,"class").contains("asc"))) {
			new ElementUtil(driver,ConfigReader.log).clickElement(vehicleEnquiryUnitNo); 
		}
	}
}

public String fetchVehicleEnquiryVIN(String i,String yearValue) {
	String VIN_TableValue=null;
	WebElement ExpiryYear=driver.findElement(By.xpath("//table[@id='VehInquiryGrid']/tbody/tr["+i+"]/td[5]"));
	WebElement VIN=driver.findElement(By.xpath("//table[@id='VehInquiryGrid']/tbody/tr["+i+"]/td[6]"));
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(vehicleEnquiryGrid)) {
		if(ExpiryYear.getText().equalsIgnoreCase(yearValue)) {
			VIN_TableValue=new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(VIN);
		}
	}
	return VIN_TableValue;
}
//Vehicle Supplement Enquiry
public void clickVehicleSupplementUnitNo() {
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(vehicleSupplementEnquiryGrid)) {
		if(!(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleEnquiryUnitNo,"class").contains("asc"))) {
			new ElementUtil(driver,ConfigReader.log).clickElement(vehicleEnquiryUnitNo); 
		}
	}
}

public String FetchVehicleSupplementEnquiryVIN(String i,String YearValue) {
	String VIN_TableValue=null;
	WebElement ExpiryYear=driver.findElement(By.xpath("//tr["+i+"]//td[contains(@class,'Alignment')][4]"));
	WebElement VIN=driver.findElement(By.xpath("//tr["+i+"]//td[contains(@class,'Alignment')][8]"));
	new ElementUtil(driver,ConfigReader.log);
	if(ElementUtil.isPresentAndDisplayed(vehicleSupplementEnquiryGrid)) {
		if(ExpiryYear.getText().equalsIgnoreCase(YearValue)) {
			VIN_TableValue=new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(VIN);
		}
	}
	return VIN_TableValue;
}














}
