package com.celtic.automation.cmcs.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class VehicleDocuments {

	private WebDriver driver;

	public VehicleDocuments(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//a[@title='Vehicle Documents']") WebElement dashboardVehicleDocuments;
	@FindBy(xpath="//th[contains(@class,'Alignment')and not(contains(@class,'disabled')) and not(contains(@class,'hidden'))]") List<WebElement> vehicleTableHeader1;
	@FindBy(xpath="//th[contains(@class,'Alignment sorting_disabled') and contains(@class,'mw')]") List<WebElement> vehicleTableHeader2;
	@FindBy(xpath="//td[not(contains(@class,'hidden'))]//select[contains(@id,'DocStatInd') and not(contains(@disabled,'true'))]") List<WebElement> vehicleDocsdd;
	@FindBy(xpath="//tr[@role='row']//td[contains(@class,'Alignment')and not(contains(@class,'hidden'))]") List<WebElement> vehicleRowValues;
	@FindBy(xpath="//select[@doctype='HVUTForm2290']") List<WebElement> vehicleHVUTFormdd;
	@FindBy(xpath="//select[@doctype='LeaseContract']") List<WebElement> vehicleLeaseContractdd;
	@FindBy(xpath="//select[@doctype='TitleDocument']") List<WebElement> vehicleTitleDocumentdd;
	@FindBy(xpath="//select[@doctype='PlateReturn']") List<WebElement> vehiclePlateReturndd;
	
	public void clickVehicleDocuments() throws InterruptedException {
		new ElementUtil(driver,ConfigReader.log).highlightElement(driver, dashboardVehicleDocuments);
		new ElementUtil(driver,ConfigReader.log).clickElementUsingActions(dashboardVehicleDocuments);
	}	
	public void selectHVUT(String HVUTValue) {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleHVUTFormdd);
		for(int i=0;i<vehicleHVUTFormdd.size();i++) {
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(vehicleHVUTFormdd.get(i), HVUTValue);
		}	
	}
	public void selectLeaseContract(String HVUTValue) {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleLeaseContractdd);
		for(int i=0;i<vehicleLeaseContractdd.size();i++) {
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(vehicleLeaseContractdd.get(i), HVUTValue);
		}	
	}
	public void selectTitleDocument(String HVUTValue) {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleTitleDocumentdd);
		for(int i=0;i<vehicleTitleDocumentdd.size();i++) {
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(vehicleTitleDocumentdd.get(i), HVUTValue);
		}	
	}
	public void selectPlateReturn(String HVUTValue) {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehiclePlateReturndd);
		for(int i=0;i<vehiclePlateReturndd.size();i++) {
			new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(vehiclePlateReturndd.get(i), HVUTValue);
		}	
	}
	
	
	//Fetch Values
	public ArrayList<String> fetchTableHeader1() {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleTableHeader1);
		ArrayList<String> headers1Array = new ArrayList<String>();
		for(int i=0;i<vehicleTableHeader1.size();i++) {
			headers1Array.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleTableHeader1.get(i)));
		}
		return headers1Array;
	}
	public ArrayList<String> fetchTableHeader2() {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleTableHeader2);
		ArrayList<String> headers2Array = new ArrayList<String>();
		for(int i=0;i<vehicleTableHeader2.size();i++) {
			headers2Array.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleTableHeader2.get(i)));
		}
		return headers2Array;
	}
	public ArrayList<String> fetchTableRows() {
		new ElementUtil(driver,ConfigReader.log).waitUntilElementsVisible(vehicleRowValues);
		ArrayList<String> rowArray = new ArrayList<String>();
		for(int i=0;i<vehicleRowValues.size();i++) {
			rowArray.add(new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(vehicleRowValues.get(i)));
		}
		return rowArray;
	}

	/*public void SelectLease(String LeaseValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_Lease, LeaseValue);
	}
	public void Selecttitledocs(String TitleValue) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_titledocs, TitleValue);
	}
	public void Selectplatedocs(String Platedocs) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_Platedocs, Platedocs);
	}
	
	public void SelectHVUT1(String HVUTValue1) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_HVUT1, HVUTValue1);
	}
	public void SelectLease1(String LeaseValue1) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_Lease1, LeaseValue1);
	}
	public void Selecttitledocs1(String TitleValue1) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_titledocs1, TitleValue1);
	}
	public void Selectplatedocs1(String Platedocs1) {
		new ElementUtil(driver,ConfigReader.log).selectFromDropdownByVisibleText(VehicleDocs_Platedocs1, Platedocs1);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
