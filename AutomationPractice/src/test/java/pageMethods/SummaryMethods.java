package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.SummaryPage;

public class SummaryMethods extends SummaryPage {
	
	WebDriver driver;
	
	public SummaryMethods (WebDriver driver) {
		this.driver = driver;
	}
	public void summary() {
		driver.findElement(proceedbutton).click();
	}
	
	
	
	
	
	
	

}
