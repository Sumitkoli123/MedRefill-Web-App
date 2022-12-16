package com.medevantage.medrefill.testCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.medrefill.base.BaseClass;
import com.medevantage.medrefill.ui.PatientVerification;
import com.medevantage.medrefill.utility.ConfigReader;

@Listeners(com.medevantage.medrefill.utility.ListenerTest.class)
public class PatientVerification_Test extends BaseClass {

	PatientVerification verify;
	ConfigReader setData;

	@Test
	public void patientVerification() throws IOException, InterruptedException {
		verify = new PatientVerification(driver);
		setData = new ConfigReader();

		verify.clickGo();
		verify.firstName(setData.getFirstName());
		verify.lastName(setData.getLastName());
		verify.DOB(setData.getDOB());
		verify.zipCode(setData.getZipCode());
		verify.cellPhoneOnFile(setData.getCellPhoneOnFile());
		verify.nextButton();

		List<WebElement> patientNotFound = driver
				.findElements(By.xpath("//h5[normalize-space()='Patient record not found']"));

		if (patientNotFound.size() < 0 || patientNotFound.size() > 0) {
			System.out.println("Patient record not found");
			Thread.sleep(4000);
			verify.goToPatientForm();

		} else {

			System.out.println("Patient Details found Successfully and OTP has been sent to your contact details");
		}

	}

}
