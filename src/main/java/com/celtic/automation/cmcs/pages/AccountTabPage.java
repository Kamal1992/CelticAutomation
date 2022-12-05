package com.celtic.automation.cmcs.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;


public class AccountTabPage{
	private WebDriver driver;
	public AccountTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='AccountBtn']") WebElement accountActMainTab;

	@FindBy(css = "#contentMsg > div > ul") WebElement accountVerificationMessage;
	//Customer Details section
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement accountCustomerDetailsSubhdr;
	@FindBy(xpath="//span[text()='Account No.']") WebElement accountAccountNbrLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement accountAccountNbrTxt;
	
	@FindBy(xpath="//label[@for='MCECustomerID']") WebElement accountMCECustomerIDLbl;
	@FindBy(xpath="//input[@id='MCECustomerID']") WebElement accountMCECustomerIDTxt;
	
	@FindBy(xpath="//label[@for='RegistrantType']") WebElement accountRegistrantTypeLbl;
	@FindBy(xpath="//input[@id='RegistrantType']") WebElement accountRegistrantTypeTxt;
	
	@FindBy(xpath="//label[@for='CarrierType']") WebElement accountCarrierTypeLbl;
	@FindBy(xpath="//input[@id='CarrierType']") WebElement accountCarrierTypeTxt;
	
	@FindBy(xpath="//label[@for='IFTAAccountNo']") WebElement accountIFTAAccountNoLbl;
	@FindBy(xpath="//input[@id='IFTAAccountNo']") WebElement accountIFTAAccountNoTxt;
	
	@FindBy(xpath="//label[@for='ClientStatus']") WebElement accountCustomerStatusLbl;
	@FindBy(xpath="//input[@id='ClientStatus']") WebElement accountCustomerStatusTxt;
	
	//Address Details Section
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement accountAddressDetailsSubhdr;
	@FindBy(xpath="//li[@aria-controls='tabs-1']") WebElement accountTab1;
	
	@FindBy(xpath="//label[@for='Addressess_0__AddrLine1']") WebElement accountStreet0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__AddrLine1']") WebElement accountStreet0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Zip']") WebElement accountZip0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__Zip']") WebElement accountZip0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Jur']") WebElement accountJur0Lbl;
	@FindBy(xpath="//select[@id='Addressess_0__Jur']") WebElement accountJur0dd;
	
	@FindBy(xpath="//label[@for='Addressess_0__City']") WebElement accountCity0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__City']") WebElement accountCity0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__County']") WebElement accountCounty0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__County']") WebElement accountCounty0Txt;
	
	@FindBy(xpath="//label[@for='Addressess_0__Country']") WebElement accountCountry0Lbl;
	@FindBy(xpath="//input[@id='Addressess_0__Country']") WebElement accountCountry0Txt;
	
	
	@FindBy(xpath="//li[@aria-controls='tabs-2']") WebElement accountTab2;
	@FindBy(xpath="//label[@for='Addressess_1__AddrLine1']") WebElement accountStreet1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__AddrLine1']") WebElement accountStreet1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Zip']") WebElement accountZip1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__Zip']") WebElement accountZip1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Jur']") WebElement accountJur1Lbl;
	@FindBy(xpath="//select[@id='Addressess_1__Jur']") WebElement accountJur1dd;
	
	@FindBy(xpath="//label[@for='Addressess_1__City']") WebElement accountCity1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__City']") WebElement accountCity1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__County']") WebElement accountCounty1Lbl;
	@FindBy(xpath="//input[@id='Addressess_1__County']") WebElement accountCounty1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__Country']") WebElement accountCountryLbl;
	@FindBy(xpath="//input[@id='Addressess_1__Country']") WebElement accountCountry1Txt;
	
	@FindBy(xpath="//label[@for='Addressess_1__AttnTo']") WebElement accountAttentionToLbl;
	@FindBy(xpath="//input[@id='Addressess_1__AttnTo']") WebElement accountAttentionToTxt;
	
	//Business Customer Details Section
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement accountBusinesscustomerDetailsSubhdr;
	
	@FindBy(xpath="//label[@for='USDOTNo']") WebElement accountUSDOTNoLbl;
	@FindBy(xpath="//input[@id='USDOTNo']") WebElement accountUSDOTNoTxt;
	
	@FindBy(xpath="//label[@for='TIN']") WebElement accountTPIDLbl;
	@FindBy(xpath="//input[@id='TIN']") WebElement accountTPIDTxt;
	
	@FindBy(xpath="//label[@for='ConatactName']") WebElement accountContactNameLbl;
	@FindBy(xpath="//input[@id='ConatactName']") WebElement accountContactNameTxt;
	
	@FindBy(xpath="//label[@for='EmailAddress']") WebElement accountEmailLbl;
	@FindBy(xpath="//input[@id='EmailAddress']") WebElement accountEmailTxt;
	
	@FindBy(xpath="//label[@for='PrimaryPhone']") WebElement accountPrimaryPhoneLbl;
	@FindBy(xpath="//input[@id='PrimaryPhone']") WebElement accountPrimaryPhoneTxt;
	
	@FindBy(xpath="//label[@for='AlternatePhone']") WebElement accountAlternatePhoneLbl;
	@FindBy(xpath="//input[@id='AlternatePhone']") WebElement accountAlternatePhoneTxt;
	
	@FindBy(xpath="//label[@for='FaxNo']") WebElement accountFaxNoLbl;
	@FindBy(xpath="//input[@id='FaxNo']") WebElement accountFaxNoTxt;
	
	//Account Details
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[4]") WebElement accountAccountDetailsSubhdr;
	@FindBy(xpath="//label[@for='EmailNotification']") WebElement accountEmailNotificationLbl; 
	@FindBy(xpath="//input[@id='EmailNotification']") WebElement accountEmailNotification; 
	@FindBy(xpath="//label[@for='FaxNotification']") WebElement accountFaxNotificationLbl;
	@FindBy(xpath="//input[@id='FaxNotification']") WebElement accountFaxNotification; 

			
	public void validateAccountstabPresence() {
		ElementUtil.isPresentAndDisplayed(accountActMainTab);
		ElementUtil.highlightElement(driver, accountActMainTab);
	}
		
	public void checkEmailNotification() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(accountEmailNotification);
	}

	public void checkFaxNotification() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(accountFaxNotification);
	}

