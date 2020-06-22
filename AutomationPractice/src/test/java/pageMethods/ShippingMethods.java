package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.ShippingPage;

public class ShippingMethods extends ShippingPage{

	WebDriver driver;
	
	public ShippingMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void shipping() {
		driver.findElement(checkboxshipping).click();
	}
	public void proceedbutton() {
		driver.findElement(proceedbuttonB).click();

	}
}
