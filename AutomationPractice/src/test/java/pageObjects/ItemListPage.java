package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import environment.EnvironmentVariables;

public class ItemListPage extends EnvironmentVariables {

	public By printedsummerdress=By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a");
	public WebElement printeddress = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a"));
	public By printeddress2 = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[2]/h5/a");
	public By addtowishlist = By.partialLinkText("Add to Wishlist");
	public By closebtn = By.xpath("/html/body/div[2]/div/div/a");
	public By messagepath = By.xpath("/html/body/div[2]/div/div/div/div/p");
	public String actualmessage = "Added to your wishlist.";

	
}
