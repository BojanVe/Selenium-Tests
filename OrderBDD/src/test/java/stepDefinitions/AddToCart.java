package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
public class AddToCart {
	
	WebDriver driver;

	@Given("^The user is successfully logged in$")
	public void the_user_is_successfully_logged_in() throws Throwable {
		Thread.sleep(1000);
	    throw new PendingException();
	}

	@When("^User navigates on WOMEN menu$")
	public void user_navigates_on_WOMEN_menu() throws Throwable {
	    driver = new ChromeDriver();
	    driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
	    
	}

	@When("^Clicks on \"([^\"]*)\"$")
	public void clicks_on(String arg1) throws Throwable {
	    driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a")).click();
	}

	@Then("^The detailed item page is opened$")
	public void the_detailed_item_page_is_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User clicks on \\+ to increase the quantity$")
	public void user_clicks_on_to_increase_the_quantity() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User clicks on blue color$")
	public void user_clicks_on_blue_color() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User clicks on Add to cart button$")
	public void user_clicks_on_Add_to_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User clicks on Proceed to checkout$")
	public void user_clicks_on_Proceed_to_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^The item is successfully added to cart$")
	public void the_item_is_successfully_added_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
