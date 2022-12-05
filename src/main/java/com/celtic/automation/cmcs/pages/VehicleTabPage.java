package com.celtic.automation.cmcs.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleTabPage {
	private WebDriver driver;
	public VehicleTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Elements for SiteMappage
	@FindBy(xpath="//div[@class='validation-summary-errors clearfix']") WebElement vehicleValidateMessage;
	@FindBy(css ="#contentMsg > div > ul > li > span") WebElement vehicleVerificationMessage;
	@FindBy(css ="#contentMsg > div > ul") WebElement vehicleVerificationMessage2;
	@FindBy(css ="#contentMsg > div > ul > li:nth-child(1) > span") WebElement vehicleVerificationMessage3;
	@FindBy(css ="#contentMsg > div > ul > li:nth-child(2) > span") WebElement vehicleVerificationMessage4;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement vehicleRenewalDetailsSubHdr;
	@FindBy(xpath="//label[@for='NoOfAmendVeh']") WebElement vehicleAmendedVehiclesLbl;
	@FindBy(xpath="//input[@id='NoOfAmendVeh']") WebElement vehicleAmendedVehiclesTxt;
	
	@FindBy(xpath="//label[@for='NoOfAddVeh']") WebElement vehicleAddedVehiclesLbl;
	@FindBy(xpath="//input[@id='NoOfAddVeh']") WebElement vehicleAddedVehiclesTxt;
	
	@FindBy(xpath="//label[@for='NoOfDelVeh']") WebElement vehicleDeleteVehiclesLbl;
	@FindBy(xpath="//input[@id='NoOfDelVeh']") WebElement vehicleDeleteVehiclesTxt;
	
	@FindBy(xpath="//label[@for='NoOfRenewVeh']") WebElement vehicleRenewVehiclesLbl;
	@FindBy(xpath="//input[@id='NoOfRenewVeh']") WebElement vehicleRenewVehiclesTxt;
	
	@FindBy(xpath="//input[@id='VehicleAction' and contains(@title,'AMEND')]") WebElement vehicleAmendRd; 
	@FindBy(xpath="//input[@id='VehicleAction' and contains(@title,'DELETE')]") WebElement vehicleDeleteRd; 
	@FindBy(xpath="//input[@id='VehicleAction' and contains(@title,'Add')]") WebElement vehicleAddRd;
	
	@FindBy(xpath="//input[@id='btnUpdateFromPrevYear']") WebElement vehicleUpdateFromPreviousYearBtn;
	@FindBy(xpath="//input[@id='btnVehicleList']") WebElement vehicleVehicleListBtn;
	
	
	@FindBy(xpath="//table[@id='gvVehicleList']//tr[contains(@class,'odd') or contains(@class,'even')]") List<WebElement> vehicleListRows;
	@FindBy(xpath="(//td//a[@id='lnkGridSelectgvVehicleList'])") List<WebElement>  handImgsList;
	
	public void clickAmendVehicleRadioButton() {
		new ElementUtil(driver,ConfigReader.log).clickElement(vehicleAmendRd);
	}
	public void clickDeleteVehicleRadioButton() {
		new ElementUtil(driver,ConfigReader.log).clickElement(vehicleDeleteRd);
	}
	public void clickAddVehicleRadioButton() {
		new ElementUtil(driver,ConfigReader.log).clickElement(vehicleAddRd);
	}
	public void clickUpdateFromPreviousYear() {
		new ElementUtil(driver,ConfigReader.log).clickElement(vehicleUpdateFromPreviousYearBtn);
	}
	public void clickVehicleList() {
		new ElementUtil(driver,ConfigReader.log).clickElement(vehicleVehicleListBtn);
	}
@SuppressWarnings("unlikely-arg-type")
public void validateAmendedVehiclesCount(String amendedVehiclesCount) {
	assert equals(vehicleAmendedVehiclesTxt.getAttribute("value").toString().equalsIgnoreCase(amendedVehiclesCount)); 
}
@SuppressWarnings("unlikely-arg-type")
public void validateDeleteVehiclesCount(String amendedVehiclesCount) {
	assert equals(vehicleDeleteVehiclesTxt.getAttribute("value").toString().equalsIgnoreCase(amendedVehiclesCount)); 
}


public void selectRow(String unitValue) {
	for(int i=1;i<=vehicleListRows.size();i++) {
		WebElement Unitvalueineachrow=driver.findElement(By.xpath("//table[@id='gvVehicleList']//tr[contains(@class,'odd') or contains(@class,'even')]["+i+"]//td[contains(@class,'white')]"));
		new ElementUtil(driver,ConfigReader.log);
		ElementUtil.highlightElement(driver, handImgsList.get(i-1));
		new ElementUtil(driver,ConfigReader.log);
		ElementUtil.highlightElement(driver, Unitvalueineachrow);
		if(Unitvalueineachrow.getText().equals(unitValue)){
		new ElementUtil(driver,ConfigReader.log).clickElement(handImgsList.get(i-1));
		break;
	}
	
	}
}

//Fetch values
public String fetchAmendVehicleLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleAmendedVehiclesLbl);
}
public String fetchAmendVehicle() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleAmendedVehiclesTxt, "value");
}

public String fetchAddVehiclesLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleAddedVehiclesLbl);
}
public String fetchAddVehicles() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleAddedVehiclesTxt, "value");
}

public String fetchDeleteVehicleLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleDeleteVehiclesLbl);
}
public String fetchDeleteVehicle() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleDeleteVehiclesTxt, "value");
}

public String fetchRenewVehicleLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleRenewVehiclesLbl);
}
public String fetchRenewVehicle() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(vehicleRenewVehiclesTxt, "value");
}
public void vehicleValidateMessage() {
	new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, vehicleValidateMessage);
}
public String vehicleValidateMessage1() {
	 
	 new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, vehicleVerificationMessage);
	 return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleVerificationMessage);
}


public String vehicleValidateMessage2() {
	 new ElementUtil(driver,ConfigReader.log).waitUntilElementVisible(vehicleVerificationMessage2);
	 new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, vehicleVerificationMessage2);
	 return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleVerificationMessage2);
}
public String vehicleValidateMessage3() {
	 
	 new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, vehicleVerificationMessage3);
	 return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleVerificationMessage3);
}
public String vehicleValidateMessage4() {
	 
	 new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, vehicleVerificationMessage4);
	 return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleVerificationMessage4);
}
 
}
