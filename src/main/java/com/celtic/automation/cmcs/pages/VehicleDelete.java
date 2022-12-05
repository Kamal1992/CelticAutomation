package com.celtic.automation.cmcs.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleDelete {
	private WebDriver driver;
	public VehicleDelete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css ="#contentMsg > div > ul") WebElement deleteVerificationMessage;
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[1]") WebElement amendVehicleSupplementDetailsSubHdr;
	@FindBy(xpath="//label[@for='NoOfDeletedVehicle']") WebElement deleteVehicleDeletedVehicleLbl;
	@FindBy(xpath="//input[@id='NoOfDeletedVehicle']") WebElement deleteVehicleDeletedVehicleTxt;
	
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[2]") WebElement amendVehicleSearchSubHdr;
	@FindBy(xpath="//label[@for='UnitNbr']") WebElement deleteVehicleUnitNumberLbl;
	@FindBy(xpath="//input[@id='UnitNbr']") WebElement deleteVehicleUnitNumberTxt;
	
	@FindBy(xpath="//label[@for='VIN']") WebElement deleteVehicleVINLbl;
	@FindBy(xpath="//input[@id='VIN']") WebElement deleteVehicleVINTxt;
	
	@FindBy(xpath="//label[@for='PlateNbr']") WebElement deleteVehiclePlateNbrLbl;
	@FindBy(xpath="//input[@id='PlateNbr']") WebElement deleteVehiclePlateNbrTxt;
	@FindBy(xpath="//input[@id='btnFind']") WebElement deleteVehicleSearchBtn;
	
	@FindBy(xpath="(//div[contains(@class,'box-title')]/h4)[3]") WebElement amendVehicleListOfActiveVehicleSubHdr;
	
	@FindBy(xpath="//th[@aria-label='Select']") WebElement deleteVehicleSelectTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Unit')]") WebElement deleteVehicleUnitTbl;
	@FindBy(xpath="//th[contains(@aria-label,'VIN')]") WebElement deleteVehicleVINTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate No')]") WebElement deleteVehiclePlateNoTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Plate Status')]") WebElement deleteVehiclePlateStatusTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Inactive')]") WebElement deleteVehicleInactiveDateTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Returned')]") WebElement deleteVehiclePlateReturnedDocumentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Affidavit')]") WebElement deleteVehicleAffidavitDocumentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Comment')]") WebElement deleteVehicleCommentTbl;
	@FindBy(xpath="//th[contains(@aria-label,'Waive')]") WebElement deleteVehicleWaiveBasejurisdictionCreditTbl;
	
	
	@FindBy(xpath="//input[contains(@id,'DeletedVehicleVMList') and  contains(@id,'SelectFlag')]")WebElement deleteVehicleCheckboxChk;
	@FindBy(xpath="//select[contains(@id,'DeletedVehicleVMList') and  contains(@id,'PlateStatusFlag')]") WebElement deleteVehicleStatusPlatedd;
	@FindBy(xpath="//input[contains(@name,'DeleteDate')]") WebElement deleteVehicleInactiveDateddPicker;
	@FindBy(xpath="//select[contains(@id,'PlateReturnDocumentFlag')]") WebElement deleteVehiclePlateReturnedDocumenTdd;
	@FindBy(xpath="//select[contains(@id,'AffidavitDoc')]") WebElement deleteVehicleAffidavitDocdd;
	@FindBy(xpath="//textarea[contains(@id,'Comment')]") WebElement deleteVehicleCommentTxt;
	
	@FindBy(xpath="//input[@id='btnVehicleList']") WebElement deleteVehicleVehicleListBtn;
	@FindBy(xpath="//table[@id='DeleteVehicleGrid']/tbody/tr") List<WebElement> deleteVehicleRowInTable;
	@FindBy(xpath="//td[contains(@class,'leftAlign')]") List<WebElement> deleteCellsInaRow;
	
	
	@FindBy(xpath="//a[text()='Next']") WebElement nextLink;
	@FindBy(xpath="//div[@id='DeleteVehicleGrid_info']") WebElement showInGentries;
	@FindBy(xpath="//a[text()='First']") WebElement firstLink;
	@FindBy(xpath="//a[text()='Previous']") WebElement previousLink;
	@FindBy(xpath="//a[text()='Last']") WebElement lastLink;
	
	
	
	
	public void enterUnitNo(String unitNumbeTxtValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxtChange(deleteVehicleUnitNumberTxt,unitNumbeTxtValue);
	}
	public void clickonSearch() {
		new ElementUtil(driver,ConfigReader.log).clickElement(deleteVehicleSearchBtn);
	}
	public void clickFirstLink() {
		new ElementUtil(driver,ConfigReader.log).clickElement(firstLink);
	}
	public void clickPreviousLink() {
		new ElementUtil(driver,ConfigReader.log).clickElement(previousLink);
	}
	public void clickLastLink() {
		new ElementUtil(driver,ConfigReader.log).clickElement(lastLink);
	}
	public void clickspecificpagenumberLink(int number) {
		new ElementUtil(driver,ConfigReader.log).clickElement(driver.findElement(By.xpath("//a[contains(text(),"+number+")]")));
	}
	//Fetch the Row Number based on the Unit Value
	@SuppressWarnings("unused")
	public  int selectRowinaTable(String unitValue) {
		int i;
		int j;
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(deleteVehicleRowInTable);
		for(i=1;i<=deleteVehicleRowInTable.size();i++) {
			List<WebElement>cellvalueineachrow=driver.findElements(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]"));
			//starting the loop from 2 because the Row contains checkbox for which text doesn't contain in locators
			for(j=1;j<=cellvalueineachrow.size();j++) {
				if(driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+i+"]//td[contains(@class,'leftAlign')]["+j+"]")).getText().equalsIgnoreCase(unitValue))
					break;
			}
			break;

		}
		return i;
	}
	public void deleteFewVehicles(String vehiclesCount,String plateStatusValue,String plateReturnedValue, String affidavitDocumentValue, String deleteCommentsValue) throws InterruptedException {
		int j=0;
		String showresultsTo=null;
		for(int i=1;i<=Integer.valueOf(vehiclesCount);i++) {
			 showresultsTo=new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(showInGentries);
			if(i>Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("to ")+3,showresultsTo.indexOf("of ")-1))) {
				new ElementUtil(driver,ConfigReader.log).clickElement(nextLink);
				new ElementUtil(driver,ConfigReader.log).waitUntilElementClickable(deleteVehicleSearchBtn);
				i=i-1;
				}
			else {
				 showresultsTo=new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(showInGentries);
				j=(i+1-(Integer.valueOf(showresultsTo.substring(showresultsTo.indexOf("Showing ")+8,showresultsTo.indexOf("to")).trim())));
			//Click the check box for each untill we reach the count to delete the vehicles
			WebElement checkBoxCheck=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[1]/input[@title='Select']"));
			new ElementUtil(driver,ConfigReader.log).clickElement(checkBoxCheck);
			WebElement PlateStatus=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[5]//select"));
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(PlateStatus,plateStatusValue);
			//Plate Returned Document
		    WebElement PlateReturnedDocument=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[7]//select"));
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(PlateReturnedDocument,plateReturnedValue);
			//Affidavit Document
			WebElement AffidavitDocument=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[8]//select"));
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(AffidavitDocument,affidavitDocumentValue);
			//Delete Comments
			WebElement DeleteComments=driver.findElement(By.xpath("//table[@id='DeleteVehicleGrid']/tbody/tr["+j+"]/td[9]/textarea"));
		    new ElementUtil(driver,ConfigReader.log).webEditTxtChange(DeleteComments, deleteCommentsValue);
			}
		}
	}
	public void ClickCheckBoxFromGrid() {
		new ElementUtil(driver,ConfigReader.log).clickElement(deleteVehicleCheckboxChk);
	}
	
	public void selectPlateStatus(String plateStatusValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(deleteVehicleStatusPlatedd,plateStatusValue);
	}
	public void selectPlateReturnedDocument(String plateReturnedDocumentValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(deleteVehiclePlateReturnedDocumenTdd,plateReturnedDocumentValue);
	}
	public void selectAffidavitDocument(String affidavitDocumentValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(deleteVehicleAffidavitDocdd,affidavitDocumentValue);
	}
	
	public void entercomments(String commentsValue) {
		new ElementUtil(driver,ConfigReader.log).webEditTxt(deleteVehicleCommentTxt, commentsValue);
	}
	
	public void clickVehicleList() {
		new ElementUtil(driver,ConfigReader.log).clickElement(deleteVehicleVehicleListBtn);
	}
	
	public String DeleteValidationMessage() {
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, deleteVerificationMessage);
		return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(deleteVerificationMessage);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
