package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class FleetTabPage {
	private WebDriver driver;
	public FleetTabPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	//Fleet Tab    
	 
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(1) > span") WebElement fleetVerificationMsg1;
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(2) > span") WebElement fleetVerificationMsg2;
	    @FindBy(css = "#contentMsg > div > ul > li:nth-child(3) > span") WebElement fleetVerificationMsg3;
	    
	 
		@FindBy(xpath="//a[@id='FleetBtn']") WebElement fleetFltMainTab;

		
		//Fleet Summary
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement fleetFltSummarySubHdr;
		
		@FindBy(xpath="//label[@for='CustomerType']") WebElement fleetRegistrationTypeLbl;
		@FindBy(xpath="//select[@id='CustomerType']") WebElement fleetRegistrationTypedd;
		
		@FindBy(xpath="//label[@for='FltStatus']") WebElement fleetFltStatusLbl;
		@FindBy(xpath="//select[@id='FltStatus']") WebElement fleetFltStatusdd;
		
		@FindBy(xpath="//label[@for='CarrierType']") WebElement fleetCarrierTypeLbl;
		@FindBy(xpath="//input[@id='CarrierType']") WebElement fleetCarrierTypeTxt;
		
		@FindBy(xpath="//label[@for='DBA']") WebElement fleetDBANameLbl;
		@FindBy(xpath="//input[@id='DBA']") WebElement fleetDBANameTxt;
		
		
		//Address Details Section
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement fleetAddressDetailsSubHdr;
		@FindBy(xpath="//input[@id='btnAddrOverride']") WebElement fleetAddressOverrideSubHdr;
		
		@FindBy(xpath="//li[@aria-controls='tabs-1']") WebElement fleetTab1;  //Business Address
		
		@FindBy(xpath="//label[@for='Addressess_0__AddrLine1']") WebElement fleetStreet0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__AddrLine1']") WebElement fleetStreet0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Zip']") WebElement fleetZip0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__Zip']") WebElement fleetZip0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Jur']") WebElement fleetJur0Lbl;
		@FindBy(xpath="//select[@id='Addressess_0__Jur']") WebElement fleetJur0dd;
		

		@FindBy(xpath="//label[@for='Addressess_0__City']") WebElement fleetCity0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__City']") WebElement fleetCity0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__County']") WebElement fleetCounty0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__County']") WebElement fleetCounty0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__Country']") WebElement fleetCountry0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__Country']") WebElement fleetCountry0Txt;
		
		@FindBy(xpath="//label[@for='Addressess_0__IsNonDeliverableAddr']") WebElement fleetNonDeliverable0Lbl;
		@FindBy(xpath="//input[@id='Addressess_0__IsNonDeliverableAddr']") WebElement fleetNonDeliverable0Chk;
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-2']") WebElement fleetTab2;  //Mailing Address
		@FindBy(xpath="//label[@for='Addressess_1__AddrLine1']") WebElement fleetStreet1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__AddrLine1']") WebElement fleetStreet1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Zip']") WebElement fleetZip1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__Zip']") WebElement fleetZip1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Jur']") WebElement fleetJur1Lbl;
		@FindBy(xpath="//select[@id='Addressess_1__Jur']") WebElement fleetJur1dd;
		
		@FindBy(xpath="//label[@for='Addressess_1__City']") WebElement fleetCity1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__City']") WebElement fleetCity1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__County']") WebElement fleetCounty1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__County']") WebElement fleetCounty1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__Country']") WebElement fleetCountry1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__Country']") WebElement fleetCountry1Txt;
		
		@FindBy(xpath="//label[@for='Addressess_1__IsNonDeliverableAddr']") WebElement fleetNonDeliverable1Lbl;
		@FindBy(xpath="//input[@id='Addressess_1__IsNonDeliverableAddr']") WebElement fleetNonDeliverable1Chk;
		
		@FindBy(xpath="//input[@id='Addressess_1__AttnTo']") WebElement fleetAttentionTO1Txt;
		@FindBy(xpath="//label[@for='Addressess_1__AttnTo']") WebElement fleetAttentionToLbl;
		
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-3']") WebElement fleetTab3;  //Service provider
		@FindBy(xpath="//label[@for='reportingServices_ServiceProviderID']") WebElement fleetServiceProviderLbl;
		@FindBy(xpath="//select[@id='reportingServices_ServiceProviderID']") WebElement fleetServiceProviderdd;
		
		@FindBy(xpath="//label[@for='reportingServices_LegalName']") WebElement fleetLegalNameLbl;
		@FindBy(xpath="//input[@id='reportingServices_LegalName']") WebElement fleetLegalNameTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_DBAName']") WebElement fleetServiceDBANameLbl;
		@FindBy(xpath="//input[@id='reportingServices_DBAName']") WebElement fleetServiceDBANameTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_checkedPwrattoony']") WebElement fleetServicePowerOfAttroneyLbl;
		@FindBy(xpath="//input[@id='reportingServices_checkedPwrattoony']") WebElement fleetServicePowerOfAttroneyChk;
		
		@FindBy(xpath="//label[@for='reportingServices_PowerOfAttEffDate']") WebElement fleetServicePowerOfAttroneyEffDateLbl;
		@FindBy(xpath="//input[@id='reportingServices_PowerOfAttEffDate']") WebElement fleetServicePowerOfAttroneyEffDateTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_PowerOfAttExpDate']") WebElement fleetServicePowerOfAttroneyExpDateLbl;
		@FindBy(xpath="//input[@id='reportingServices_PowerOfAttExpDate']") WebElement fleetServicePowerOfAttroneyExpDateTxt;
		
		
		@FindBy(xpath="//label[@for='reportingServices_EmailID']") WebElement fleetServiceEmailIdLbl;
		@FindBy(xpath="//input[@id='reportingServices_EmailID']") WebElement fleetServiceEmailIdTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_PhoneNo']") WebElement fleetServicePhoneNoLbl;
		@FindBy(xpath="//input[@id='reportingServices_PhoneNo']") WebElement fleetServicePhoneNoTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Fax']") WebElement fleetServiceFaxNoLbl;
		@FindBy(xpath="//input[@id='reportingServices_Fax']") WebElement fleetServiceFaxNoTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Street1']") WebElement fleetServiceStreetLbl;
		@FindBy(xpath="//input[@id='reportingServices_Street1']") WebElement fleetServiceStreetTxt;
		
		
		@FindBy(xpath="//label[@for='reportingServices_City']") WebElement fleetServiceCityLbl;
		@FindBy(xpath="//input[@id='reportingServices_City']") WebElement fleetServiceCityTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Jur']") WebElement fleetService_JurLbl;
		@FindBy(xpath="//input[@id='reportingServices_Jur']") WebElement fleetServiceJurTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_ZipCode']") WebElement fleetServiceZipCodeLbl;
		@FindBy(xpath="//input[@id='reportingServices_ZipCode']") WebElement fleetServiceZipCodeTxt;
		
		@FindBy(xpath="//label[@for='reportingServices_Country']") WebElement fleetServiceCountryLbl;
		@FindBy(xpath="//input[@id='reportingServices_Country']") WebElement fleetServiceCountryTxt;
		
		
		@FindBy(xpath="//li[@aria-controls='tabs-4']") WebElement fleetTab4;  //One-Time Mailing Address
		
		@FindBy(xpath="//label[@for='Addressess_2__AddrLine1']") WebElement fleetServiceMailingStreetLbl;
		@FindBy(xpath="//input[@id='Addressess_2__AddrLine1']") WebElement fleetServiceMailingStreetTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Zip']") WebElement fleetServiceMailingZipCodeLbl;
		@FindBy(xpath="//input[@id='Addressess_2__Zip']") WebElement fleetServiceMailingZipCodeTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Jur']") WebElement fleetServiceMailingJurLbl;
		@FindBy(xpath="//select[@id='Addressess_2__Jur']") WebElement fleetServiceMailingJurTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__City']") WebElement fleetServiceMailingCityLbl;
		@FindBy(xpath="//input[@id='Addressess_2__City']") WebElement fleetServiceMailingCityTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__County']") WebElement fleetServiceMailingCountyLbl;
		@FindBy(xpath="//input[@id='Addressess_2__County']") WebElement fleetServiceMailingCountyTxt;
		
		@FindBy(xpath="//label[@for='Addressess_2__Country']") WebElement fleetServiceMailingCountryLbl;
		@FindBy(xpath="//input[@id='Addressess_2__Country']") WebElement fleetServiceMailingCountrytxt;
		
		@FindBy(xpath="//input[@id='Addressess_2__AttnTo']") WebElement fleetServiceMailingAttentionToTxt;
		@FindBy(xpath="//label[@for='Addressess_2__AttnTo']") WebElement fleetServiceMailingAttentionToLbl;
		
		//Fleet Details
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement fleetfltDetailsSubHdr;
		
		@FindBy(xpath="//label[@for='ContactName']") WebElement fleetDetailsContactNameLbl;
		@FindBy(xpath="//input[@id='ContactName']") WebElement fleetDetailsContactNameTxt;
		
		@FindBy(xpath="//label[@for='Email']") WebElement fleetDetailsEmailIdLbl;
		@FindBy(xpath="//input[@id='Email']") WebElement fleetDetailsEmailIdTxt;
		
		@FindBy(xpath="//label[@for='PhoneNumber']") WebElement fleetDetailsPrimaryCellNbrLbl;
		@FindBy(xpath="//input[@id='PhoneNumber']") WebElement fleetDetailsPrimaryCellNbrTxt;
		
		@FindBy(xpath="//label[@for='FlCellNbr']") WebElement fleetDetailsAlternateCellNbrLbl;
		@FindBy(xpath="//input[@id='FlCellNbr']") WebElement fleetDetailsAlternateCellNbrTxt;
		
		@FindBy(xpath="//label[@for='FaxNo']") WebElement fleetDetailsFaxNoLbl;
		@FindBy(xpath="//input[@id='FaxNo']") WebElement fleetDetailsFaxNoTxt;
		
		@FindBy(xpath="//label[@for='TinNbr']") WebElement fleetDetailsTpIdLbl;
		@FindBy(xpath="//input[@id='TinNbr']") WebElement fleetDetailsTPIdTxt;
		
		@FindBy(xpath="//label[@for='UsdotNbr']") WebElement fleetDetailsUsdotNbrLbl;
		@FindBy(xpath="//input[@id='UsdotNbr']") WebElement fleetDetailsUsdotNbrTxt;
		
		@FindBy(xpath="//label[@for='ChangeVehUsdotTin']") WebElement fleetDetailsChangeVehUsdotTinLbl;
		@FindBy(xpath="//input[@id='ChangeVehUsdotTin']") WebElement fleetDetailsChangeVehUsdotTInChk;
		
		@FindBy(xpath="//label[@for='FltType']") WebElement fleetDetailsFltTypeLbl;
		@FindBy(xpath="//select[@id='FltType']") WebElement fleetDetailsFltTypedd;
		
		@FindBy(xpath="//label[@for='CommodityClass']") WebElement fleetDetailsCommodityClassLbl;
		@FindBy(xpath="//select[@id='CommodityClass']") WebElement fleetDetailsCommodityClassdd;
		
		@FindBy(xpath="//label[@for='FltEffDate']") WebElement fleetDetailsFltEffDateLbl;
		@FindBy(xpath="//input[@id='FltEffDate']") WebElement fleetDetailsFltEffDatedtPicker;
		
		@FindBy(xpath="//label[@for='FltExpDate']") WebElement fleetDetailsFltExpDateLbl;
		@FindBy(xpath="//input[@id='FltExpDate']") WebElement fleetDetailsFltExpDatedtPicker;
		
		@FindBy(xpath="//label[@for='changeAddrOnUsdot']") WebElement fleetDetailsChangeAddrOnUsdotLbl;
		@FindBy(xpath="//input[@id='changeAddrOnUsdot']") WebElement fleetDetailschangeAddrOnUsdotChk;
		
		@FindBy(xpath="//label[@for='FirstOperationDate']") WebElement fleetDetailsFirstOperatedDateLbl;
		@FindBy(xpath="//input[@id='FirstOperationDate']") WebElement fleetDetailsFirstOperatedDatedtPicker;
		
		@FindBy(xpath="//label[@for='WyIntraStF']") WebElement fleetDetailsWyomingIndicatorLbl;
		@FindBy(xpath="//input[@id='WyIntraStF']") WebElement fleetDetailsWyomingIndicatorChk;
		
		@FindBy(xpath="//label[@for='IftaMileageChk']") WebElement fleetDetailsIFTADistanceLbl;
		@FindBy(xpath="//input[@id='IftaMileageChk']") WebElement fleetDetailsIFTADistanceChk;
		
		@FindBy(xpath="//label[@for='MobileIND']") WebElement fleetDetailsMobileNotificationLbl;
		@FindBy(xpath="//input[@id='MobileIND']") WebElement fleetDetailsMobileNotificationChk;
		
		
		//Document Collection
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[5]") WebElement fleetDocumentationCollectionSubHdr;
		
		@FindBy(xpath="//label[@for='IRPRequirementsForm']") WebElement fleetDocCollectionIRPRequirementsFormLbl;
		@FindBy(xpath="//select[@id='IRPRequirementsForm']") WebElement fleetDocCollectionIRPRequirementsFormdd;
		
		@FindBy(xpath="//label[@for='StatementOfUnderstanding']") WebElement fleetDocCollectionStatementOfUnderstandingLbl;
		@FindBy(xpath="//select[@id='StatementOfUnderstanding']") WebElement fleetDocCollectionStatementOfUnderstandingdd;
		
		@FindBy(xpath="//label[@for='InstallmentAgreement']") WebElement fleetDocCollectionInstallmentAgreementLbl;
		@FindBy(xpath="//select[@id='InstallmentAgreement']") WebElement fleetDocCollectionInstallmentAgreementdd;
		
		@FindBy(xpath="//label[@for='PowerOfAttorney']") WebElement fleetDocCollectionPowerOfAttorneyLbl;
		@FindBy(xpath="//select[@id='PowerOfAttorney']") WebElement fleetDocCollectionPowerOfAttorneydd;
		
		//Vehicle Document 
		@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[6]") WebElement fleetVehicleDocumentSubHdr;
		
		@FindBy(xpath="//label[@for='HVUTForm2290']") WebElement fleetVehDocumentHVUTFormLbl;
		@FindBy(xpath="//select[@id='HVUTForm2290']") WebElement fleetVehDocumentHVUTFormdd;
		
		@FindBy(xpath="//label[@for='PropertyTaxVehDocument']") WebElement fleetVehDocumentPropertyTaxLbl;
		@FindBy(xpath="//select[@id='PropertyTaxVehDocument']") WebElement fleetVehDocumentPropertyTaxdd;
		
		
		//-------------------------------------
	
	
	public void navigateToServiceProvider() throws Exception {
		//new ElementUtil(driver,ConfigReader.log).scrollToViewAndClickElement(fleetTab3);  //click on service Provider under Address details
		new ElementUtil(driver,ConfigReader.log).clickElement(fleetTab3);
		//new ElementUtil(driver,ConfigReader.log).sleepTime(2000);
		
	}

	public void clickPowerOfAttroney() {
		new ElementUtil(driver,ConfigReader.log);
		if(ElementUtil.isPresentAndDisplayed(fleetServicePowerOfAttroneyChk)) {
			new ElementUtil(driver,ConfigReader.log).webCheckON(fleetServicePowerOfAttroneyChk);
		}
	}
	public void enterEmailID(String emailIdValue) {
		Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsEmailIdTxt);
		if(valueexists==true) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(fleetDetailsEmailIdTxt, emailIdValue);  }
	}
	public void selectIRPRequirementForm(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDocCollectionIRPRequirementsFormdd,selectValue);  //C - COLLECTED
	}
	public void selectStatementofUnderstanding(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDocCollectionStatementOfUnderstandingdd,selectValue); //C - COLLECTED
	}
	public void selectInstallmentAgreement(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDocCollectionInstallmentAgreementdd,selectValue); //C - COLLECTED
	}
	public void selectPowerOfAttroney(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDocCollectionPowerOfAttorneydd,selectValue); //C - COLLECTED
	}

	public void selectHVUTForm(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetVehDocumentHVUTFormdd,selectValue); //C - COLLECTED
	}
	public void selectPropertyTax(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetVehDocumentPropertyTaxdd,selectValue); //C - COLLECTED
	}

	public void selectEffectiveDate(String effDate) {
		Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsFltEffDatedtPicker);
		if(valueexists==true) {
			new ElementUtil(driver,ConfigReader.log).clickElement(fleetDetailsFltEffDatedtPicker);
			new ElementUtil(driver,ConfigReader.log).webEditTxt(fleetDetailsFltEffDatedtPicker,effDate); 
			}
	}
	public void selectExpirationDate(String expDate) {
		Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsFltExpDatedtPicker);
		if(valueexists==true) {
			new ElementUtil(driver,ConfigReader.log).clickElement(fleetDetailsFltExpDatedtPicker);
			new ElementUtil(driver,ConfigReader.log).webEditTxt(fleetDetailsFltExpDatedtPicker,expDate); 
			}
	}
	public void selectFirstOperatedDate(String firstOperatedDate) {
		Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsFirstOperatedDatedtPicker);
		if(valueexists==true) {
			new ElementUtil(driver,ConfigReader.log).clickElement(fleetDetailsFirstOperatedDatedtPicker);
			new ElementUtil(driver,ConfigReader.log).webEditTxt(fleetDetailsFirstOperatedDatedtPicker,firstOperatedDate); 
			}
	}
