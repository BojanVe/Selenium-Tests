package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DetailedItemPage {

	public By quantityinc=By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/p[1]/a[2]");
	public By color=By.id("color_13");
	public By sizedropdown = By.id("group_1");
	public By size=By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[2]/div/fieldset[1]/div/div/select/option[2]");
	public By addtocartbtn=By.name("Submit");
	public By continueshopping=By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span");
	public By hoveritem = By.partialLinkText("Faded Short Sleeve T-shirts");
	public By addtocarthover = By.partialLinkText("Add to cart");
	public By continueshophover = By.partialLinkText("Continue shopping");
	public By addtowishlistdetail = By.id("wishlist_button");
	public By closebtndetail = By.xpath("/html/body/div[2]/div/div/a");
	public By myaccount = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
	public By expectedpath = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/div[1]/div/p");
	public String acutalinfo = "Printed evening dress with straight sleeves with black thin waist belt and ruffled linings.";
	public String successmessage3 = "Added to your wishlist.";
	public By succmsg3path = By.xpath("/html/body/div[2]/div/div/div/div/p");
	
	
	
}
