package stepDefinitions;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import pageMethods.AccountMethods;
import pageMethods.DetailedItemMethods;
import pageMethods.ItemListMethods;
import pageMethods.WishlistPageMethods;

public class Wishlist_Def extends EnvironmentVariables{
	
	@Given("I am logged in")
	public void i_am_logged_in() throws Throwable {
		Login_Def login = new Login_Def();
		login.i_am_on_home_page();
		login.i_click_on_Sign_In_button();
		login.i_enter_in_email(null);
		login.i_enter_in_password(null);
		login.i_am_successfully_signed();
	}

	@When("I navigate to DRESSES tab")
	public void i_navigate_to_DRESSES_tab() throws InterruptedException {
		Thread.sleep(1000);
		AccountMethods account = new AccountMethods(driver);
		account.DressesTab();
		Thread.sleep(1000);	
	}

	@And("Hover on item")
	public void hover_on_item() throws Throwable {
		ItemListMethods list = new ItemListMethods(driver);
		Thread.sleep(2000);
		list.printedDress();
	}

	@And("I add the item to Wishlist")
	public void i_add_the_item_to_Wishlist() throws Throwable {
		ItemListMethods list = new ItemListMethods(driver);
		Thread.sleep(2000);
		list.addToWishlist();
		
	}

	@Then("The item is successfully added to Wishlist")
	public void the_item_is_successfully_added_to_Wishlist() throws Throwable {
		ItemListMethods list = new ItemListMethods(driver);
		Thread.sleep(1000);
		list.successMessage2();
		Thread.sleep(1000);
		list.closePopup();
	}

	@When("I click on an item")
	public void i_click_on_an_item() throws InterruptedException {
		ItemListMethods list = new ItemListMethods(driver);
		Thread.sleep(1000);
		list.printedDress_2();
	}

	@And("The item detailed page is opened")
	public void the_item_detailed_page_is_opened() {
		DetailedItemMethods detail = new DetailedItemMethods(driver);
		detail.infoAssert();
	}

	@And("I click on Add to Wishlist button")
	public void i_click_on_Add_to_Wishlist_button() {
		DetailedItemMethods detail = new DetailedItemMethods(driver);
		detail.addToWishlist();
	}

	@Then("Another item is successfully added to wishlist")
	public void another_item_is_successfully_added_to_wishlist() throws Exception {
		DetailedItemMethods detail = new DetailedItemMethods(driver);
		Thread.sleep(2000);
		detail.closePopup_2();
	}

	@When("I click on my account button")
	public void i_click_on_my_account_button() throws InterruptedException {
		DetailedItemMethods detail = new DetailedItemMethods(driver);
		Thread.sleep(2000);
		detail.myAccount();
	}

	@And("Navigate to My Wishlists")
	public void navigate_to_My_Wishlists() {
		AccountMethods account = new AccountMethods(driver);
		account.WishlistMenu();
	}

	@And("Click on my wishlist name")
	public void click_on_my_wishlist_name() {
		WishlistPageMethods wishlist = new WishlistPageMethods(driver);
		wishlist.WishlistName();
	}

	@And("Click on delete icon on one of the items")
	public void click_on_delete_icon_on_one_of_the_items() throws Exception {
		WishlistPageMethods wishlist = new WishlistPageMethods(driver);
		wishlist.AssertQtyBefore();
		Thread.sleep(2000);
		wishlist.DeleteItem();
	}

	@Then("That item will be deleted from my wishlist")
	public void that_item_will_be_deleted_from_my_wishlist() {
		WishlistPageMethods wishlist = new WishlistPageMethods(driver);
		wishlist.AssertQtyAfter();
	}


}
