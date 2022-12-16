package com.medevantage.medrefill.testCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.medevantage.medrefill.base.BaseClass;
import com.medevantage.medrefill.ui.MessagYourProvider;
import com.medevantage.medrefill.utility.ConfigReader;

@Listeners(com.medevantage.medrefill.utility.ListenerTest.class)
public class MessagYourProvider_Test extends BaseClass {

	MessagYourProvider message;
	ConfigReader setData;

	@Test
	public void messageYourProvider() throws InterruptedException {

		message = new MessagYourProvider(driver);
		message.messageYourProvider();
		Thread.sleep(2000);
		message.searchProvider();
		Thread.sleep(4000);
		message.selectProvider();
		message.textArea();
		message.submitButton1();

		List<WebElement> verifyMessage = driver.findElements(By.xpath("//h5[.='Verify Message Details']"));

		if (verifyMessage.size() < 0 || verifyMessage.size() > 0) {
			System.out.println("Verified Message Details Successfully");
			Thread.sleep(3000);
			message.submitButton2();
			Thread.sleep(3000);
			message.sentSuccessfully();

		} else {
			System.out.println("Verify Message Details Failed");
		}
	}

}