//Fetch Details
public String fetchMCECustomernolbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountMCECustomerIDLbl);
}

public String fetchMCECustomerno() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountMCECustomerIDTxt,"value");
}

public String fetchRegistrationTypelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountRegistrantTypeLbl);
}

public String fetchRegistrationType() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountRegistrantTypeTxt,"value");
}

public String fetchAccountCarrierTypeLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCarrierTypeLbl);
}

public String fetchAccountCarrierType() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCarrierTypeTxt,"value");
}
public String fetchIFTAAccountNbrlbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountIFTAAccountNoLbl);
}

public String fetchIFTAAccountNbr() {
	return ElementUtil.FetchTextBoxValuewithattributedisabled(accountIFTAAccountNoTxt,"value");
}

public String fetchAccountCustomerStatusLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCustomerStatusLbl);
}

public String fetchAccountCustomerStatus() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCustomerStatusTxt,"value");
}
public String fetchAccountsTab1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountTab1);
}

public String fetchAccountStreet0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountStreet0Lbl);
}

public String fetchAccountStreet0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountStreet0Txt,"value");
}

public String fetchAccountZip0lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountZip0Lbl);
}

public String fetchAccountZip0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountZip0Txt,"value");
}

public String fetchAccountJur0lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountJur0Lbl);
}

public String fetchAccountJur0() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(accountJur0dd);
}
public String fetchAccountCity0lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCity0Lbl);
}

public String fetchAccountCity0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCity0Txt,"value");
}

public String fetchAccountCounty0lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCounty0Lbl);
}

public String fetchAccountCounty0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCounty0Txt,"value");
}

public String fetchAccountCountry0lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCountry0Lbl);
}

public String fetchAccountCountry0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCountry0Txt,"value");
}

public void clickMailingAddress() {
	new ElementUtil(driver,ConfigReader.log).clickElement(accountTab2);
}
public String fetchAccountsTab2() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountTab2);
}
public String fetchAccountStreet1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountStreet1Lbl);
}

public String fetchAccountStreet1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountStreet1Txt,"value");
}

public String fetchAccountZip1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountZip1Lbl);
}

public String fetchAccountZip1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountZip1Txt,"value");
}

public String fetchAccountJur1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountJur1Lbl);
}

public String fetchAccountJur1() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(accountJur1dd);
}
public String fetchAccountCity1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCity1Lbl);
}

public String fetchAccountCity1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCity1Txt,"value");
}

public String fetchAccountCounty1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCounty1Lbl);
}

public String fetchAccountCounty1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCounty1Txt,"value");
}

public String fetchAccountCountry1lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountCountryLbl);
}

public String fetchAccountCountry1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountCountry1Txt,"value");
}

public String fetchAccountAttentionTolbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountAttentionToLbl);
}

public String fetchAccountAttentionTo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountAttentionToTxt,"value");
}

public String fetchAccountUSDOTNolbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountUSDOTNoLbl);
}

public String fetchAccountUSDOTNo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountUSDOTNoTxt,"value");
}

public String fetchAccountTPIDlbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountTPIDLbl);
}
public String fetchAccountTPID() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountTPIDTxt,"value");
}

public String fetchAccountContactnamelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountContactNameLbl);
}

public String fetchAccountContactname() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountContactNameTxt,"value");
}

public String fetchAccountEmaillbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountEmailLbl);
}

public String fetchAccountEmail() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountEmailTxt,"value");
}

public String fetchAccountPrimaryPhonelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountPrimaryPhoneLbl);
}

public String fetchAccountPrimaryPhone() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountPrimaryPhoneTxt,"value");
}


public String fetchAccountAlternatePhonelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountAlternatePhoneLbl);
}

public String fetchAccountAlternatePhone() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountAlternatePhoneTxt,"value");
}
public String fetchAccountFaxNolbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountFaxNoLbl);
}

public String fetchAccountFaxNo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountFaxNoTxt,"value");
}
public String fetchAccountEmailnotificationlbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountEmailNotificationLbl);
}

public String fetchAccountEmailnotification() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountEmailNotification,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fetchAccountFaxnotificationlbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountFaxNotificationLbl);
}

public String fetchAccountFaxnotification() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(accountFaxNotification,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}


//Validate messages

public String validateMessage() {
	new ElementUtil(driver,ConfigReader.log).highlightElement(driver, accountVerificationMessage);
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(accountVerificationMessage);
}




























































}

