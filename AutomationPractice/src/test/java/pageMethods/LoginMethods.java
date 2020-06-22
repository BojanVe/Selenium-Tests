package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;

public class LoginMethods extends LoginPage{

	WebDriver driver;
	
	public LoginMethods(WebDriver driver) {
		this.driver=driver;
	}
	public void FillEmail() {
		driver.findElement(email).sendKeys(emaildata);
	}
	public void FillPass() {
		driver.findElement(password).sendKeys(passdata);
	}
	public void LoginClick() {
		driver.findElement(signinButton).click();
	}

}
