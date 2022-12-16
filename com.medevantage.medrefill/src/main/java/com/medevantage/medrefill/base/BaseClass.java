package com.medevantage.medrefill.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;
	
	@BeforeSuite
	@Parameters("browser")
	public void setupBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("firfox")) {
			driver = new FirefoxDriver();
		} 
		else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Automtion tools\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} 
		else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Automtion tools\\EdgeDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://medrefill.medevantage.com/app/home/patient-verification");

	}
	@AfterSuite
	public void teardown() 
	{
		driver.quit();
    }
}
