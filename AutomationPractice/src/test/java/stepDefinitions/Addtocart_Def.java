package stepDefinitions;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageMethods.AccountMethods;
import pageMethods.DetailedItemMethods;
import pageMethods.ItemListMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Addtocart_Def extends EnvironmentVariables{
	
	@Given("I am successfully logged in and I am on my account page")
	public void i_am_successfully_logged_in_and_I_am_on_my_account_page() throws Throwable {
		Login_Def login = new Login_Def();
		login.i_am_on_home_page();
		login.i_click_on_Sign_In_button();
		login.i_enter_in_email(null);
		login.i_enter_in_password(null);
		login.i_am_successfully_signed();
		Thread.sleep(2000);
	}

	@When("^I click on WOMEN tab$")
	public void i_click_on_WOMEN_tab() {
		AccountMethods accPageMtds = new AccountMethods(driver);
		accPageMtds.WomenTab();
	}

	@And("I click on Printed Summer Dress")
	public void i_click_on_Printed_Summer_Dress() {
	    ItemListMethods listPage = new ItemListMethods(driver);
	    listPage.printedSummerDress();
	}

	@Then("The detailed item page is opened")
	public void the_detailed_item_page_is_opened() {
	    Assert.assertTrue(driver.getTitle().contains("Printed Summer Dress - My Store"));
	}

	@When("I select blue color")
	public void i_select_blue_color() {
	    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	    detailPage.itemColor();
	}

	@And("Increase the quantity to {int} pieces")
	public void increase_the_quantity_to_pieces(Integer int1) throws InterruptedException {
	    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	    detailPage.itemQty();
	}
	@And("Select size M")
	public void select_size_m( ) {
	    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	    detailPage.itemSize();
	}
	
	@And("Click Add to cart")
	public void click_Add_to_cart() throws InterruptedException {
	    DetailedItemMethods detailPage = new DetailedItemMethods(driver);
	    detailPage.addToCartBtn();
	    Thread.sleep(2000);
	    detailPage.continueShopping();
	}

	@Then("The items are successfully added to the cart")
	public void the_items_are_successfully_added_to_the_cart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		//Scroll window up
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
		
		//Click on shopping cart
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[3]")).click();
		
		//Scroll window down
		js.executeScript("window.scrollBy(0,500)");
		
		
		//Assertion to check if 3 items are added to the cart
		String actualqty = driver.findElement(By.xpath("//*[@id=\"summary_products_quantity\"]")).getText();
		String expectedqty = "3 Products";
		Assert.assertEquals(actualqty, expectedqty);
		
		//Assertion to test if correct color and size are chosen
		String actualsizecolor = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/small[2]/a")).getText();
		String expectedsizecolor = "Color : Yellow, Size : M";
		Assert.assertEquals(expectedsizecolor, actualsizecolor);
		
		//Assertion to test if the right product is added
		String actualproduct= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[2]/p/a")).getText();
		String expectedproduct = "Printed Summer Dress";
		Assert.assertEquals(expectedproduct, actualproduct);
		
		}
	}
	

