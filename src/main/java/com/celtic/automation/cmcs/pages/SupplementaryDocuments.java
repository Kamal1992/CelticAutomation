package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class SupplementaryDocuments {
	
	private WebDriver driver;

	public SupplementaryDocuments(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
    @FindBy(xpath="//label[@for='AccountNo']") WebElement supplementDocumentsAccountNoLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement supplementDocumentsAccountNo;
	@FindBy(xpath="//label[@for='LegalName']") WebElement supplementDocumentsLegalNameLbl;
	@FindBy(xpath="//input[@id='LegalName']") WebElement supplementDocumentsLegalName;
	@FindBy(xpath="//label[@for='DBA']") WebElement supplementDocumentsDBALbl;
	@FindBy(xpath="//input[@id='DBA']") WebElement supplementDocumentsDba;
	@FindBy(xpath="//label[@for='FleetNo']") WebElement supplementDocumentsFleetNoLbl;
	@FindBy(xpath="//input[@id='FleetNo']") WebElement supplementDocumentsFleetNo;
	@FindBy(xpath="//label[@for='FltExpMonthYear']") WebElement supplementDocumentsFltExpMonthYearLbl;
	@FindBy(xpath="//input[@id='FltExpMonthYear']") WebElement supplementDocumentsFltExpMonthYear;
	@FindBy(xpath="//label[@for='SupplementNo']") WebElement supplementDocumentsSupplementNoLbl;
	@FindBy(xpath="//input[@id='SupplementNo']") WebElement supplementDocumentsSupplementNo;
	@FindBy(xpath="//label[@for='FleetType']") WebElement supplementDocumentsFleetTypeLbl;
	@FindBy(xpath="//input[@id='FleetType']") WebElement supplementDocumentsFleetType;
	@FindBy(xpath="//label[@for='SuppType']") WebElement supplementDocumentsTransactionTypeLbl;
	@FindBy(xpath="//input[@id='SuppType']") WebElement supplementDocumentsTransactionType;
	@FindBy(xpath="//label[@for='USDot']") WebElement supplementDocumentsUSDotLbl;
	@FindBy(xpath="//input[@id='USDot']") WebElement supplementDocumentsUSDot;
	
	@FindBy(xpath="//label[@for='IRPRequirementsForm_DocStatInd']") WebElement supplementDocumentsIRPRequirementLbl;
	@FindBy(xpath="//select[@id='IRPRequirementsForm_DocStatInd']") WebElement supplementDocumentsIRPRequirement;
	@FindBy(xpath="//label[@for='StatementOfUnderstanding_DocStatInd']") WebElement supplementDocumentsStatementofUnderstandingLbl;;
	@FindBy(xpath="//select[@id='StatementOfUnderstanding_DocStatInd']") WebElement supplementDocumentsStatementOfUnderstanding;
	@FindBy(xpath="//label[@for='InstallmentAgreement_DocStatInd']") WebElement supplementDocumentsInstallmentAgreementLbl;
	@FindBy(xpath="//select[@id='InstallmentAgreement_DocStatInd']") WebElement supplementDocumentsInstallmentAgreement;
	@FindBy(xpath="//label[@for='PowerOfAttony_DocStatInd']") WebElement supplementDocumentsPowerOfAttonyLbl;
	@FindBy(xpath="//select[@id='PowerOfAttony_DocStatInd']") WebElement supplementDocumentsPowerOfAttony;
	

	
	//Fetch Values
	public String fetchAccountNoLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsAccountNoLbl);
	}

	public String fetchAccountNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(supplementDocumentsAccountNo);
	}
	public String fetchLegalNameLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsLegalNameLbl);
	}

	public String fetchLegalName() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(supplementDocumentsLegalName);
	}

	public String fetchDBALbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsDBALbl);
	}

	public String fetchDBA() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsDba,"value");
	}
	public String fetchFleetNoLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsFleetNoLbl);
	}

	public String fetchFleetNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsFleetNo,"value");
	}
	public String fetchExpMonthYearLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsFltExpMonthYearLbl);
	}

	public String fetchExpMonthYear() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsFltExpMonthYearLbl,"value");
	}
	public String fetchSupplementNoLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsSupplementNoLbl);
	}

	public String fetchSupplementNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsSupplementNoLbl,"value");
	}

	public String fetchFleetTypeLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsFleetTypeLbl);
	}

	public String fetchFleetType() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsFleetType,"value");
	}

	public String fetchTransactionTypeLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsTransactionTypeLbl);
	}

	public String fetchTransactionType() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsTransactionTypeLbl,"value");
	}

	public String fetchUSDOTLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsUSDotLbl);
	}
	
	public String fetchUSDOT() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(supplementDocumentsUSDot,"value");
	}
	
	public String supplementDocumentsStatementOfUnderstandingLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsStatementofUnderstandingLbl);
	}
	public String supplementDocumentsStatementOfUnderstanding() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(supplementDocumentsStatementOfUnderstanding);
	}
	
	public String supplementDocumentsInstallmentAgreementLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsInstallmentAgreementLbl);
	}
	public String supplementDocumentsInstallmentAgreement() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(supplementDocumentsInstallmentAgreement);
	}
	public String supplementDocumentsPowerOfAttorneyLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(supplementDocumentsPowerOfAttonyLbl);
	}
	public String supplementDocumentsPowerOfAttorney() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(supplementDocumentsPowerOfAttony);
	}
	
	
	public void enterAccountNo(String accountNo) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(supplementDocumentsAccountNo, accountNo);
	}
	public void selectIRPRequirements(String IRP) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(supplementDocumentsIRPRequirement, IRP);
	}
	
	public void selectstatmentdoccs(String statementUnderstanding) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(supplementDocumentsStatementOfUnderstanding, statementUnderstanding);
		
	}
	public void selectInstallmentDocs(String installment) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(supplementDocumentsInstallmentAgreement, installment);
	}
	public void selectPowerOfAttony(String powerOfAttony) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(supplementDocumentsPowerOfAttony, powerOfAttony);
}
}