public void selectFleetType(String fleetTypeValue) {
	Boolean selectedornot=new ElementUtil(driver,ConfigReader.log).validateDropdownSelected(fleetDetailsFltTypedd);
	if(selectedornot==true) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDetailsFltTypedd, fleetTypeValue);  }
	//FHE - FOR HIRE EXEMPT (FH),FOR - FOR HIRE (FH),FHL - FOR HIRE LEASE (FH),FHR - FOR HIRE RENTAL CARRIER (FH),PVR - PRIVATE RENTAL (PC),PVT - PRIVATE CARRIER (PC)
}


public void selectCommodityClass(String commodityClassValue) {
	Boolean selectedornot=new ElementUtil(driver,ConfigReader.log).validateDropdownSelected(fleetDetailsCommodityClassdd);
	if(selectedornot==true) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(fleetDetailsCommodityClassdd, commodityClassValue);  }
	//A - ALL,B - BUS,E - EXEMPT,H - HOUSEHOLD GOODS (HG),L - LOGS
}

public void enterContactName(String contactNameValue) {
	Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsContactNameTxt);
	if(valueexists== true) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(fleetDetailsContactNameTxt, contactNameValue);
	}
}
public void enterprimaryPhone(String primaryPhoneValue) {
	Boolean valueexists=new ElementUtil(driver,ConfigReader.log).validateTextbox(fleetDetailsPrimaryCellNbrTxt);
	if(valueexists == true) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(fleetDetailsPrimaryCellNbrTxt, primaryPhoneValue);
	}
}

