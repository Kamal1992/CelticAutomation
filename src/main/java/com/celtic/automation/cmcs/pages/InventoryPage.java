package com.celtic.automation.cmcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class InventoryPage {

	private WebDriver driver;
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#contentMsg > div > ul > li > span") WebElement inventoryValidateMessage;
	
	@FindBy(xpath="//a[@title='Operations']") WebElement dashboardOperation;
	
	@FindBy(xpath="//a[text()='Inventory']") WebElement dashboardInventory;
	
	@FindBy(xpath="//a[text()='Status Inquiry']") WebElement inventoryStatusInventory;
	
	@FindBy(xpath="//select[@class='cancel valid']") WebElement inventoryType;
	
	@FindBy(xpath="//select[@id='SelectedInventoryType']") WebElement inventoryNewInType;
	
	@FindBy(id="SelectedInventorySubType") WebElement inventorySubType;
	
@FindBy(xpath="//*[text()='No data available in table']") WebElement inventoryValidateMsg;
	
@FindBy(xpath="//a[text()='New Inventory']") WebElement inventoryNewInventory;
	
	@FindBy(id="FromNo") WebElement invemtoryFromNo;
	
	@FindBy(id="NoOfIneventoriesToOrder") WebElement inventoryQuantity;
	
	@FindBy(id="ProdExpYYYY") WebElement inventoryYear;
	
	@FindBy(xpath="//div[contains(@class,'alert-info')]") WebElement inventoryAddedMsg;
	
	@FindBy(xpath="//a[@title='Assign Inventory']") WebElement inventoryAssignInventorylnk;
	
public void clickOperation() {
	new ElementUtil(driver,ConfigReader.log).clickElement(dashboardOperation);
}
public void clickAssignInventory() {
	new ElementUtil(driver,ConfigReader.log).waitUntilElementClickable(inventoryAssignInventorylnk);
	new ElementUtil(driver,ConfigReader.log).clickElement(inventoryAssignInventorylnk);
}
public void clickOnInventory() {
	new ElementUtil(driver,ConfigReader.log).clickElement(dashboardInventory);
}
public void clickOnInventoryStatus() {
	new ElementUtil(driver,ConfigReader.log).clickElement(inventoryStatusInventory);
}
public void selectInventoryType(String selectValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByValue(inventoryType, selectValue);
}
public void selectInventorySubType(String selectValue) {
new ElementUtil(driver,ConfigReader.log).selectFromDropdownByValue(inventorySubType, selectValue);
}
public void validateInventoryMsg() {
	new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, inventoryValidateMsg);
}
public void clickNewInventory() {
	new ElementUtil(driver,ConfigReader.log).waitUntilElementClickable(inventoryNewInventory);
	new ElementUtil(driver,ConfigReader.log).clickElement(inventoryNewInventory);
}
public void selectNewInventoryType(String selectValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByValue(inventoryNewInType, selectValue);
}
public void selectNewSubInventoryType(String selectValue) {
	new ElementUtil(driver,ConfigReader.log).selectFromDropdownByValue(inventorySubType, selectValue);
}
public void enterFromNo(String fromnoValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(invemtoryFromNo,fromnoValue);
}
public void enterQuantity(String quantityValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(inventoryQuantity,quantityValue);
}
public void enterYear(String yearValue) {
	new ElementUtil(driver,ConfigReader.log).webEditTxtChange(inventoryYear,yearValue);
}
public void validateAddedMsg(String msgValue) {
new ElementUtil(driver,ConfigReader.log);
ElementUtil.highlightElement(driver, inventoryAddedMsg);
if(inventoryAddedMsg.getText().contains(msgValue))
	assert true;
}

public String validateMessage() {
	 new ElementUtil(driver,ConfigReader.log);
	ElementUtil.highlightElement(driver, inventoryValidateMessage);
	 return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(inventoryValidateMessage);
}


}