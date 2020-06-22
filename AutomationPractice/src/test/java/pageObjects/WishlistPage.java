package pageObjects;

import org.openqa.selenium.By;

import environment.EnvironmentVariables;

public class WishlistPage extends EnvironmentVariables{

	public By wishlistname = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/div[1]/table/tbody/tr/td[1]/a");
	public By deletebtn = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div/ul/li[2]/div/div[2]/div/a");
	public By savewishlist = By.id("submitWishlist");
	public String qtyexpectedafter = "1";
	public String qtyexpectedbefore = "2";
	public By qtypath = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div/div[1]/table/tbody/tr/td[2]");
	public String qtyactual = driver.findElement(qtypath).getText().toString();
	
	
}
			