public void clickMailingAddress() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElement(fleetTab2);
	//new ElementUtil(driver,ConfigReader.log).sleepTime(1000);
}

public void clickOnTimeMailingAddress() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElement(fleetTab4);
	//new ElementUtil(driver,ConfigReader.log).sleepTime(1000);
}


public String fetchFleetTabBusinessAddress() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetTab1);
}
public String fetchFleetTabMailingAddress() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetTab2);
}
public String fetchFleetTabServiceProviderAddress() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetTab3);
}
public String fetchFleetTabOneTimeMailingAddress() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetTab4);
}
public String fetchRegistrationtypelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetRegistrationTypeLbl);
}

public String fetchRegistrationtype() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetRegistrationTypedd);
}
public String fetchfltstatuslbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetFltStatusLbl);
}

public String fetchfltstatus() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetFltStatusdd);
}

public String fetchcarriertypelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCarrierTypeLbl);
}

public String fetchcarriertype() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCarrierTypeTxt,"value");
}

public String fetchDBANamelbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDBANameLbl);
}

public String fetchDBAName() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDBANameTxt,"value");
}

public String fleetStreet0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetStreet0Lbl);
}

public String fleetStreet0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetStreet0Txt,"value");
}

public String fleetZip0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetZip0Lbl);
}

