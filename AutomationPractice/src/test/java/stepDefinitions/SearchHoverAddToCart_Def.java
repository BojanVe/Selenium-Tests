package stepDefinitions;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import pageMethods.AccountMethods;


public class SearchHoverAddToCart_Def extends EnvironmentVariables{

	@Given("I am successfully logged in")
	public void i_am_successfully_logged_in() throws Throwable {
		
		
		Login_Def login = new Login_Def();
		login.i_am_on_home_page();
		login.i_click_on_Sign_In_button();
		login.i_enter_in_email(null);
		login.i_enter_in_password(null);
		login.i_am_successfully_signed();
		
		
	}
	
	@When("I enter {string} in the search bar")
	public void i_enter_in_the_search_bar(String string) {
		AccountMethods account = new AccountMethods(driver);
		account.SearchBar();
		account.SearchButton();
		
	}

	@And("I Point to {string}")
	public void i_Point_to(String string) throws InterruptedException {
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		WebElement hover = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a"));
		action.moveToElement(hover).perform();
		
		
	}

	@And("I click on Add to Cart button")
	public void i_click_on_Add_to_Cart_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Add to cart")).click();
				

	}

	@Then("The item is successfully added to cart")
	public void the_item_is_successfully_added_to_cart() throws Throwable {
		Thread.sleep(3000);
		String actualmessage = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2")).getText().toString();
		String expectedmessage = "Product successfully added to your shopping cart";
		assertEquals(expectedmessage, actualmessage);
	}



}
