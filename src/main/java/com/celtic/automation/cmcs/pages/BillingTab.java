package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class BillingTab {
	private WebDriver driver;
	public BillingTab(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#contentMsg > div > ul > li > span") WebElement billingValidationMessage;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(1) > span") WebElement billingValidationMessage2;
	@FindBy(css="#contentMsg > div > ul > li:nth-child(2) > span") WebElement billingValidationMessage3;


	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement billingSupplementDetailsSubhdr;
	@FindBy(xpath="//label[@for='RegMonth']") WebElement billingRegisterMonthLbl;
	@FindBy(xpath="//input[@id='RegMonth']") WebElement billingRegisterMonthTxt;

	@FindBy(xpath="//label[@for='NoOfPowerVehicle']") WebElement billingNoOfVehiclesinSuppLbl;
	@FindBy(xpath="//input[@id='NoOfPowerVehicle']") WebElement billingNoOfVehiclesInSuppTxt;

	@FindBy(xpath="//label[@for='SupplementStatus']") WebElement billingSupplementStatusLbl;
	@FindBy(xpath="//input[@id='SupplementStatus']") WebElement billingSupplementStatusTxt;

	@FindBy(xpath="//label[@for='EnterpriseEscrow']") WebElement billingEnterpriseSystemCreditLbl;
	@FindBy(xpath="//input[@id='EnterpriseEscrow']") WebElement billingEnterpriseSystemCreditTxt;

	@FindBy(xpath="//label[@for='IRPEscrow']") WebElement billingIRPSystemCreditLbl;
	@FindBy(xpath="//input[@id='IRPEscrow']") WebElement billingIRPSystemCreditTxt;

	@FindBy(xpath="//label[@for='RenewalFeeEffectiveDate']") WebElement billingRenewalFeeEffectiveDateLbl;
	@FindBy(xpath="//input[@id='RenewalFeeEffectiveDate']") WebElement billingRenewalFeeEffectiveDatedtPicker;

	@FindBy(xpath="//label[@for='InvoiceDate']") WebElement billingInvoiceDateLbl;
	@FindBy(xpath="//input[@id='InvoiceDate']") WebElement billingInvoiceDatedtPicker;

	@FindBy(xpath="//label[@for='ReceiptDate']") WebElement billingApplicationReceiptDateLbl;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement billingApplicationReceiptDatedtPicker;

	@FindBy(xpath="//label[@for='PaymentDate']") WebElement billingPaymentDateLbl;
	@FindBy(xpath="//input[@id='PaymentDate']") WebElement billingPaymentDatedtPicker;

	@FindBy(xpath="//label[@for='ExchangeRate']") WebElement billingExchangeRateLbl;
	@FindBy(xpath="//input[@id='ExchangeRate']") WebElement billingExchangeRateTxt;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement billingFeeSubhdr;

	@FindBy(xpath="//label[@for='ManualAdjBaseJur']") WebElement billingManualAdjBaseJurLbl;
	@FindBy(xpath="//input[@id='ManualAdjBaseJur']") WebElement billingManualAdjBaseJurTxt;

	@FindBy(xpath="//label[@for='BatchBilling']") WebElement billingBatchBillingLbl;
	@FindBy(xpath="//input[@id='BatchBilling']") WebElement billingBatchBillingChk;

	@FindBy(xpath="//label[@for='Chk30daysTear']") WebElement billingTVRLbl;
	@FindBy(xpath="//input[@id='Chk30daysTear']") WebElement billingTVRChk;

	@FindBy(xpath="//label[@for='QuaterPayment']") WebElement billingInstallmentPlanLbl;
	@FindBy(xpath="//input[@id='QuaterPayment']") WebElement billingInstallmentPlanChk;

	@FindBy(xpath="//label[@for='IsUseOneTimeMailing']") WebElement billingIsUseOneTimeMailingLbl;
	@FindBy(xpath="//input[@id='IsUseOneTimeMailing']") WebElement billingIsUseOneTimeMailingChk;
	@FindBy(xpath="//label[@for='NoOfdaysTear']") WebElement billingTVRNoOfDaysLbl;
	@FindBy(xpath="//input[@id='NoOfdaysTear']") WebElement billingTVRNoOfDaysTxt;

	//select[@id='selectEDC']
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden'))]") List<WebElement> billingGridHeaders;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeDescription')]") List<WebElement> billingFeeType;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeAmount')]") List<WebElement> billingFeeAmount;

	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement billingDeliveryDetailsSubhdr;

	@FindBy(xpath="//label[@for='selectEDC']") WebElement billingElectronicDeliveryTypeLbl;
	@FindBy(xpath="//select[@id='selectEDC']") WebElement billingElectronicDeliveryTypedd;

	@FindBy(xpath="//label[@for='selectedInvReport']") WebElement billingInvoiceReportTypeLbl;
	@FindBy(xpath="//select[@id='selectedInvReport']") WebElement billingInvoiceReportTypedd;
	@FindBy(xpath="//input[contains(@id,'FeeDetailRows_')and contains(@id,'_FeeDescription')]") List<WebElement> Billing_FeeType;

	@FindBy(xpath="//input[@id='btnRecalculate']") WebElement billingReCalculateBtn;
	@FindBy(xpath="(//select[contains(@id,'ReasonsSelect')])") List<WebElement> WaiveList;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Type')]") WebElement billingGridFeeType;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Amt')]") WebElement Billing_GridFeeAmount;
	@FindBy(xpath="//th[contains(@class,'sorting_disabled')and not( contains(@class,'hidden')) and contains(text(),'Waive')]") WebElement billingGridWaive;


	//Validation screen
	@FindBy(xpath="//label[@for='selectEDC30daysTear']") WebElement billingTVRElectronicDeliveryTypeLbl;
	@FindBy(xpath="//select[@id='selectEDC30daysTear']") WebElement billingTVRElectronicDeliveryTypedd;

	@FindBy(xpath="//input[@id='btnCancelBill']") WebElement billingCancelBillBtn;
	@FindBy(xpath="//input[@id='Email']") WebElement billingEmailIDTxt;

	@FindBy(xpath="//a[@role='button' and contains(text(),'Manual')]") WebElement billingManualAdjReasonCollapse;
	@FindBy(xpath="//textarea[@id='editComment_CommentTxtcommentsVM2']") WebElement billingManualAdjReasonCommentsTxt;
	@FindBy(xpath="//input[@id='editComment_DelAllowedcommentsVM2']") WebElement billingManualAdjReasonDeleteAllowedChk;
	@FindBy(xpath="//input[@id='addUpdateCommentBtncommentsVM2']") WebElement billingManualAdjReasonAddorUpdateCommentBtn;
	@FindBy(xpath="//input[@id='refreshCommentBtncommentsVM2']") WebElement billingManualAdjReasonClearCommentBtn;

	@FindBy(xpath="//select[@id='FeeDetailRows_8__WaiverReasonsSelect']") WebElement billingBicentennialFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_9__WaiverReasonsSelect']") WebElement billingGradeCrossingFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_10__WaiverReasonsSelect']") WebElement billingReplacementPlateFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_11__WaiverReasonsSelect']") WebElement billingSecondPlateFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_12__WaiverReasonsSelect']") WebElement billingLateFilingPenaltydd;
	@FindBy(xpath="//select[@id='FeeDetailRows_13__WaiverReasonsSelect']") WebElement billingLatePayPenaltydd;
	@FindBy(xpath="//select[@id='FeeDetailRows_14__WaiverReasonsSelect']") WebElement billingTransferFeedd;
	@FindBy(xpath="//select[@id='FeeDetailRows_15__WaiverReasonsSelect']") WebElement billingTransferRevenueFeedd;

	@FindBy(xpath="//a[@role='button' and contains(text(),'Fee')]") WebElement billingFeeOverrideReasonCollapse;
	@FindBy(xpath="//textarea[@id='editComment_CommentTxtcommentsVM3']") WebElement billingFeeOverrideReasonCommentsTxt;
	@FindBy(xpath="//input[@id='editComment_DelAllowedcommentsVM3']") WebElement billingFeeOverrideReasonDeleteAllowedChk;
	@FindBy(xpath="//input[@id='addUpdateCommentBtncommentsVM3']") WebElement billingFeeOverrideReasonAddorUpdateCommentBtn;
	@FindBy(xpath="//input[@id='refreshCommentBtncommentsVM3']") WebElement billingFeeOverrideReasonClearCommentBtn;

	///Reinstatement
	@FindBy(xpath="//a[@id='BillingBtn']") WebElement billingBillingTab;
	@FindBy(xpath="//input[@id='ReceiptDate']") WebElement billingAppReceiptDatedPicker;
	@FindBy(xpath="//h3[contains(@class,'pull-left')]") WebElement billingSubhdr;




	public void enterManualAdjBaseJur(String manualAdjBaseJurValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(billingManualAdjBaseJurTxt, manualAdjBaseJurValue);
	}
	public void clickBatchBilling() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingBatchBillingChk);
	}

	public void clickTVR() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingTVRChk);
	}
	public void clickInstallmentPlan() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingInstallmentPlanChk);
	}
	public void clickIsUseOneTimeMailingChk() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingIsUseOneTimeMailingChk);
	}
	public void enterTVRNofDays(String tVRNoOfDaysValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(billingTVRNoOfDaysTxt, tVRNoOfDaysValue);
	}
	public void selectElectronicDeliveryType(String electronicDeliveryTypeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingElectronicDeliveryTypedd,electronicDeliveryTypeValue);
	}

	public void selectInvoiceReportType(String invoiceReportTypeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingInvoiceReportTypedd,invoiceReportTypeValue);
	}
	public void clickReCalculate() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingReCalculateBtn);
	}
	public void selectTVRElectronicDeliveryType(String tVRElectronicDeliveryTypeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingTVRElectronicDeliveryTypedd,tVRElectronicDeliveryTypeValue);
	}
	public void clickCancelBill() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingCancelBillBtn);
	}
	public void enterEmailIDTxt(String emailIDTxtValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(billingEmailIDTxt, emailIDTxtValue);
	}
	public void expandManualAdjReason() throws Exception {

		if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingManualAdjReasonCollapse,"aria-expanded").equalsIgnoreCase("false")) {
			new ElementUtil(driver,ConfigReader.log).clickElement(billingManualAdjReasonCollapse);
		}
	}
	public void enterManualAdjReasonComments(String manualAdjReasonCommentsValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(billingManualAdjReasonCommentsTxt, manualAdjReasonCommentsValue);
	}
	public void clickManualAdjReasonDeleteAllowed() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingManualAdjReasonDeleteAllowedChk);
	}
	public void  clickManualAdjReasonAddorUpdateComments() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingManualAdjReasonAddorUpdateCommentBtn);
	}
	public void  clickManualAdjReasonclearComments() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingManualAdjReasonClearCommentBtn);
	}
	public void selectBicentennialFee(String bicentennialFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingBicentennialFeedd,bicentennialFeeValue);
	}
	public void selectGradeCrossingFee(String gradeCrossingFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingGradeCrossingFeedd,gradeCrossingFeeValue);
	}
	public void selectReplacementPlateFee(String replacementPlateFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingReplacementPlateFeedd,replacementPlateFeeValue);
	}
	public void selectSecondPlateFee(String secondPlateFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingSecondPlateFeedd,secondPlateFeeValue);
	}
	public void selectLateFilingPenalty(String lateFilingPenaltyValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingLateFilingPenaltydd,lateFilingPenaltyValue);
	}
	public void selectLatePayPenalty(String latePayPenaltyValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingLatePayPenaltydd,latePayPenaltyValue);
	}
	public void selectTransferFee(String transferFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingTransferFeedd,transferFeeValue);
	}
	public void selectTransferRevenueFee(String transferRevenueFeeValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(billingTransferRevenueFeedd,transferRevenueFeeValue);
	}
	public void expandFeeOverrideReason() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingFeeOverrideReasonCollapse);
	}
	public void enterFeeOverrideReasonComments(String manualAdjReasonCommentsValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(billingFeeOverrideReasonCommentsTxt, manualAdjReasonCommentsValue);
	}
	public void clickFeeOverrideReasonDeleteAllowed() {
		new ElementUtil(driver,ConfigReader.log).webCheckON(billingFeeOverrideReasonDeleteAllowedChk);

	}
	public void  clickFeeOverrideReasonAddorUpdateComments() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingFeeOverrideReasonAddorUpdateCommentBtn);
	}

	public void  clickFeeOverrideReasonclearComments() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingFeeOverrideReasonClearCommentBtn);
	}
	public void validateBillingtab(String textmsg) {
		Boolean a=billingBillingTab.getText().contains(textmsg);
		if(a==true) {
			assert true;
		}
		else {
			assert false;
		}
	}
	public String validateMessage() {
		new ElementUtil(driver,ConfigReader.log).clickElement(billingValidationMessage);
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, billingValidationMessage);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingValidationMessage);
	}

	public String validateMessage2() {
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, billingValidationMessage2);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingValidationMessage2);
	}
	public String validateMessage3() {
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, billingValidationMessage3);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingValidationMessage3);
	}

	///Reinstatement
	public void enterreceiptdate(String previousdate) {
		if(billingAppReceiptDatedPicker.getAttribute("value").isEmpty()) {
			new ElementUtil(driver,ConfigReader.log).clickElement(billingAppReceiptDatedPicker);
			new ElementUtil(driver,ConfigReader.log).webEditTxt(billingAppReceiptDatedPicker,previousdate); }
	}
	public void validatesubhdr(String hdrvalue) {
		if(billingSubhdr.getText().contains(hdrvalue))
			assert true;
	}
	//Fetch Values

	public String fetchRegisterMonthlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingRegisterMonthLbl);
	}

	public String fetchRegisterMonth() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingRegisterMonthTxt,"value");
	}
	public String fetchNoOfVehiclesinSupplbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingNoOfVehiclesinSuppLbl);
	}

	public String fetchNoOfVehiclesinSupp() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingNoOfVehiclesInSuppTxt,"value");
	}

	public String fetchSupplementStatuslbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingSupplementStatusLbl);
	}

	public String fetchSupplementStatus() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingSupplementStatusTxt,"value");
	}

	public String fetchEnterpriseSystemCreditlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingEnterpriseSystemCreditLbl);
	}

	public String fetchEnterpriseSystemCredit() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingEnterpriseSystemCreditTxt,"value");
	}

	public String fetchIRPSystemCreditlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingIRPSystemCreditLbl);
	}

	public String fetchIRPSystemCredit() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingIRPSystemCreditTxt,"value");
	}

	public String fetchRenewalFeeEffectiveDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingRenewalFeeEffectiveDateLbl);
	}

	public String fetchRenewalFeeEffectiveDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingRenewalFeeEffectiveDatedtPicker,"value");
	}

	public String fetchInvoiceDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingInvoiceDateLbl);
	}

	public String fetchInvoiceDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingInvoiceDatedtPicker,"value");
	}

	public String fetchApplicationReceiptDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingApplicationReceiptDateLbl);
	}

	public String fetchApplicationReceiptDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingApplicationReceiptDatedtPicker,"value");
	}

	public String fetchPaymentDatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingPaymentDateLbl);
	}

	public String fetchPaymentDate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingPaymentDatedtPicker,"value");
	}
	public String fetchExchangeRatelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingExchangeRateLbl);
	}

	public String fetchExchangeRate() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingExchangeRateTxt,"value");
	}
	public String fetchManualAdjBaseJurlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingManualAdjBaseJurLbl);
	}

	public String fetchManualAdjBaseJur() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingManualAdjBaseJurTxt,"value");
	}

	public String fetchBilling_BatchBillinglbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingBatchBillingLbl);
	}

	public String fetchBilling_BatchBilling() {
		boolean boolstatus=false;
		if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingBatchBillingChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_TVRlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingTVRLbl);
	}

	public String fetchBilling_TVR() {
		boolean boolstatus=false;
		if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingTVRChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_IsUseOneTimeMailinglbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingIsUseOneTimeMailingLbl);
	}

	public String fetchBilling_IsUseOneTimeMailing() {
		boolean boolstatus=false;
		if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingIsUseOneTimeMailingChk,"checked")==null){
			boolstatus=false;
		}
		else {
			boolstatus=true;
		}
		return Boolean.toString(boolstatus);
	}

	public String fetchBilling_InstallmentPlanlbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingInstallmentPlanLbl);
	}

	public String fetchBilling_InstallmentPlan() {
		boolean boolstatus=false;
		boolstatus=(!(new ElementUtil(driver,ConfigReader.log).isElementEnabled(billingInstallmentPlanChk))); 
		return Boolean.toString(boolstatus);
	
	}

	public String fetchBillingTVRNoOfDayslbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingTVRNoOfDaysLbl);
	}

	public String fetchBillingTVRNoOfDays() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingTVRNoOfDaysTxt,"value");
	}

	public ArrayList<String> FetchTableHeaders() {
		ArrayList<String> headersArray = new ArrayList<String>();
		for(int i=0;i<billingGridHeaders.size();i++) {
			headersArray.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingGridHeaders.get(i)));
		}
		return headersArray;
	}

	public ArrayList<String> FetchTable_FeeType() {
		ArrayList<String> feeTypeArray = new ArrayList<String>();
		for(int i=0;i<billingFeeType.size();i++) {
			feeTypeArray.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattributedisabled(billingFeeType.get(i),"value"));
		}
		return feeTypeArray;
	}
	public ArrayList<String> FetchTable_FeeAmount() {
		ArrayList<String> feeAmountArray = new ArrayList<String>();
		for(int i=0;i<billingFeeAmount.size();i++) {
			feeAmountArray.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattributedisabled(billingFeeAmount.get(i),"value"));
		}
		return feeAmountArray;
	}
	public String fetchElectronicDeliveryTypelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingElectronicDeliveryTypeLbl);
	}
	public String fetchElectronicDeliveryType() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(billingElectronicDeliveryTypedd);
	}
	public String fetchBilling_Email() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingEmailIDTxt,"value");
	}
	public String fetchInvoiceReportTypelbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingInvoiceReportTypeLbl);
	}
	public String fetchBilling_InvoiceReportType() {
		return new ElementUtil(driver,ConfigReader.log).FetchDropdownSelectedValue(billingInvoiceReportTypedd);
	}
	@SuppressWarnings("unused")
	public void selectWaiveOff(String FeeTypeExcel, String FeeWaiveExcel) {
		for(int i=0;i<Billing_FeeType.size();i++) {
			if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattributedisabled(Billing_FeeType.get(i),"value").trim().equalsIgnoreCase(FeeTypeExcel));{
				new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(WaiveList.get(i), FeeWaiveExcel);
				break;
			}
		}
	}
	//Returns True only is the Specified Fee Type contains amount more than zero
	//Bicentennial Fee,Grade Crossing Fee,Replacement Plate Fee,Second Plate Fee,Late Filing Penalty,Late Pay Penalty,Transfer Fee,Transfer Revenue Fee,Wire Transfer Fee
	public boolean getAmount(String FeeTypeExcel) {
		boolean Amountbool=false;
		for(int i=0;i<Billing_FeeType.size();i++) {
			if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattributedisabled(Billing_FeeType.get(i),"value").trim().equalsIgnoreCase(FeeTypeExcel));{
				String FeeAmountValue=new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattributedisabled(billingFeeAmount.get(i),"value").trim();
				if(Double.valueOf(String.format("%.2f",(Double.valueOf(FeeAmountValue))))>0){
					Amountbool=true;
					break;
				}
			}
		}
		return Amountbool;
	}
	public String fetchbillingTVRNoOfDaysLbl() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingTVRNoOfDaysLbl);
	}
	public String fetchBilling_TVRNoOfDays() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(billingTVRNoOfDaysTxt,"value");
	}
	public ArrayList<String> FetchTable_Headers() {
		ArrayList<String> Headers_array = new ArrayList<String>();
		for(int i=0;i<billingGridHeaders.size();i++) {
			Headers_array.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingGridHeaders.get(i)));
		}
		return Headers_array;
	}
	public String fetchBillingGridFeeType() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingGridFeeType);
	}
	public String fetchBillingGridFeeAmount() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(Billing_GridFeeAmount);
	}
	public String fetchbillingGridWaive() {
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(billingGridWaive);
	}
}