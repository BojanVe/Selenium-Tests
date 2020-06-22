package pageObjects;

import org.openqa.selenium.By;

public class AddressPage {

	public By checkboxaddress = By.id("addressesAreEquals");
	public By proceedbuttonA = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button");
	public By commentfield = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/div[3]/textarea");
	public String comment = "Expand your shop with Male section";
}
