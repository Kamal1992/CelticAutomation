package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleAdd {
	private WebDriver driver;
	public VehicleAdd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='CopyVIN']") WebElement addVinLbl;
	@FindBy(xpath="//input[@id='CopyVIN']") WebElement addVinTxt;
	
	@FindBy(xpath="//label[@for='CopyUnitNo']") WebElement addUnitNoLbl;
	@FindBy(xpath="//input[@id='CopyUnitNo']") WebElement addUnitNoTxt;
	
	@FindBy(xpath="//label[@for='CopyPlateNo']") WebElement addPlateNoLbl;
	@FindBy(xpath="//input[@id='CopyPlateNo']") WebElement addPlateNoTxt;
	
	@FindBy(xpath="//input[@id='btnSearch']") WebElement addSearchBtn;
	
	@FindBy(xpath="//label[@for='NoOfVehicle']") WebElement addNoOfVehiclesLbl;
	@FindBy(xpath="//input[@id='NoOfVehicle']") WebElement addNoOfVehiclesTxt;
	
	@FindBy(xpath="//label[@for='RegistrantType']") WebElement addRegistrationTypeLbl;
	@FindBy(xpath="//select[@id='RegistrantType']") WebElement addRegistrationTypedd;
	
	@FindBy(xpath="//label[@for='VehDtlUnitNo']") WebElement addDetailsUnitNoLbl;
	@FindBy(xpath="//input[@id='VehDtlUnitNo']") WebElement addDetailsUnitNoTxt;
	
	@FindBy(xpath="//label[@for='VehDtlWeightGroupNo']") WebElement addDetailsWeightGroupNoLbl;
	@FindBy(xpath="//select[@id='VehDtlWeightGroupNo']") WebElement addDetailsWeightGroupNodd;
	
	@FindBy(xpath="//label[@for='VehDtlYear']") WebElement addDetailsYearLbl;
	@FindBy(xpath="//input[@id='VehDtlYear']") WebElement addDetailsYearTxt;
	@FindBy(xpath="//label[@for='VehDtlBodyStyle']") WebElement addDetailsBodyTypeLbl;
	@FindBy(xpath="//select[@id='VehDtlBodyStyle']") WebElement addDetailsBodyTypedd;
	
	@FindBy(xpath="//label[@for='VehDtlMake']") WebElement addDetailsMakeLbl;
	@FindBy(xpath="//select[@id='VehDtlMake']") WebElement addDetailsMakedd;
	@FindBy(xpath="//label[@for='VehDtlAxles']") WebElement addDetailsAxleLbl;
	@FindBy(xpath="//input[@id='VehDtlAxles']") WebElement addDetailsAxleTxt;
	
	@FindBy(xpath="//label[@for='VehDtlCombinedAxles']") WebElement addDetailsCombinedAxleLbl;
	@FindBy(xpath="//input[@id='VehDtlCombinedAxles']") WebElement addDetailsCombinedAxleTxt;
	
	@FindBy(xpath="//label[@for='VehDtlFuleType']") WebElement addDetailsFuelTypeLbl;
	@FindBy(xpath="//select[@id='VehDtlFuleType']") WebElement addDetailsFuelTypedd;
	
	@FindBy(xpath="//label[@for='VehDtlSeats']") WebElement addDetailsSeatsLbl;
	@FindBy(xpath="//input[@id='VehDtlSeats']") WebElement addDetailsSeatsTxt;
	
	@FindBy(xpath="//label[@for='VehDtlColor']") WebElement addDetailsColorLbl;
	@FindBy(xpath="//select[@id='VehDtlColor']") WebElement addDetailsColordd;
	
	@FindBy(xpath="//label[@for='VehDtlUnladenWeight']") WebElement addDetailsUnladenWeightLbl;
	@FindBy(xpath="//input[@id='VehDtlUnladenWeight']") WebElement addDetailsUnladenWeightTxt;
	
	@FindBy(xpath="//label[@for='VehDtlMaxDesiredWeight']") WebElement addDetailsGrossWeightLbl;
	@FindBy(xpath="//input[@id='VehDtlMaxDesiredWeight']") WebElement addDetailsGrossWeightTxt;

	@FindBy(xpath="//label[@for='PurchaseDate']") WebElement addDetailsPurchaseDateLbl;
	@FindBy(xpath="//input[@id='PurchaseDate']") WebElement addDetailsPurchaseDatedtPicker;

	@FindBy(xpath="//label[@for='PurchasePrice']") WebElement addDetailsPurchasePriceLbl;
	@FindBy(xpath="//input[@id='PurchasePrice']") WebElement addDetailsPurchasePriceTxt;

	@FindBy(xpath="//label[@for='FactoryPrice']") WebElement addDetailsFactoryPriceLbl;
	@FindBy(xpath="//input[@id='FactoryPrice']") WebElement addDetailsFactoryPriceTxt;

	@FindBy(xpath="//label[@for='IsTearIndicator']") WebElement addDetailsTVRLbl;
	@FindBy(xpath="//input[@id='IsTearIndicator']") WebElement addDetailsTVRChk;

	@FindBy(xpath="//label[@for='NoOfDays']") WebElement addDetailsTVRDaysLbl;
	@FindBy(xpath="//input[@id='NoOfDays']") WebElement addDetailsTVRDaysTxt;

	@FindBy(xpath="//label[@for='VehDtlTitleJurisdiction']") WebElement addDetailsTitleJurisdictionLbl;
	@FindBy(xpath="//select[@id='VehDtlTitleJurisdiction']") WebElement addDetailsTitleJurisdictiondd;
	
	@FindBy(xpath="//label[@for='VehDtlTitleNo']") WebElement addDetailsTitleNoLbl;
	@FindBy(xpath="//input[@id='VehDtlTitleNo']") WebElement addDetailsTitleNoTxt;
	
	@FindBy(xpath="//label[@for='VehDtlCountyPlateType']") WebElement addDetailsInStatePlateTypeLbl;
	@FindBy(xpath="//select[@id='VehDtlCountyPlateType']") WebElement addDetailsInStatePlateTypedd; //BY - Beyond Local,LO - Local

	@FindBy(xpath="//label[@for='VehDtlCountyWeight']") WebElement addDetailsInStateWeightLbl;
	@FindBy(xpath="//input[@id='VehDtlCountyWeight']") WebElement addDetailsInStateWeightTxt;

	@FindBy(xpath="//label[@for='CountyPlateExpiration']") WebElement addDetailsInstateExpirationDateLbl;
	@FindBy(xpath="//input[@id='CountyPlateExpiration']") WebElement addDetailsInstateExpirationDatedtPicker;

	@FindBy(xpath="//label[@for='VehDtlCountyPlate']") WebElement addDetailsInStatePlateLbl;
	@FindBy(xpath="//input[@id='VehDtlCountyPlate']") WebElement addDetailsInStatePlateTxt;;

	@FindBy(xpath="//label[@for='CountyFee']") WebElement addDetailsInStateFeeLbl;
	@FindBy(xpath="//input[@id='CountyFee']") WebElement addDetailsInStateFeeTxt;

	@FindBy(xpath="//label[@for='OwnerDtlName']") WebElement addDetailsOwnerNameLbl;
	@FindBy(xpath="//input[@id='OwnerDtlName']") WebElement addDetailsOwnerNameTxt;

	@FindBy(xpath="//label[@for='OwnerPhoneNo']") WebElement addDetailsOwnerPhoneNoLbl;
	@FindBy(xpath="//input[@id='OwnerPhoneNo']") WebElement addDetailsOwnerPhoneNoTxt;
	
	@FindBy(xpath="//label[@for='LeaseOrOwner']") WebElement addDetailsSafetyResponsibilityLbl;
	@FindBy(xpath="//select[@id='LeaseOrOwner']") WebElement addDetailsSafetyResponsibilitydd;

	@FindBy(xpath="//label[@for='IsLease']") WebElement addDetailsIsLeaseLbl;
	@FindBy(xpath="//input[@id='IsLease']") WebElement addDetailsIsLeaseChk;

	@FindBy(xpath="//label[@for='VehDtlSafetyUsdot']") WebElement Add_Details_SafetyUSDOTlbl;
	@FindBy(xpath="//input[@id='VehDtlSafetyUsdot']") WebElement Add_Details_SafetyUSDOTtxt;
	
	@FindBy(xpath="//label[@for='VehDtlSafetyTin']") WebElement Add_Details_SafetyTPIDlbl;
	@FindBy(xpath="//input[@id='VehDtlSafetyTin']") WebElement Add_Details_SafetyTPIDtxt;
	
	@FindBy(xpath="//label[@for='SaftyChangeDuringYear']") WebElement Add_Details_SafetyChangelbl;
	@FindBy(xpath="//select[@id='SaftyChangeDuringYear']") WebElement Add_Details_SafetyChangedd;
	
	@FindBy(xpath="//label[@for='IsUseExistingPlate']") WebElement Add_Details_UseExistingPlatelbl;
	@FindBy(xpath="//input[@id='IsUseExistingPlate']") WebElement Add_Details_UseExistingPlatechk;

	@FindBy(xpath="//label[@for='ExistingPlate']") WebElement Add_Details_ExistingPlatelbl;
	@FindBy(xpath="//input[@id='ExistingPlate']") WebElement Add_Details_ExistingPlatetxt;

	@FindBy(xpath="//label[@for='VehDtlIsChangeUsdotAddress']") WebElement Add_Details_ChangeUSDOTAddresslbl;
	@FindBy(xpath="//input[@id='VehDtlIsChangeUsdotAddress']") WebElement Add_Details_ChangeUSDOTAddresschk;
	
	@FindBy(xpath="//label[@for='CabCardFeeOverride']") WebElement Add_Details_GradeCrossingFeelbl;
	@FindBy(xpath="//input[@id='CabCardFeeOverride']") WebElement Add_Details_GradeCrossingFeechk;
	
	@FindBy(xpath="//label[@for='TAFeeOverride']") WebElement Add_Details_Bicenetenniallbl;
	@FindBy(xpath="//input[@id='TAFeeOverride']") WebElement Add_Details_Bicenetenniallchk;
	
	@FindBy(xpath="//label[@for='SecondPlateF']") WebElement Add_Details_SecondPlatelbl;
	@FindBy(xpath="//input[@id='SecondPlateF']") WebElement Add_Details_SecondPlatechk;

	@FindBy(xpath="//label[@for='SecondPlateFeeOverrideF']") WebElement Add_Details_SecondPlateFeelbl;
	@FindBy(xpath="//input[@id='SecondPlateFeeOverrideF']") WebElement Add_Details_SecondPlateFeechk;

	@FindBy(xpath="//label[@for='ColoradoDistanceFlag']") WebElement AddVehicle_Colorado10KIndicatorlbl;
	@FindBy(xpath="//select[@id='ColoradoDistanceFlag']") WebElement AddVehicle_Colorado10KIndicatordd;
	@FindBy(xpath="//label[@for='ColoradoTrailerFlag']") WebElement AddVehicle_ColoradoTrailerlbl;
	@FindBy(xpath="//select[@id='ColoradoTrailerFlag']") WebElement AddVehicle_ColoradoTrailerdd;
	@FindBy(xpath="//label[@for='UTSpecialTruckFlag']") WebElement AddVehicle_UtahSpecialTrucklbl;
	@FindBy(xpath="//select[@id='UTSpecialTruckFlag']") WebElement AddVehicle_UtahSpecialTruckdd;
	@FindBy(xpath="//label[@for='NewUsedF']") WebElement AddVehicle_NewVehiclelbl;
	@FindBy(xpath="//select[@id='NewUsedF']") WebElement AddVehicle_NewVehicledd;
	@FindBy(xpath="//label[@for='CoSpecialTruck']") WebElement AddVehicle_COSpecialTrucklbl;
	@FindBy(xpath="//select[@id='CoSpecialTruck']") WebElement AddVehicle_COSpecialTruckdd;
	
	//Documentation Requirement Tracking
			@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[6]") WebElement AddVehicle_TrackingSubHdr;
			@FindBy(xpath="//label[@for='HVUTForm2290']") WebElement AddVehicle_HVUTForm2290lbl;
			@FindBy(xpath="//select[@id='HVUTForm2290']") WebElement AddVehicle_HVUTForm2290dd;
			
			@FindBy(xpath="//label[@for='LeaseContract']") WebElement AddVehicle_LeaseContractlbl;
			@FindBy(xpath="//select[@id='LeaseContract']") WebElement AddVehicle_LeaseContractdd;
			
			@FindBy(xpath="//label[@for='TitleDocument']") WebElement AddVehicle_TitleDocumentlbl;
			@FindBy(xpath="//select[@id='TitleDocument']") WebElement AddVehicle_TitleDocumentdd;
			
			@FindBy(xpath="//label[@for='PlateReturndoc']") WebElement AddVehicle_PlateReturndocbl;
			@FindBy(xpath="//select[@id='PlateReturndoc']") WebElement AddVehicle_PlateReturndocdd;
			
			@FindBy(xpath="//label[@for='AffidavitDoc']") WebElement AddVehicle_AffidavitDoclbl;
			@FindBy(xpath="//select[@id='AffidavitDoc']") WebElement AddVehicle_AffidavitDocdd;
		
	//Update Vehicle from Vehicle List
			@FindBy(xpath="//input[@id='CopyUnitNo']") WebElement VehicleList_EnterUnitno;
			@FindBy(xpath="//input[@id='btnFind']") WebElement VehicleList_VehicleSearch;
			@FindBy(xpath="//a[@id='lnkGridSelectgvVehicleList']") WebElement VehicleList_Vehicleunit1;
            @FindBy(xpath="//input[@id='btnCancel']") WebElement VehicleList_CancelVehicle;
			

