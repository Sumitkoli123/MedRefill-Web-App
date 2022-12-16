package com.crystalrunhealthcare.Tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import com.crystalrunhealthcare.Pages.SignInPage;
import com.crystalrunhealthcare.Pages.dataProvider;

public class SignInTest extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		dataProvider d = new dataProvider();
		ArrayList data = d.getData("SignInTest");
	} 
	
	@Test()
	public void SignIn(Object Email) throws InterruptedException, IOException {
		
		SignInPage signin = new SignInPage(driver);
		signin.GetStarted().click();
		signin.EnterEmail().sendKeys("amit@yopmal.com");
		signin.EnterPass().sendKeys("Test@1234");
		//signin.SignIn().click();
		//signin.Accept().click();
	}
}

