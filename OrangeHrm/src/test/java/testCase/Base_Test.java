package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	
	public static  WebDriver driver;
	
	 
	@BeforeClass 
	  public void OrangeHRM()  
	  {  
	      System.setProperty("webdriver.chrome.driver","C:\\Automtion tools\\chromedriver\\chromedriver.exe");
	      
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://demoqa.com/automation-practice-form");
	      driver.manage().window().maximize();
	      
	  }  
	
	@AfterClass
	public void after_test()
	{
	    driver.quit();

	}
	
}
	

