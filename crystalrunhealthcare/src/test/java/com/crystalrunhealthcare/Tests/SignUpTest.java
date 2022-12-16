package com.crystalrunhealthcare.Tests;

import org.testng.annotations.Test;

import com.crystalrunhealthcare.Pages.SignUpPage;

public class SignUpTest extends BaseClass {

	@Test(priority = 1)
	public void SignUp() throws InterruptedException {
		SignUpPage signup = new SignUpPage(driver);
		signup.GetStarted().click();
		signup.ClickSignUpLink().click();
		signup.FirstName().sendKeys("Rollex");
		signup.LastName().sendKeys("Test");
		signup.Email().sendKeys("rollex1@yopmail.com");
		signup.phoneNumber().sendKeys("9373047804");
		signup.signuppassword().sendKeys("Test@123");
		signup.confirmsignuppassword().sendKeys("Test@123");
		signup.TermsAndConditionCheckbox().click();
		signup.signup().click();
		signup.ErrorMessage().getText();
		
	    
		if (signup.ErrorMessage().getText() != null)
		{
			System.out.println(signup.ErrorMessage().getText());
		}
		else 
		{
			System.out.println("Sign Up Successful");
			signup.Accept().click();
			signup.ok().click();
		}			
	}
}
