package pageMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import pageObjects.FooterObjects;

public class FooterMethods extends FooterObjects{
	
	WebDriver driver;
	public FooterMethods(WebDriver driver) {
		this.driver = driver;
	}
	public void storeInfoAssert() {
		//Assert store info page
		String actstoreinfo = driver.findElement(storeinfopath).getText();
		assertEquals(expstoreinfo, actstoreinfo);
	}
	public void locationAssert() {
		//Assert store location info
		String actlocation = driver.findElement(locationpath).getText();
		assertEquals(explocation, actlocation);
	}
	public void phoneAssert() {
		//Assert phone number
		String actphone = driver.findElement(phonepath).getText().toString();
		assertEquals(expphone, actphone);
	}
	public void ownershipAssert() {
		//Assert ownership link
		String actownership = driver.findElement(ownershippath).getText();
		assertEquals(expownership, actownership);
	}
	public void womenCategory() {
		//Click on women link in the footer
		driver.findElement(womenfooter).click();
	}
	public void womenAssert() throws Throwable {
		//Assert the newly opened women category page 
		String womencategory = driver.findElement(womencategorypath).getText();
		String womenpageheading = driver.findElement(womenpageheadingpath).getText();
		assertEquals(categoryexpected, womencategory);
		Thread.sleep(1000);
		assertEquals(headingexpected, womenpageheading);
	}
	public void specialsCategory() throws Throwable {
		//Click on specials link in the footer
		Thread.sleep(1000);
		driver.findElement(specialsfooter).click();
	}
	public void specialsAssert() {
		//Assert the newly opened specials page
		assertTrue(driver.getCurrentUrl().contains("prices-drop"));
	}
	public void contactUs() throws Throwable {
		//Click on Contact Us link in the footer
		Thread.sleep(1000);
		driver.findElement(contactusfooter).click();
	}
	public void contactAssert() throws Throwable {
		//Assert the newly opened contact page
		Thread.sleep(2000);
		String contactheading = driver.findElement(contactheadingpath).getText();
		String contactsubheading = driver.findElement(subheadingpath).getText();
	
		assertEquals(contactheading, contactheadingexp);
		assertEquals(contactsubheading, subheadingexp);
		assertTrue(driver.getCurrentUrl().contains("contact"));
		
	}
	public void myOrdersCategory() {
		//Click on My Orders link in the footer
		driver.findElement(myordersfooter).click();
	}
	public void myOrdersAssert() {
		//Assert My Orders page
		assertTrue(driver.getCurrentUrl().contains("history"));
		
		
	}
	public void emailClick() {
		//Click on the email in contacts
		driver.findElement(emailpath).click();
	}
	public void emailAssert() {
		//Assert email address
		String mail = driver.findElement(emailpath).getAttribute("href");
		assertTrue(mail.contains("mailto:"));
		
		String emailfooter = driver.findElement(emailpath).getText();
		assertEquals(emailtext, emailfooter);
	}
	public void signNewsletter() {
		//Fill newsletter field
		driver.findElement(newsletter).sendKeys("bojan.velevski3@yahoo.com");
	}
	public void clickNewsletter() throws Throwable {
		//Click the sign for newsletter button
		Thread.sleep(1000);
		driver.findElement(newsletterbtn).click();
	}
	public void newsletterAssert() {
		//Assert newsletter success message
		String newsactualmsg = driver.findElement(newssuccessmessage).getText();
		assertEquals(newssuccessexpmsg, newsactualmsg);
		
	}
	public void facebookBtn() throws Throwable {
		//Click on Facebook Icon
		Thread.sleep(1000);
		driver.findElement(facebookfooter).click();
	}
	public void fbAssert() {
		//Facebook link assertion
		
		// Check if the link opens in a new tab
		String facebookact = driver.findElement(facebookpath).getAttribute("target");
		assertEquals(targetvalue, facebookact);
		
		// Check if the link is to a Facebook page
		String facebooklink = driver.findElement(facebookpath).getAttribute("href");
		assertTrue(facebooklink.toLowerCase().contains("facebook"));
	}
}
