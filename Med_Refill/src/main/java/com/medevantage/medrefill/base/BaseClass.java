package com.medevantage.medrefill.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.medevantage.medrefill.utility.ConfigReader;

public class BaseClass {

	public static WebDriver driver;
	ConfigReader setData;

	@BeforeTest
	public void setupBrowser() throws IOException {
		setData = new ConfigReader();
		String browserName = setData.getBrowser();

		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();	
		} 
		
		else if (browserName.equalsIgnoreCase("Chrome")) {System.setProperty("webdriver.chrome.driver", "C:\\Automtion tools\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} 
		
		else if (browserName.equalsIgnoreCase("Edge")) {System.setProperty("webdriver.edge.driver", "C:\\Automtion tools\\EdgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(setData.getUrl());
	}

	public String getScreenshotPath(String methodName, WebDriver driver) throws IOException {

		File screenshotFile = ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.FILE);
		String destpath = System.getProperty("user.dir") + "\\Extent_Reports\\" + methodName + ".png";
		File file = new File(destpath);
		FileUtils.copyFile(screenshotFile, file);
		return destpath;
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
