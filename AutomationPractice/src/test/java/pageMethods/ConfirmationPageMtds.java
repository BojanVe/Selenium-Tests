package pageMethods;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pageObjects.ConfirmationPage;

public class ConfirmationPageMtds extends ConfirmationPage{
	WebDriver driver;
	
	public ConfirmationPageMtds(WebDriver driver){
		this.driver = driver;
	}
	public void assertprice (){
		String amountexpected = "$88.94";
		Assert.assertEquals(amountexpected,driver.findElement(paymentamount).getText().toString());

	}
	public void assertmessage () {
		String expectedmessage = "Your order on My Store is complete.";
		Assert.assertEquals(expectedmessage, driver.findElement(confirmationmsg).getText());;
		
	}
}