public String fleetZip0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetZip0Txt,"value");
}
public String fleetJur0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetJur0Lbl);
}

public String fleetJur0() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetJur0dd);
}
public String fleetCity0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCity0Lbl);
}

public String fleetCity0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCity0Txt,"value");
}
public String fleetCounty0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCounty0Lbl);
}

public String fleetCounty0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCounty0Txt,"value");
}
public String fleetCountry0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCountry0Lbl);
}

public String FleetCountry0() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCountry0Txt,"value");
}
public String fleetNonDeliverable0Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetNonDeliverable0Lbl);
}

public String fleetNonDeliverable0() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetNonDeliverable0Chk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetStreet1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetStreet1Lbl);
}

public String fleetStreet1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetStreet1Txt,"value");
}

public String fleetZip1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetZip1Lbl);
}

public String fleetZip1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetZip1Txt,"value");
}
public String fleetJur1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetJur1Lbl);
}

public String fleetJur1() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetJur1dd);
}
public String fleetCity1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCity1Lbl);
}

public String FleetCity1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCity1Txt,"value");
}
public String fleetCounty1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCounty1Lbl);
}

public String fleetCounty1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCounty1Txt,"value");
}
public String fleetCountry1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetCountry1Lbl);
}

public String fleetCountry1() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetCountry1Txt,"value");
}
public String fleetNonDeliverable1Lbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetNonDeliverable1Lbl);
}

