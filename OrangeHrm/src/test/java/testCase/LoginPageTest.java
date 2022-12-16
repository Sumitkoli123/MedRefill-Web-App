package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginPageTest  {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automtion tools\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	    driver.manage().window().maximize();
		 
		LoginPage hrm = new LoginPage(driver);
		hrm.Username().sendKeys("Admin");
		hrm.Password().sendKeys("admin123");
		hrm.Login().click();
	}

}
