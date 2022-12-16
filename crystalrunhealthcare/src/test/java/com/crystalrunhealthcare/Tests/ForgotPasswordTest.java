package com.crystalrunhealthcare.Tests;

import org.testng.annotations.Test;

import com.crystalrunhealthcare.Pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseClass {

	@Test(priority = 3)
	public void ForgotPassword() throws InterruptedException {
		ForgotPasswordPage changePass = new ForgotPasswordPage(driver);
		changePass.GetStarted().click();
		changePass.ForgtoPassword().click();
		changePass.ForgtoEmail().sendKeys("");
		changePass.ContinueButton().click();
		System.out.println(changePass.ErrorMessage1().getText());
		System.out.println(changePass.ErrorMessage2().getText());

	}
}
