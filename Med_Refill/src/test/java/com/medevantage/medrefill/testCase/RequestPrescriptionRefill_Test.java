package com.medevantage.medrefill.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.medrefill.base.BaseClass;
import com.medevantage.medrefill.ui.RequestPrescriptionRefill;

@Listeners(com.medevantage.medrefill.utility.ListenerTest.class)
public class RequestPrescriptionRefill_Test extends BaseClass {

	RequestPrescriptionRefill refill;

	@Test
	public void requestPrescriptionRefill() throws InterruptedException {

		refill = new RequestPrescriptionRefill(driver);
		refill.selectPreRefill();
		Thread.sleep(2000);
		refill.clickOnMed();
		refill.selectMed1();
		refill.saveButton();
		refill.selectMed2();
		refill.selectMed3();
		refill.selectMed4();
		refill.requestRefillButton1();

		List<WebElement> refillReq = driver.findElements(By.xpath("//h5[.='Verify Prescription Refill Details']"));

		if (refillReq.size() < 0 || refillReq.size() > 0) {
			System.out.println("Verify Prescription Refill Details Successfully");
			Thread.sleep(3000);
			refill.requestRefillButton2();
			refill.sentSuccessfully();
			Thread.sleep(3000);
			refill.goToHomePage();

		} else {

			System.out.println("Verify Prescription Refill Details Failed");

		}
	}
}
