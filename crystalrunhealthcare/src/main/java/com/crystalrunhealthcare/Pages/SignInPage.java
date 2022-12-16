package com.crystalrunhealthcare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//android.widget.Button[@index='0']")
	WebElement GetStarted;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"signinemail\"]")
	WebElement EnterEmail;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"signinpassword\"]")
	WebElement EnterPass;

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"btn-login\"]")
	WebElement SignIn;
	
	@FindBy(xpath = "//android.widget.Button[@text='Accept']")
	WebElement Accept;
	
	public WebElement GetStarted() {
		return GetStarted;
	}

	public WebElement EnterEmail() {
		return EnterEmail;
	}

	public WebElement EnterPass() {
		return EnterPass;
	}

	public WebElement SignIn() {
		return SignIn;
	}
	
	public WebElement Accept() {
		return Accept;
	}
}