public void enterVINNumber(String VinNumberValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addVinTxt, VinNumberValue);
}

public void clickSearch() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElement(addSearchBtn);
	//new ElementUtil(driver,ConfigReader.log).sleepTime(2000);
}
public void enterUnitNumber(String UnitNumber) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addUnitNoTxt, UnitNumber);
}
public void enterDetailsUnitNumber(String UnitNumberValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsUnitNoTxt, UnitNumberValue);
}
public void selectBodyType(String BodyTypeValue) throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsBodyTypedd, BodyTypeValue);
	//new ElementUtil(driver,ConfigReader.log).sleepTime(1000);
}
public void selectWeightGroupNumber(String BodyTypeValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsWeightGroupNodd, BodyTypeValue);
}
public void enterseats(String SeatValue) {
	try{
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsSeatsTxt, SeatValue);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}
public void enterYear(String YearValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsYearTxt, YearValue);
}
public void selectMake(String MakeValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsMakedd, MakeValue);
}

public void enterAxle(String AxleValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsAxleTxt, AxleValue);
}

public void enterCombinedAxle(String combinedAxleValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsCombinedAxleTxt, combinedAxleValue);
}

public void selectFuelType(String FuelTypeValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsFuelTypedd, FuelTypeValue);
}

