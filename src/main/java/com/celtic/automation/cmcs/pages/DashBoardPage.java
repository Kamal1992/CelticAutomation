package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class DashBoardPage {
	private WebDriver driver;
	
	@FindBy(xpath="//a[@title='Services']") WebElement dashboardServicesLink;
	@FindBy(xpath="//a[@title='IRP']") WebElement dashboardIRPLink;
	@FindBy(xpath="//a[@title='Enterprise']") WebElement dashboardEnterpriseLink;
	
	@FindBy(xpath="//div[@class='PageHeader row']") WebElement dashboardHeader;
	@FindBy(xpath="//div[@class='PageHeader row']//li[contains(@class,'breadcrumb-item')]") WebElement dashboardSecondRow;
	@FindBy(xpath="//div[@class='PageHeader row']//li[contains(@class,'breadcrumb-item')]/strong") WebElement dashboardIRPHeader;
	//Links
	@FindBy(xpath="//a[@title='Renew Fleet']") WebElement dashboardRenewFleetLink;
	@FindBy(xpath="//a[@title='Fleet Inquiry']") WebElement dashboardFleetEnquiry;
	@FindBy(xpath="//a[@title='Supplement Continuance']") WebElement dashboardSupplementContinuancelnk;
	@FindBy(xpath="//a[@title='Vehicle Inquiry']") WebElement dashboardVehicleEnquiry;
	@FindBy(xpath="//a[@title='Vehicle Supplement Inquiry']") WebElement dashboardVehicleSupplementEnquiry;
	@FindBy(xpath="//a[@title='Supplement Inquiry']") WebElement dashboardSupplementEnquiry;
	@FindBy(xpath="//a[@title='Account Inquiry']") WebElement dashboardAccountEnquiry;
	@FindBy(xpath="//a[@title='Supplement Documents']") WebElement dashboardSupplementDocuments;
@FindBy(xpath="//a[@title='Logout']") WebElement dashboardLogout;	
//@FindBy(xpath="//a[@title='Installment Payment']") WebElement InstallmentPayment;
@FindBy(xpath="//a[@title='Installment Payment']") WebElement installmentPayment;
// Elements for SiteMappage

		@FindBy(xpath="//a[text()='Add Vehicle']") WebElement siteMapAddVehicle;
		@FindBy(xpath="//input[@id='accountNo']") WebElement accountNo;
		@FindBy(id="FleetNbr") WebElement vehicleFleetNo;
		@FindBy(id="FltExpYear") WebElement vehicleExpYr;
		@FindBy(id="btnProceed") WebElement vehicleProceed;
		
		
		//After Successfully added into cart
@FindBy(xpath="//ul[@class='errorMessage']//span") WebElement dashboardMessage;


@FindBy(xpath="//ul[contains(@class,'errorMessage')]/li/span") WebElement dashboardErrorMsg;
@FindBy(xpath="//a[@id='cartRef']") WebElement cartImg;


//Reinstatement
@FindBy(xpath="//li[@class='dropdown']/a[contains(text(),'More')]") WebElement dashboardFleetMore;
@FindBy(xpath="//a[text()='Fleet Reinstatement']") WebElement dashoboadMoreFleetReinstatement;


public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickServiceLink() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardServicesLink);
	}
	public void clickIRPLink() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardIRPLink);
	}
	public void clickEnterpriseLink() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardEnterpriseLink);
	}
/*	public void clickInstallmentPayment() {
		new ElementUtil(driver,ConfigReader.log).scrollToBottom();
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, InstallmentPayment);
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(InstallmentPayment);
	}*/
	
	public void clickInstallmentPayment() {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingJavscriptExecutor(installmentPayment);
	}
	public void validateIRPScreen(String title) throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log);
		ElementUtil.highlightElement(driver, dashboardIRPHeader);
		if(dashboardIRPHeader.getText().equalsIgnoreCase(title)) {
			assert true;
		}
		else {
			assert false;
		}
	}


	public void clickRenewFleetLink() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardRenewFleetLink);
	}
public void validateMessage(CharSequence successMessageValue) {
	
	if(dashboardMessage.getText().contains(successMessageValue)) { //Transaction is added to cart - 4113 successfully.
		assert true;
	}
	else {
		assert false;
	}
	
}
public void clickSupplementContinuance() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardSupplementContinuancelnk);
}
public void clickFleetEnquiry() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardFleetEnquiry);
}
public void clickVehicleEnquiry() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardVehicleEnquiry);
}
public void clickVehicleSupplementEnquiry() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardVehicleSupplementEnquiry);
}
public void clickSupplementEnquiry() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardSupplementEnquiry);
}
public void clickAccountEnquiry() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardAccountEnquiry);
}
public void clickSupplementDocuments() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardSupplementDocuments);
}

public void enterAccountNo(String accountNoValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxt(accountNo, accountNoValue);
}
public void validateErrorMessage(String errorMessgeValue) {
	if(dashboardErrorMsg.getText().contains(errorMessgeValue)) {
		assert true;
	}
	else {
		assert false;
	}
	
}
public void clickCartImg() {
	new ElementUtil(driver,ConfigReader.log).clickElement(cartImg);
}
//Reinstatement
public void clickFleetMore() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElement(dashboardFleetMore);
}
public void clickFleetReinstatement() {
	new ElementUtil(driver,ConfigReader.log).clickElement(dashoboadMoreFleetReinstatement);
}
public void clickLogout() {
	new ElementUtil(driver,ConfigReader.log).clickElement(dashboardLogout);
}
}
