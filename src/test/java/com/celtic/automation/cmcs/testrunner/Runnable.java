package com.celtic.automation.cmcs.testrunner;

import io.cucumber.core.cli.Main;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Runnable extends AbstractTestNGCucumberTests {

	public static void main(String args[]) throws Throwable{
		try {
		io.cucumber.core.cli.Main.main(
		new String[]{
		"--glue", "com/celtic/automation/cmcs",
		"src/test/resources/parallel",
		"-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"-p","timeline:test-output-thread/",
		"-p","rerun:target/failedrerun.txt",
		"-p","json:target/cucumber-reportreport.json"			
		}
		);
		}
		catch(Exception e) {
		System.out.println("Main method exception");
		}
		}
	}