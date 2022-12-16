package com.crystalrunhealthcare.Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public AppiumDriver<MobileElement> setup() throws IOException {
		 
		ArrayList<String> data = new ArrayList<String>();
		
		Properties prop = new Properties();
		 FileInputStream Fis = new
		 FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\crystalrunhealthcare\\src\\main\\java\\resources\\data.properties");
		 prop.load(Fis);
		 data.add((prop.getProperty("Email")));
		 data.add(prop.getProperty("Password"));
		 

		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "APPIUM");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "4ec3aa6f");
			caps.setCapability("appPackage", "com.pc360.medevantage");
			caps.setCapability("appActivity", "com.pc360.medevantage.MainActivity");

			URL url = new URL("http://localhost:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, caps);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			return driver;
		}

		catch (Exception e) {
			System.out.println("" + e.getCause());
		}
		return driver;
	}

	/*@AfterTest
	public void teardown() {
		driver.quit();*/
	}

