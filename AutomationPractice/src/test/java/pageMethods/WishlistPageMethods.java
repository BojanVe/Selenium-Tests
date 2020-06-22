package pageMethods;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import pageObjects.WishlistPage;

public class WishlistPageMethods extends WishlistPage{
	WebDriver driver;
	public WishlistPageMethods (WebDriver driver) {
		this.driver = driver;
	}
	
	public void WishlistName() {
		driver.findElement(wishlistname).click();
	}
	public void AssertQtyBefore() {
		assertEquals(qtyexpectedbefore, qtyactual);
	}
	public void DeleteItem() {
		driver.findElement(deletebtn).click();
		driver.findElement(savewishlist).click();
	}
	public void AssertQtyAfter() {
		assertEquals(qtyexpectedafter,qtyactual);
	}
}
