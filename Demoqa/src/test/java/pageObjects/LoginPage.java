package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	 WebElement Username;
	
	@FindBy(id="password")
	 WebElement Password;
	
	
	@FindBy(xpath="//input[@value='admin']")
	 WebElement Admin;
	
	@FindBy(id="terms")
	 WebElement Terms;
	
	@FindBy(id="signInBtn")
	 WebElement signIn;
	
	
	
	public WebElement Username()
	{
		return Username;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement Admin()
	{
		return Admin;
	}
	
	public WebElement Terms()
	{
		return Terms;
	}
	
	
	public WebElement signIn()
	{
		return signIn;
	}

}