public void selectColor(String ColorValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsColordd, ColorValue);
}

public void enterUnladenWeight(String UnladeWeightValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsUnladenWeightTxt, UnladeWeightValue);
}
public void EmptyenterPurchaseDate(String purchaseDate) {
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(AddVehicle_AffidavitDocdd, "value").isEmpty()) {
		new ElementUtil(driver,ConfigReader.log).clickElement(addDetailsPurchaseDatedtPicker);
	new ElementUtil(driver,ConfigReader.log).webEditTxt(addDetailsPurchaseDatedtPicker,purchaseDate); }
}
public void enterPurchaseprice(String PurchasePriceValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsPurchasePriceTxt, PurchasePriceValue);
}

public void enterFactoryPrice(String FactoryPriceValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsFactoryPriceTxt, FactoryPriceValue);
}

public void checkTVR() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(addDetailsTVRChk);
}
public void checkUseexistingplate() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_UseExistingPlatechk);
}
public void enterTVRDays(String TVRDaysValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsTVRDaysTxt, TVRDaysValue);
}

public void selectTitleJurisdiction(String TitleJurisdictionValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsTitleJurisdictiondd, TitleJurisdictionValue);
}

public void enterTitleNo(String TitleNumberValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsTitleNoTxt, TitleNumberValue);
}
public void selectInStatePlateType(String InStatePlateTypeValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsInStatePlateTypedd, InStatePlateTypeValue);
}

