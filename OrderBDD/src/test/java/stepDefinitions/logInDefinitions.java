package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;

import org.junit.Assert;

public class logInDefinitions {
	WebDriver driver;

	@Given("Browser is started and the page is loaded")
	public void browser_is_started_and_the_page_is_loaded() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");		
	}

	@When("I click on log in link")
	public void i_click_on_log_in_link() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		Thread.sleep(1000);
	}

	@When("I enter valid username")
	public void i_enter_valid_username() {
	    driver.findElement(By.id("email")).sendKeys("bojan.velevski@yahoo.com");
	}

	@When("I enter valid password")
	public void i_enter_valid_password() {
	    driver.findElement(By.id("passwd")).sendKeys("testing123");
	}

	@When("I click on log in button")
	public void i_click_on_log_in_button() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("I am successfully logged in")
	public void i_am_successfully_logged_in() {
	    Assert.assertTrue(driver.getTitle().contains("My account"));
	}


}
