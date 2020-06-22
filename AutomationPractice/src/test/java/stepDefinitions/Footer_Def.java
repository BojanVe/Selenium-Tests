package stepDefinitions;

import environment.EnvironmentVariables;
import io.cucumber.java.en.*;
import pageMethods.FooterMethods;

public class Footer_Def extends EnvironmentVariables{
	
	@Given("I am on home page and footer is successfully loaded")
	public void i_am_on_home_page_and_footer_is_successfully_loaded() throws Throwable {
		Login_Def login = new Login_Def();
		login.i_am_on_home_page();
	}

	@When("I click on Women")
	public void i_click_on_Women() {
		FooterMethods footer = new FooterMethods(driver);
		footer.womenCategory();
	}

	@Then("Women category is displayed")
	public void women_category_is_displayed() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.womenAssert();
	}

	@When("I click on Specials")
	public void i_click_on_Specials() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.specialsCategory();
	}

	@Then("Products with discounts are loaded")
	public void products_with_discounts_are_loaded() {
		FooterMethods footer = new FooterMethods(driver);
		footer.specialsAssert();
	}

	@When("I click on Contact Us")
	public void i_click_on_Contact_Us() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.contactUs();
	}

	@Then("Contact page is loaded")
	public void contact_page_is_loaded() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.contactAssert();
	}

	@When("I click My Orders")
	public void i_click_My_Orders() {
		FooterMethods footer = new FooterMethods(driver);
		footer.myOrdersCategory();
	}

	@Then("My order history is displayed")
	public void my_order_history_is_displayed() {
		FooterMethods footer = new FooterMethods(driver);
		footer.myOrdersAssert();
	}

	@When("I click on Email link")
	public void i_click_on_Email_link() {
		FooterMethods footer = new FooterMethods(driver);
		footer.emailClick();
	}

	@Then("Email app is opened")
	public void email_app_is_opened() {
		FooterMethods footer = new FooterMethods(driver);
		footer.emailAssert();
	}

	@When("I enter my email to newsletter")
	public void i_enter_my_email_to_newsletter() {
		FooterMethods footer = new FooterMethods(driver);
		footer.signNewsletter();
	}

	@When("I click on proceed button")
	public void i_click_on_proceed_button() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.clickNewsletter();
	}

	@Then("I am successfully signed for newsletter")
	public void i_am_successfully_signed_for_newsletter() {
		FooterMethods footer = new FooterMethods(driver);
		footer.newsletterAssert();
	}

	@When("I click on facebook icon")
	public void i_click_on_facebook_icon() throws Throwable {
		FooterMethods footer = new FooterMethods(driver);
		footer.facebookBtn();
	}

	@Then("A facebook page is loaded")
	public void facebook_page_is_loaded_in_a_new_tab() {
		FooterMethods footer = new FooterMethods(driver);
		footer.fbAssert();
	}
}