public String fleetNonDeliverable1() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetNonDeliverable1Chk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetAttentionToLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetAttentionToLbl);
}

public String fleetAttentionTO() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetAttentionTO1Txt,"value");
}


public String fleetServiceProviderLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceProviderLbl);
}

public String fleetServiceProvider() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetServiceProviderdd);
}
public String fleetServiceLegalNameLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetLegalNameLbl);
}

public String fleetServiceLegalName() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetLegalNameTxt,"value");
}
public String fleetServiceDBANameLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceDBANameLbl);
}

public String fleetServiceDBAName() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceDBANameTxt,"value");
}
public String fleetServicePowerOfAttroneyLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServicePowerOfAttroneyLbl);
}

public String fleetServicePowerOfAttroney() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetServicePowerOfAttroneyEffDateLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServicePowerOfAttroneyEffDateLbl);
}


public String fleetServicePowerOfAttroneyEffDate() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyEffDateTxt,"value");
}
public String fleetServicePowerOfAttroneyExpDateLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServicePowerOfAttroneyExpDateLbl);
}

public String fleetServicePowerOfAttroneyExpDate() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServicePowerOfAttroneyExpDateTxt,"value");
}

public String fleetServiceEmailIdLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceEmailIdLbl);
}

public String fleetServiceEmailId() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceEmailIdTxt,"value");
}
public String fleetServicePhoneNoLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServicePhoneNoLbl);
}

