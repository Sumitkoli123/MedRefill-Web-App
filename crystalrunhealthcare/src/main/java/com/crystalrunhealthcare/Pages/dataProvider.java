package com.crystalrunhealthcare.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class dataProvider {
	
	AppiumDriver<MobileElement> driver;
	
	public ArrayList<String> getData(String SignInTest) throws IOException {
		
ArrayList<String> data = new ArrayList<String>();
		
		Properties prop = new Properties();
		 FileInputStream Fis = new
		 FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\crystalrunhealthcare\\src\\main\\java\\resources\\data.properties");
		 prop.load(Fis);
		 data.add((prop.getProperty("Email")));
		 data.add(prop.getProperty("Password"));
		 return data;
	
	}
}


