package testCase;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest extends Base_Test {
	
	
	@Test
	public void purchasemobile()
	{
		HomePage mb = new HomePage(driver);
		mb.AddButton().click();
		mb.cart().click();
		mb.Checkout().click();
		mb.country().sendKeys("pune");
		mb.checkbox().click();
		mb.purchase().click();
		
	}

}