public String fleetServicePhoneNo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServicePhoneNoTxt,"value");
}

public String fleetServiceFaxNoLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceFaxNoLbl);
}

public String fleetServiceFaxNo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceFaxNoTxt,"value");
}
public String fleetServiceStreetLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceStreetLbl);
}

public String fleetServiceStreet() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceStreetTxt,"value");
}
public String fleetServiceCityLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceCityLbl);
}

public String fleetServiceCity() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceCityTxt,"value");
}
public String fleetServiceJurLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetService_JurLbl);
}

public String fleetServiceJur() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceJurTxt,"value");
}
public String fleetServiceZipCodeLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceZipCodeLbl);
}

public String fleetServiceZipCode() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceZipCodeTxt,"value");
}

public String fleetServiceCountryLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceCountryLbl);
}

public String fleetServiceCountry() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceCountryTxt,"value");
}

public String fleetServiceMailingStreetLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingStreetLbl);
}

public String fleetServiceMailingStreet() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingStreetTxt,"value");
}

public String fleetServiceMailingZipCodeLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingZipCodeLbl);
}

public String fleetServiceMailingZipCode() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingZipCodeTxt,"value");
}
public String fleetServiceMailingJurLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingJurLbl);
}

public String fleetServiceMailingJur() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetServiceMailingJurTxt);
}
public String fleetServiceMailingCityLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingCityLbl);
}

public String fleetServiceMailingCity() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingCityTxt,"value");
}
public String fleetServiceMailingCountyLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingCountyLbl);
}
public String fleetServiceMailingCounty() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingCountyTxt,"value");
}
public String fleetServiceMailingCountryLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingCountryLbl);
}

public String fleetServiceMailingCountry() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingCountrytxt,"value");
}
public String fleetServiceMailingAttentionToLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetServiceMailingAttentionToLbl);
}

public String fleetServiceMailingAttentionTo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetServiceMailingAttentionToTxt,"value");
}

public String fleetDetailsContactNameLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsContactNameLbl);
}

public String fleetDetailsContactName() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsContactNameTxt,"value");
}
public String fleetDetailsEmailIdLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsEmailIdLbl);
}
public String fleetDetailsEmailId() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsEmailIdTxt,"value");
}
public String fleetDetailsPrimaryCellNbrLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsPrimaryCellNbrLbl);
}

