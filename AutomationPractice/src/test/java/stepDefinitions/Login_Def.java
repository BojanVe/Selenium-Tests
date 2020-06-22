package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import pageMethods.*;
import org.junit.Assert;

public class Login_Def extends EnvironmentVariables {

	
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		WebDriver driver = setProperty();
		Thread.sleep(1000);
		String actual_title=driver.getTitle();
		String expected_title="My Store";
		Assert.assertEquals(expected_title, actual_title);
		
	}

	@When("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
	    HomePageMethods homePage = new HomePageMethods(driver);
	    homePage.SigninButton();
	}

	@When("^I enter \"([^\"]*)\" in email$")
	public void i_enter_in_email(String arg1) throws Throwable {
		LoginMethods loginPage = new LoginMethods(driver);
	    loginPage.FillEmail();
	    
	}

	@When("^I enter \"([^\"]*)\" in password$")
	public void i_enter_in_password(String arg1) throws Throwable {
		LoginMethods loginPage = new LoginMethods(driver);
		loginPage.FillPass();
	}

	@Then("^I am successfully signed$")
	public void i_am_successfully_signed() throws Throwable {
		LoginMethods loginPage = new LoginMethods(driver);
		Thread.sleep(1000);
		loginPage.LoginClick();
	    Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
	    Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));
	    Thread.sleep(1000);
	}

	@Then("^I click Log Out button$")
	public void i_click_Log_Out_button() throws Throwable {
		AccountMethods accountPage = new AccountMethods(driver);
		accountPage.LogoutButton();
	    Thread.sleep(1000);
	}

	@And("^I am logged out$")
	public void i_am_logged_out() throws Throwable {
	    Assert.assertTrue(driver.getCurrentUrl().contains("authentication&back"));
	    Thread.sleep(1000);
	}

	@And("^The browser can be closed$")
	public void the_browser_can_be_closed() throws Throwable {
	    driver.quit();
	}
}