public void enterInStatePlateWeight(String InStatePlateWeightValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsInStateWeightTxt, InStatePlateWeightValue);
}
public void EmptyenterInStateExpirationDate(String InStateExpirationDateValue) {
	if(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithattribute(addDetailsInstateExpirationDatedtPicker,"value").isEmpty()) {
		new ElementUtil(driver,ConfigReader.log).clickElement(addDetailsInstateExpirationDatedtPicker);
	new ElementUtil(driver,ConfigReader.log).webEditTxt(addDetailsInstateExpirationDatedtPicker,InStateExpirationDateValue); }
	}

public void enterInStatePlate(String InStatePlateValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsInStatePlateTxt, InStatePlateValue);
}
public void enterInStateFee(String InStateFeeValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsInStateFeeTxt, InStateFeeValue);
}

public void enterOwnerName(String InSlatePlateValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsOwnerNameTxt, InSlatePlateValue);
}
public void enterOwnerPhoneNumber(String InSlateFeeValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsOwnerPhoneNoTxt, InSlateFeeValue);
}
public void selectSafetyResponsibility(String SafetyResponsibilityValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(addDetailsSafetyResponsibilitydd, SafetyResponsibilityValue);
}

public void checkLease() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(addDetailsIsLeaseChk);
}
public void enterSafetyUSDOT(String SafetyUSDOTValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Add_Details_SafetyUSDOTtxt, SafetyUSDOTValue);
}
public void enterSafetyTPID(String SafetyTPIDValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Add_Details_SafetyTPIDtxt, SafetyTPIDValue);
}
public void selectSafetyChange(String SafetyChangeValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(Add_Details_SafetyChangedd, SafetyChangeValue);
}
public void checkExistingPlate() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_UseExistingPlatechk);
}