public String fleetDetailsPrimaryCellNbr() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsPrimaryCellNbrTxt,"value");
}
public String fleetDetailsAlternateCellNbrLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsAlternateCellNbrLbl);
}

public String fleetDetailsAlternateCellNbr() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsAlternateCellNbrTxt,"value");
}
public String fleetDetailsFaxNoLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsFaxNoLbl);
}
public String fleetDetailsFaxNo() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsFaxNoTxt,"value");
}
public String fleetDetailsTpIdLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsTpIdLbl);
}

public String fleetDetailsTPID() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsTPIdTxt,"value");
}
public String fleetDetailsUsdotNbrLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsUsdotNbrLbl);
}
public String fleetDetailsUsdotNbr() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsUsdotNbrTxt,"value");
}
public String fleetDetailsChangeVehUsdotTinLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsChangeVehUsdotTinLbl);
}

public String fleetDetailsChangeVehUsdotTin() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsChangeVehUsdotTInChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetDetailsFltTypeLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsFltTypeLbl);
}

public String fleetDetailsFltType() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDetailsFltTypedd);
}
public String fleetDetailsCommodityClassLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsCommodityClassLbl);
}
public String fleetDetailsCommodityClass() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDetailsCommodityClassdd);
}
public String fleetDetailsFltEffDateLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsFltEffDateLbl);
}

public String fleetDetailsFltEffDatedtPicker() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsFltEffDatedtPicker,"value");
}
public String fleetDetailsFltExpDateLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsFltExpDateLbl);
}
public String fleetDetailsFltExpDate() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsFltExpDatedtPicker,"value");
}

public String fleetDetailsChangeAddrOnUsdotLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsChangeAddrOnUsdotLbl);
}

public String fleetDetailsChangeAddrOnUsdot() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailschangeAddrOnUsdotChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsFirstOperatedDateLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsFirstOperatedDateLbl);
}

public String fleetDetailsFirstOperatedDate() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsFirstOperatedDatedtPicker,"value");
}
public String fleetDetailsWyomingIndicatorLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsWyomingIndicatorLbl);
}
public String fleetDetailsWyomingIndicator() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsWyomingIndicatorChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsIFTADistanceLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsIFTADistanceLbl);
}

public String fleetDetailsIFTADistance() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsIFTADistanceChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}
public String fleetDetailsMobileNotificationLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDetailsMobileNotificationLbl);
}
public String fleetDetailsMobileNotification() {
	boolean boolstatus=false;
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(fleetDetailsMobileNotificationChk,"checked")==null){
		boolstatus=false;
	}
	else {
		boolstatus=true;
	}
	return Boolean.toString(boolstatus);
}

public String fleetDetailsIRPRequirementsLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDocCollectionIRPRequirementsFormLbl);
}

public String fleetDetailsIRPRequirements() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDocCollectionIRPRequirementsFormdd);
}

public String fleetDetailsStatementOfUnderstandingLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDocCollectionStatementOfUnderstandingLbl);
}
public String fleetDetailsStatementOfUnderstanding() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDocCollectionStatementOfUnderstandingdd);
}

public String fleetDetailsInstallmentAgreementLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDocCollectionInstallmentAgreementLbl);
}
public String fleetDetailsInstallmentAgreement() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDocCollectionInstallmentAgreementdd);
}
public String fleetDetailsPowerOfAttorneyLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetDocCollectionPowerOfAttorneyLbl);
}
public String fleetDetailsPowerOfAttorney() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetDocCollectionPowerOfAttorneydd);
}

public String fleetDetailsHVUTFormLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetVehDocumentHVUTFormLbl);
}
public String fleetDetailsHVUTForm() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetVehDocumentHVUTFormdd);
}
public String fleetDetailsPropertyTaxLbl() {
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetVehDocumentPropertyTaxLbl);
}
public String fleetDetailsPropertyTax() {
	return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(fleetVehDocumentPropertyTaxdd);
}

public String fleetValidateMessage1() {
	new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, fleetVerificationMsg1);
return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetVerificationMsg1);
}

public String fleetValidateMessage2() {
	new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, fleetVerificationMsg2);
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetVerificationMsg2);
}
public String fleetValidateMessage3() {
	new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, fleetVerificationMsg3);
	return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(fleetVerificationMsg3);
}


}
