package pageMethods;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pageObjects.ConfirmBillingPage;

public class BillingMethods extends ConfirmBillingPage{

	WebDriver driver;
	public BillingMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void billingassert() {
		String expectedprice = "$88.94";
		Assert.assertEquals(expectedprice, driver.findElement(priceassert).getText().toString());
	}
	public void confirmorder() {
		driver.findElement(confirmorderbtn).click();
	}
		
}