public void enterExistingPlate(String ExistingPlateValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(Add_Details_ExistingPlatetxt, ExistingPlateValue);
}

public void checkChangeUSDOTAddress() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_ChangeUSDOTAddresschk);
}
public void checkGradeCrossingFee() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_GradeCrossingFeechk);
}
public void checkBicenetenniall() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_Bicenetenniallchk);
}
public void checkSecondPlate() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_SecondPlatechk);
}
public void checkSecondPlateFee() {
	new ElementUtil(driver,ConfigReader.log).webCheckON(Add_Details_SecondPlateFeechk);
}

public void selectColorado10kIndicator(String Colorado10kIndicatorddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_Colorado10KIndicatordd,Colorado10kIndicatorddValue);
}

public void selectColoradoTrailer(String ColoradoTrailerddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_ColoradoTrailerdd,ColoradoTrailerddValue);
}

public void selectUtahSpecialTruck(String UtahSpecialTruckddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_UtahSpecialTruckdd,UtahSpecialTruckddValue);
}

public void selectCNewVehicle(String NewVehicleddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_NewVehicledd,NewVehicleddValue);
}

public void selectCOSpecialTruck(String COSpecialTruckddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_COSpecialTruckdd,COSpecialTruckddValue);
}

public void selectHVUTForm2290(String HVUTForm2290ddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_HVUTForm2290dd,HVUTForm2290ddValue);
}

public void selectLeaseContract(String LeaseContractddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_LeaseContractdd,LeaseContractddValue);
}
public void selectTitleDocument(String TitleDocumentddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_TitleDocumentdd,TitleDocumentddValue);
}
public void selectPlateReturndoc(String PlateReturndocddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_PlateReturndocdd,PlateReturndocddValue);
}

public void selectAffidavitDoc(String AffidavitDocddValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AddVehicle_AffidavitDocdd,AffidavitDocddValue);
}
//update vehicle list
public void UpdatevehiclelistUnit(String UnitNumber) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(VehicleList_EnterUnitno, UnitNumber);
}
public void Updatevehiclelistsearch() throws InterruptedException {
	new ElementUtil(driver,ConfigReader.log).clickElement(VehicleList_VehicleSearch);
	//new ElementUtil(driver,ConfigReader.log).sleepTime(1000);
}
public void selectFirstHandIcon() {
	new ElementUtil(driver,ConfigReader.log).clickElement(VehicleList_Vehicleunit1);
}
public void UpdateFactoryPrice(String FactoryPrice) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(addDetailsFactoryPriceTxt, FactoryPrice);
}
public void CancelVehicle() {
	new ElementUtil(driver,ConfigReader.log).clickElement(VehicleList_CancelVehicle);
}
}
