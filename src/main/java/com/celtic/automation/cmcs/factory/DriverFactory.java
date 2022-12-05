package com.celtic.automation.cmcs.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public int m = 5;
	static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	public java.util.logging.Logger log;
	public FileHandler filehandler;
	public StringBuilder exacttime;

	public WebDriver initdriver(String browser) throws Exception {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		}
		configureLoggerSystem();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
		getDriver().manage().window().maximize();
		setLoggerInfo("Driver Opened Successfully");
		return getDriver();

	}

	public WebDriver getDriver() throws Exception {
		if (tlDriver == null) {
			throw new Exception ("Webdriver is not initialized properly");
		} else {
			return tlDriver.get();
		}
	}

	/**
	 * This method is for create a logger system where all execution logs takes place
	 * @return 
	 * @throws Exception
	 */
	public synchronized void configureLoggerSystem() throws Exception {
		try {
			Random random = new Random();
			Thread.sleep(1000*random.nextInt(5));
			exacttime = new StringBuilder(new Timestamp(System.currentTimeMillis()).toString().replaceAll("[.: -]", ""));
			log = Logger.getLogger(exacttime.toString());
			try {
				File file = new File(System.getProperty("user.dir")+"/log/"+exacttime);
				if (!file.exists()) {
					file.mkdir();
				}
				String path = System.getProperty("user.dir")+"/log/"+exacttime+"/"+exacttime+".log";
				filehandler = new FileHandler(path);
				log.addHandler(filehandler);
				SimpleFormatter formatter = new SimpleFormatter();
				filehandler.setFormatter(formatter);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			log.info(
					"*************************************The Execution is started********************************************************");
		} catch (Exception e) {
			throw new FileNotFoundException("Failure Alert: File is not created. Need immediate attention on the same");
		}
	}
	
	public void setLoggerInfo(String msg) {
		log.info(msg);
	}
	
	public void closeTheHandler() {
		filehandler.close();
	}

}
