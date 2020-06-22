package pageMethods;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;
import pageObjects.HomePage;

public class HomePageMethods extends HomePage{

	WebDriver driver;

	public HomePageMethods(WebDriver driver) {
		this.driver = driver;
	}
	public void SigninButton( ) {
		driver.findElement(signin).click();
	}

}
