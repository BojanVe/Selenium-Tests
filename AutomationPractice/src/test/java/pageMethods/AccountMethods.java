package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.AccountPage;
public class AccountMethods extends AccountPage{

	WebDriver driver;
	
	public AccountMethods (WebDriver driver) {
		this.driver = driver;
		
	}
	public void LogoutButton() {
		driver.findElement(signout).click();
		
	}
	public void WomenTab() {
		driver.findElement(womentab).click();
	}
	public void SearchBar() {
		driver.findElement(searchbar).sendKeys(searchdata);
	}
	public void SearchButton() {
		driver.findElement(searchbutton).click();
	}
	public void DressesTab() {
		driver.findElement(dressestab).click();
	}
	public void WishlistMenu() {
		driver.findElement(wishlist).click();
	}
}
