package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	 WebElement Username;
	
	@FindBy(id="txtPassword")
	 WebElement Password;
	
	
	@FindBy(id="btnLogin")
	 WebElement Login;
	
	public WebElement Username()
	{
		return Username;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement Login()
	{
		return Login;
	}

}
