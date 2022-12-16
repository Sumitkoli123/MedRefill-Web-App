package com.crystalrunhealthcare.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.Button[@index='0']")
	WebElement GetStarted;

	@FindBy(xpath = "//android.view.View[6][@index='5']/android.view.View[2][@index='1']")
	WebElement ClickSignUpLink;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"firstname\"]")
	WebElement FirstName;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"lastname\"]")
	WebElement LastName;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"signupemail\"]")
	WebElement Email;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"phoneNumber\"]")
	WebElement phoneNumber;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"signuppassword\"]")
	WebElement signuppassword;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"confirmsignuppassword\"]")
	WebElement confirmsignuppassword;

	@FindBy(xpath = "//android.widget.CheckBox[@index='0']")
	WebElement TermsAndConditionCheckbox;

	@FindBy(xpath = "//android.widget.Button[@text='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath = "//android.view.View[@resource-id='errormessage1']")
	WebElement ErrorMessage;
	
	@FindBy(xpath = "//android.widget.Button[@index='3']")
	WebElement Accept;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	WebElement ok;
	

	public WebElement GetStarted() {
		return GetStarted;
	}

	public WebElement ClickSignUpLink() {
		return ClickSignUpLink;
	}

	public WebElement FirstName() {
		return FirstName;
	}

	public WebElement LastName() {
		return LastName;
	}

	public WebElement Email() {
		return Email;
	}

	public WebElement phoneNumber() {
		return phoneNumber;
	}

	public WebElement signuppassword() {
		return signuppassword;
	}

	public WebElement confirmsignuppassword() {
		return confirmsignuppassword;
	}

	public WebElement TermsAndConditionCheckbox() {
		return TermsAndConditionCheckbox;
	}

	public WebElement signup() {
		return signup;
	}

	public WebElement ErrorMessage() {
		return ErrorMessage;
	}
	
	public WebElement Accept() {
		return Accept;
	}
	
	public WebElement ok() {
		return ok;
	}
}
