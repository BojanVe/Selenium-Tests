package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.AddressPage;

public class AddressMethods extends AddressPage{

	WebDriver driver;
	
	public AddressMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void chkbox() throws InterruptedException {
		driver.findElement(checkboxaddress).click();
	}
	public void commentfield() throws InterruptedException{
		driver.findElement(commentfield).sendKeys(comment);
	
	}
	public void proceedbutton() {
		driver.findElement(proceedbuttonA).click();
	}
}
