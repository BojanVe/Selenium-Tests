package pageMethods;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import environment.EnvironmentVariables;
import junit.framework.Assert;
import pageObjects.ItemListPage;

public class ItemListMethods extends ItemListPage{

	public ItemListMethods(WebDriver driver) {
		EnvironmentVariables.driver=driver;		
	}
	public void printedSummerDress() {
		driver.findElement(printedsummerdress).click();
	}
	public void printedDress() throws Throwable {
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		action.moveToElement(printeddress).perform();
	}	
	public void addToWishlist() throws Exception {
		driver.findElement(addtowishlist).click();
	}
	public void closePopup() {
		driver.findElement(closebtn).click();
	
	}
	public void printedDress_2() {
		driver.findElement(printeddress2).click();
	}
	public void successMessage2() throws InterruptedException {
		String successmessage = driver.findElement(messagepath).getText();
		assertEquals(successmessage, actualmessage);
		
		

		
	}
}
