package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	
	public static  WebDriver driver;
	
	 
	@BeforeClass 
	  public void TestBase()  
	  {  
	      System.setProperty("webdriver.chrome.driver","C:\\Automtion tools\\chromedriver\\chromedriver.exe");	      
	      WebDriver driver = new ChromeDriver();	      
	      driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
	      driver.manage().window().maximize();
	      
	  }  
	
	@AfterClass
	public void after_test()
	{
	    driver.quit();

	}
	
}
	

