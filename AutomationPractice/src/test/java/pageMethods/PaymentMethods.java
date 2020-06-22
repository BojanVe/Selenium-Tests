package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.PaymentPage;

public class PaymentMethods extends PaymentPage{

	WebDriver driver;
	public PaymentMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void payment() {
		driver.findElement(payment).click();
	}
	}
