package pageObjects;

import org.openqa.selenium.By;

public class ConfirmBillingPage {

	public By confirmorderbtn = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button");
	public By priceassert = By.xpath("//*[@id=\"amount\"]");
	
}
