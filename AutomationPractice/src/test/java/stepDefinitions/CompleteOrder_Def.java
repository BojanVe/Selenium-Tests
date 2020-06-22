package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageMethods.*;
import pageObjects.PaymentPage;

public class CompleteOrder_Def extends EnvironmentVariables{


	@Given("I am logged in and an item is added to the cart")
	public void i_am_logged_in_and_an_item_is_added_to_the_cart() throws Throwable {
	    Login_Def login = new Login_Def();
	    Addtocart_Def addcart = new Addtocart_Def();
	    
	    login.i_am_on_home_page();
	    login.i_click_on_Sign_In_button();
	    Thread.sleep(1000);
	    login.i_enter_in_email(null);
	    login.i_enter_in_password(null);
	    login.i_am_successfully_signed();
	    addcart.i_click_on_WOMEN_tab();
	    addcart.i_click_on_Printed_Summer_Dress();
	    addcart.i_select_blue_color();
	    addcart.increase_the_quantity_to_pieces(3);
	    addcart.select_size_m();
	    addcart.click_Add_to_cart();
	
	}

	@When("I click on my shopping cart")
	public void i_click_on_my_shopping_cart() throws InterruptedException {
	    Addtocart_Def addcart = new Addtocart_Def();
	    
	    // Assert if correct order is made, and click on shopping cart button
	    addcart.the_items_are_successfully_added_to_the_cart();
	    Thread.sleep(1000);
	    
	}

	@Then("I proceed to checkout")
	public void i_proceed_to_checkout() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Scroll window down
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
		SummaryMethods summaryvar = new SummaryMethods(driver);
		
		//Click proceed to checkout
	    summaryvar.summary();
	}

	@When("I choose my addresses")
	public void i_choose_my_addresses() throws InterruptedException {
	    AddressMethods address = new AddressMethods(driver);
	    
	    //Click on the checkbox to select different address
	    address.chkbox();
	    Thread.sleep(2000);

	}

	@When("Add a comment")
	public void add_a_comment() throws InterruptedException {
	    AddressMethods address = new AddressMethods(driver);
	    
	    //Select the commentfield and enter a comment
	    address.commentfield();
	    Thread.sleep(2000);
	}

	@When("Proceed to shipping step")
	public void proceed_to_shipping_step() throws InterruptedException {
	    AddressMethods address = new AddressMethods(driver);
	    address.proceedbutton();
	    Thread.sleep(2000);
	}

	@When("I agree to the terms of service")
	public void i_agree_to_the_terms_of_service() throws InterruptedException {
		ShippingMethods shipping = new ShippingMethods(driver);
		
		//Check the box to agree the terms of service
		shipping.shipping();
		Thread.sleep(1000);
		shipping.proceedbutton();
	}

	@When("I select payment method")
	public void i_select_payment_method() {
		PaymentMethods paymenttype = new PaymentMethods(driver);
		paymenttype.payment();
		
	}

	@When("I confirm my order")
	public void i_confirm_my_order() {
		BillingMethods billing = new BillingMethods(driver);
		
		//Assertion of the final price
		billing.billingassert();
		billing.confirmorder();
	}

	@Then("My order on My store is complete")
	public void my_order_on_My_store_is_complete() {
		ConfirmationPageMtds confirmation = new ConfirmationPageMtds(driver);
		
		//Assertion for the total amount and completion message
		confirmation.assertprice();
		confirmation.assertmessage();
	}

}
