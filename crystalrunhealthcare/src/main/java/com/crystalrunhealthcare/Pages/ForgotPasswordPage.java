package com.crystalrunhealthcare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	public WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@index='0']")
	WebElement GetStarted;

	@FindBy(xpath = "//android.view.View[4][@index='3']/android.view.View[@text='Forgot password?']")
	WebElement ForgtoPassword;

	@FindBy(xpath = "//android.widget.EditText[@resource-id='forgotemail']")
	WebElement ForgtoEmail;

	@FindBy(xpath = "//android.widget.Button[@resource-id='change_password']")
	WebElement ContinueButton;

	@FindBy(xpath = "//android.view.View[@resource-id='errormessage2']")
	WebElement ErrorMessage1;

	@FindBy(xpath = "//android.view.View [@resource-id='errormessage2']/android.view.View[@index='0']")
	WebElement ErrorMessage2;

	public WebElement GetStarted() {
		return GetStarted;
	}

	public WebElement ForgtoPassword() {
		return ForgtoPassword;
	}

	public WebElement ContinueButton() {
		return ContinueButton;
	}

	public WebElement ForgtoEmail() {
		return ForgtoEmail;
	}

	public WebElement ErrorMessage1() {
		return ErrorMessage1;
	}

	public WebElement ErrorMessage2() {
		return ErrorMessage2;
	}

}
