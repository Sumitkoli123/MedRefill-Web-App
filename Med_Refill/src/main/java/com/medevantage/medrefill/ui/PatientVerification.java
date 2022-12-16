package com.medevantage.medrefill.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PatientVerification {

	public WebDriver driver;

	public PatientVerification(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	By clickGo = By.xpath("//button[normalize-space()='Go']");

	By firstName = By.xpath("(//input[@id='floatingInput'])[1]");

	By lastName = By.xpath("(//input[@id='floatingInput'])[2]");

	By DOB = By.xpath("(//input[@placeholder='MM/DD/YYYY'])[1]");

	By zipCode = By.xpath("(//input[@id='floatingInput'])[3]");

	By cellPhoneOnFile = By.xpath("(//input[@id='floatingInput'])[4]");

	By nextButton = By.xpath("//button[normalize-space()='Next']");

	By goToPatientForm = By.xpath("//button[normalize-space()='Go To Patient Form']");

	public void clickGo() {
		driver.findElement(clickGo).click();
	}

	public void firstName(String FirstName) {
		driver.findElement(firstName).sendKeys(FirstName);
	}

	public void lastName(String LastName) {
		driver.findElement(lastName).sendKeys(LastName);
	}

	public void DOB(String birthDate) {
		WebElement enter = driver.findElement(DOB);
		enter.click();
		enter.sendKeys(birthDate);
	}

	public void zipCode(String ZipCode) {
		driver.findElement(zipCode).sendKeys(ZipCode);
	}

	public void cellPhoneOnFile(String CellPhoneOnFile) {
		driver.findElement(cellPhoneOnFile).sendKeys(CellPhoneOnFile);
	}

	public void nextButton() {
		driver.findElement(nextButton).click();
	}

	public void goToPatientForm() {
		driver.findElement(goToPatientForm).click();
	}

}
