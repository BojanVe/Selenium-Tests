package pageMethods;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
import pageObjects.DetailedItemPage;
public class DetailedItemMethods extends DetailedItemPage {

	WebDriver driver;
	Actions action;
	public DetailedItemMethods (WebDriver driver) {
		this.driver=driver;
	}
	public void itemColor() {
		driver.findElement(color);
	}
	public void itemQty() throws InterruptedException {
		for (int i=0; i<2; i++) {
			driver.findElement(quantityinc).click();
			Thread.sleep(1000);
		}
	}
	public void itemSize() {
		driver.findElement(sizedropdown).findElement(size).click();
	
	}
	public void addToCartBtn() {
		driver.findElement(addtocartbtn).click();
	}
	public void continueShopping( ) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(continueshopping).click();
		js.executeScript("window.scrollBy(0,-1300)");
		
		
	}	
	public void AddtocartHover() {
		
		WebElement itemhover = driver.findElement(hoveritem);
		action.moveToElement(itemhover).perform();
	}
	public void ContinueShoppingHover() {
		driver.findElement(continueshophover).click();
	}
	public void addToWishlist() {
		driver.findElement(addtowishlistdetail).click();
	}
	public void closePopup_2() {
		driver.findElement(closebtndetail).click();
	}
	public void myAccount() {
		driver.findElement(myaccount).click();
	}
	public void infoAssert() {
		String expectedinfo = driver.findElement(expectedpath).getText();
		assertEquals(expectedinfo,acutalinfo);
	}
	public void successMessage3() {
		String expectedmessage3 = driver.findElement(succmsg3path).getText();
		assertEquals(expectedmessage3,successmessage3);
	}
}