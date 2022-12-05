package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;


public class Financepage {
	
	private  WebDriver driver;

	public Financepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='AccountNo']") WebElement postPaymentAccountNoLbl;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement postPaymentAccountNo;
	@FindBy(xpath="//label[@for='FleetNbr']") WebElement installmentFleetNoLbl;
	@FindBy(xpath="//input[@id='FleetNbr']") WebElement Installment_FleetNo;
	@FindBy(xpath="//label[@for='LegalName']") WebElement Installment_LegalNamelbl;
	@FindBy(xpath="//input[@id='LegalName']") WebElement Installment_LegalName;
	@FindBy(xpath="//label[@for='FltMonthYear']") WebElement PostPayment_FleerMonthYearlbl;
	@FindBy(xpath="//input[@id='FltMonthYear']") WebElement PostPayment_FleerMonthYear;
	@FindBy(xpath="//label[@for='SupplementNo']") WebElement Installment_SupplementNolbl;
	@FindBy(xpath="//input[@id='SupplementNo']") WebElement Installment_SupplementNo;
	@FindBy(xpath="//label[@for='DBAName']") WebElement Installment_DBANamelbl;
	@FindBy(xpath="//input[@id='DBAName']") WebElement Installment_DBAName;
	@FindBy(xpath="//label[@for='CMVFleetType']") WebElement PostPayment_FleetTpelbl;
	@FindBy(xpath="//input[@id='CMVFleetType']") WebElement PostPayment_FleetTpe;
	@FindBy(xpath="//label[@for='SupplementDesc']") WebElement Installment_SupplementDesclbl;
	@FindBy(xpath="//input[@id='SupplementDesc']") WebElement Installment_SupplementDesc;
	@FindBy(xpath="//label[@for='UsdotNbr']") WebElement Installment_USDOTlbl;
	@FindBy(xpath="//input[@id='UsdotNbr']") WebElement Installment_USDOT;
	@FindBy(xpath="//label[@for='SupplementEffectiveDate']") WebElement PostPayment_SupplementEffectiveDatelbl;
	@FindBy(xpath="//input[@id='SupplementEffectiveDate']") WebElement PostPayment_SupplementEffectiveDate;
	@FindBy(xpath="//label[@for='SupplementStatus']") WebElement Installment_SupplementStatuslbl;
	@FindBy(xpath="//input[@id='SupplementStatus']") WebElement Installment_SupplementStatus;
	@FindBy(xpath="//label[@for='InvoiceDate']") WebElement Installment_InvoiceDatelbl;
	@FindBy(xpath="//input[@id='InvoiceDate']") WebElement Installment_InvoiceDate;
	@FindBy(xpath="//label[@for='invoiceNbr']") WebElement Installment_invoiceNbrlbl;
	@FindBy(xpath="//input[@id='invoiceNbr']") WebElement Installment_invoiceNbr;
	@FindBy(xpath="//label[@for='EnterpriseEscrow']") WebElement PostPayment_EnterpriseSystemCreditlbl;
	@FindBy(xpath="//input[@id='EnterpriseEscrow']") WebElement PostPayment_EnterpriseSystemCredit;
	@FindBy(xpath="//label[@for='ReceiptDate']") WebElement Installment_ReceiptDatelbl;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement Installment_ReceiptDate;
	@FindBy(xpath="//label[@for='InstallmentPlanNumber']") WebElement Installment_InstallmentPlanNumberlbl;
	@FindBy(xpath="//input[@id='InstallmentPlanNumber']") WebElement Installment_InstallmentPlanNumber;
	
	@FindBy(xpath="//th[@class='sorting_disabled']") List<WebElement> Fee_Headers;
	@FindBy(xpath="//tr[@role='row']//th[not(contains(@class,'hidden')) and (contains(@class,'Align'))]") List<WebElement> Fee_Row;
	
	@FindBy(xpath="//a[@title='Finance']") WebElement DashboardFinancetab;
	@FindBy(xpath="//a[@title='Post Payment']") WebElement Finance_postpayment;
	
	@FindBy(xpath="//input[@id='btnSearch']") WebElement PostPayment_Search;
	@FindBy(xpath="//a[@id='lnkGridSelectgvPostPayment']") WebElement PostPayment_Cartid;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement PostPayment_Mceid;
	
	//installment payment
	
	
	@FindBy(xpath="//a[@title='Services']") WebElement Installment_Service;
	@FindBy(xpath="//a[@title='IRP']") WebElement Installment_IRP;
	@FindBy(xpath="//input[@id='AccountNo']") WebElement Installment_AccountNo;
	
	@FindBy(xpath="//input[@id='FltExpYear']") WebElement Installment_FleetYear;
	@FindBy(xpath="//a[@id='lnkGridSelectCustomerGrid']") WebElement Installment_Grid;
	@FindBy(xpath="//select[@id='paymentVos_0__PayType']") WebElement Installment_paytype;
	@FindBy(xpath="//input[@id='paymentVos_0__PaymentAmount']") WebElement Installment_paymentcash;
	@FindBy(xpath="//select[@id='outPutModelSelect']") WebElement Intallment_Pdf;
	
	
	public void clickfinance() {
		new ElementUtil(driver,ConfigReader.log).clickElement(DashboardFinancetab);
	}
	public void clickpostpayment() {
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(Finance_postpayment);
	}
	
	
	public void enterMCEid(String MCEIDvalue) {
		new ElementUtil(driver,ConfigReader.log).clickElement(PostPayment_Mceid);
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(PostPayment_Mceid,MCEIDvalue);
	}
	
	
	public void clicksearch() {
		new ElementUtil(driver,ConfigReader.log).clickElement(PostPayment_Search);
	}
	
	public void clickoncartid() {
		new ElementUtil(driver,ConfigReader.log).clickElement(PostPayment_Cartid);
	}
	public void clickservice() {
		new ElementUtil(driver,ConfigReader.log).clickElement(Installment_Service);
	}
	public void clickIRP() {
		new ElementUtil(driver,ConfigReader.log).clickElement(Installment_IRP);
	}
	public void selectpaymenttype(String selectValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(Installment_paytype, selectValue); //Cash,Check,Certified Check,E-check,Credit Card,Wire Transfer,EFT,Enterprise System Credit,IRP System Credit,IFTA System Credit,OPA System Credit,IFTA Bond	
	}
	public void entercashamount(String installmenttypevalue) {	
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Installment_paymentcash,installmenttypevalue);
	}
	public void clickreceipt(String selectValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByValue(Intallment_Pdf, selectValue);
}
	
	public void clickandenterAccountNo(String accountnovalue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Installment_AccountNo,accountnovalue);
	}
	public void clickandenterfleet(String fleetnovalue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Installment_FleetNo,fleetnovalue);
	}
	public void clickandenterfleetyear(String yearvalue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Installment_FleetYear,yearvalue);
	}
	public void clickgrid() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElement(Installment_Grid);
	}

	
	
	//Fetch values
	public ArrayList<String> fetchTableHeader() {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(Fee_Headers);
		ArrayList<String> Headers_Array = new ArrayList<String>();
		for(int i=0;i<Fee_Headers.size();i++) {
			Headers_Array.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Fee_Headers.get(i)));
		}
		return Headers_Array;
	}
	public ArrayList<String> fetchTableRowValues() {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(Fee_Row);
		ArrayList<String> Juris_Array = new ArrayList<String>();
		for(int i=0;i<Fee_Row.size();i++) {
			Juris_Array.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Fee_Row.get(i)));
		}
		return Juris_Array;
	}
	
	public String fetchPostPaymentAccountNoLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(postPaymentAccountNoLbl);
	}
	public String fetchPostPaymentAccountNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(postPaymentAccountNo,"value");
	}
	public String fetchFleetNolbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(installmentFleetNoLbl);
	}
	public String fetchFleetNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_FleetNo,"value");
	}
	public String fetchLegalNamelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_LegalNamelbl);
	}
	public String fetchLegalName() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_LegalName,"value");
	}
	public String fetchFleetMonthYearlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(PostPayment_FleerMonthYearlbl);
	}
	public String fetchFleetMonthYear() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(PostPayment_FleerMonthYear,"value");
	}
	public String fetchSupplementNolbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_SupplementNolbl);
	}
	public String fetchSupplementNo() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_SupplementNo,"value");
	}
	public String fetchDBANamelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_DBANamelbl);
	}
	public String fetchDBAName() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_DBAName,"value");
	}
	public String fetchFleetTypelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(PostPayment_FleetTpelbl);
	}
	public String fetchFleetType() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(PostPayment_FleetTpe,"value");
	}
	public String fetchSupplementDesclbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_SupplementDesclbl);
	}
	public String fetchSupplementDesc() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_SupplementDesc,"value");
	}
	public String fetchUSDOTlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_USDOTlbl);
	}
	public String fetchUSDOT() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_USDOT,"value");
	}
	public String fetchSupplementEffectiveDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(PostPayment_SupplementEffectiveDatelbl);
	}
	public String fetchSupplementEffectiveDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(PostPayment_SupplementEffectiveDate,"value");
	}
	public String fetchSupplementStatuslbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_SupplementStatuslbl);
	}
	public String fetchSupplementStatus() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_SupplementStatus,"value");
	}
	public String fetchInvoiceDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_InvoiceDatelbl);
	}
	public String fetchInvoiceDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_InvoiceDate,"value");
	}
	public String fetchInvoicenolbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_invoiceNbrlbl);
	}
	public String fetchInvoiceno() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_invoiceNbr,"value");
	}
	public String fetchEnterpriseSystemCreditlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(PostPayment_EnterpriseSystemCreditlbl);
	}

	public String fetchEnterpriseSystemCredit() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(PostPayment_EnterpriseSystemCredit,"value");
	}
	public String fetchInstallment_ReceiptDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_ReceiptDatelbl);
	}

	public String fetchInstallment_ReceiptDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_ReceiptDate,"value");
	}
	public String fetchInstallmentPlanNumberlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Installment_InstallmentPlanNumberlbl);
	}

	public String fetchInstallmentPlanNumber() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(Installment_InstallmentPlanNumber,"value");
	}


}