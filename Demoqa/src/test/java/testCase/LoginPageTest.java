package testCase;


import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginPageTest extends Base_Test  {
	
	
	@Test
	public void login()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Automtion tools\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
	    //driver.manage().window().maximize();
		 
		LoginPage rs = new LoginPage(Base_Test.driver);
		rs.Username().sendKeys("rahulshettyacademy");
		rs.Password().sendKeys("learning");
		rs.Admin().click();
		rs.Terms().click();
		rs.signIn().click();
	}
}
