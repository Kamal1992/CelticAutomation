package com.celtic.automation.cmcs.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.celtic.automation.cmcs.util.ConfigReader;
import com.celtic.automation.cmcs.util.ElementUtil;

public class Reinstatement {
	private WebDriver driver;
	public Reinstatement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Reporting Period From']") WebElement ReportingPeriodFromlbl;
	@FindBy(xpath="//input[@id='ReportingPeriodFrom']") WebElement ReportingPeriodFrom;
	@FindBy(xpath="//span[text()='Reporting Period To']") WebElement ReportingPeriodTolbl;
	@FindBy(xpath="//input[@id='ReportingPeriodTo']") WebElement ReportingPeriodTo;
	@FindBy(xpath="//span[text()='USDOT No.']") WebElement UsdotNbrlbl;
	@FindBy(xpath="//input[@id='UsdotNbr']") WebElement UsdotNbr;
	@FindBy(xpath="//span[text()='Avg. Per Vehicle Distance Chart']") WebElement EstimatedDistanceChartlbl;
	@FindBy(xpath="//input[@id='EstimatedDistanceChart']") WebElement EstimatedDistanceChart;
	@FindBy(xpath="//span[text()='Override Contiguous Jur.']") WebElement OverrideContJurlbl;
	@FindBy(xpath="//input[@id='OverrideContJur']") WebElement OverrideContJur;
	
	@FindBy(xpath="//span[text()='Actual Distance']") WebElement ActualDistanceGenlbl;
	@FindBy(xpath="//input[@id='ActualDistanceGen']") WebElement ActualDistanceGen;
	@FindBy(xpath="//span[text()='Estimated Distance']") WebElement FirstYearEstimatedMileagelbl;
	@FindBy(xpath="//input[@id='FirstYearEstimatedMileage']") WebElement FirstYearEstimatedMileage;
	@FindBy(xpath="//span[text()='Total Fleet Distance']") WebElement TotalFleetDistanceGenlbl;
	@FindBy(xpath="//input[@id='TotalFleetDistanceGen']") WebElement TotalFleetDistanceGen;
	@FindBy(xpath="//span[text()='Do you have actual distance for the reporting period?']") WebElement FRPMlgQuetionlbl;
	@FindBy(xpath="//input[@id='FRPMlgQuetion']") WebElement FRPMlgQuetion;
	@FindBy(xpath="//span[text()='Distance Type']") WebElement DistanceTypelbl;
	@FindBy(xpath="//input[@id='DistanceType']") WebElement DistanceType;
	@FindBy(xpath="//span[text()='We certify that the actual distance submitted is accurate']") WebElement ActualDistConfirmationlbl;
	@FindBy(xpath="//input[@id='ActualDistConfirmation']") WebElement ActualDistConfirmation;
	//Fetch Details
		public String distanceReportingPeriodFromlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(ReportingPeriodFromlbl);
		}

		public String distanceReportingPeriodFrom() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(ReportingPeriodFrom,"value");
		}
		public String distanceReportingPeriodTolbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(ReportingPeriodTolbl);
		}

		public String distanceReportingPeriodTo() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(ReportingPeriodTo,"value");
		}

		public String distanceUsdotNbrlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(UsdotNbrlbl);
		}

		public String distanceUsdotNbr() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(UsdotNbr,"value");
		}

		public String distanceEstimatedDistanceChartlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(EstimatedDistanceChartlbl);
		}

		public String distanceEstimatedDistanceChart() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(EstimatedDistanceChart,"value");
		}
		public String distanceOverrideContJurlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(OverrideContJurlbl);
		}

		public String distanceOverrideContJur() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(OverrideContJur,"value"); 
			}

		public String distanceActualDistancelbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(ActualDistanceGenlbl);
		}

		public String distanceActualDistance() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(ActualDistanceGen,"value");
		}

		public String distanceEstimatedDistancelbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(FirstYearEstimatedMileagelbl);
		}

		public String distanceEstimatedDistance() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(FirstYearEstimatedMileage,"value");
		}

		public String distanceTotalFleetDistancelbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(TotalFleetDistanceGenlbl);
		}

		public String distanceTotalFleetDistance() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(TotalFleetDistanceGen,"value");
		}

		public String distanceFRPMlgQuetionlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(FRPMlgQuetionlbl);
		}

		public String distanceFRPMlgQuetion() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(FRPMlgQuetion,"value");
			}
		public String distanceDistanceTypelbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(DistanceTypelbl);
		}

		public String distanceDistanceType() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(DistanceType,"value");
		}
		public String distanceActualDistConfirmationlbl() {
			return new ElementUtil(driver,ConfigReader.log).FetchTextBoxValuewithText(ActualDistConfirmationlbl);
		}

		public String distanceActualDistConfirmation() {
			new ElementUtil(driver,ConfigReader.log);
			return ElementUtil.FetchTextBoxValuewithattributedisabled(ActualDistConfirmation,"value");
		}


	
}
