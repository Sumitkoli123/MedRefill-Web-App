package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class='btn btn-info'])[1]")
	 WebElement AddButton;
	
	@FindBy(name="Checkout ( 1 )")
	 WebElement cart;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	 WebElement Checkout;
	
	@FindBy(id="country")
	 WebElement country;
	
	@FindBy(xpath="//input[@id='checkbox2']")
	 WebElement checkbox;
	
	@FindBy(xpath="//input[@type='submit']")
	 WebElement purchase;
	
	
	
	public WebElement AddButton()
	{
		return AddButton;
	}
	
	public WebElement cart()
	{
		return cart;
	}
	
	public WebElement Checkout()
	{
		return Checkout;
	}
	
	public WebElement country()
	{
		return country;
	}
	
	public WebElement checkbox()
	{
		return checkbox;
	}
	
	public WebElement purchase()
	{
		return purchase;
	}
}

