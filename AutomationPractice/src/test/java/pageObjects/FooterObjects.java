package pageObjects;

import org.openqa.selenium.By;

public class FooterObjects {
	
	public String expstoreinfo = "Store information";
	public String explocation = "Selenium Framework, Research Triangle Park, North Carolina, USA";
	public String expphone = "(347) 466-7432";
	public String expownership = "Ecommerce software by PrestaShop™";
	public By storeinfopath = By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/h4");
	public By locationpath = By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/ul/li[1]/i");
	public By phonepath = By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/ul/li[2]/span");
	public By ownershippath = By.xpath("/html/body/div/div[3]/footer/div/section[4]/div/a");
	public By womenfooter = By.xpath("/html/body/div/div[3]/footer/div/section[2]/div/div/ul/li/a");
	public By specialsfooter = By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[1]/a");
	public By contactusfooter = By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[5]/a");
	public By myordersfooter = By.xpath("/html/body/div/div[3]/footer/div/section[5]/div/ul/li[1]/a");
	public By emailpath = By.xpath("/html/body/div/div[3]/footer/div/section[6]/div/ul/li[3]/span/a");
	public String emailtext = "support@seleniumframework.com";
	public By newsletter = By.id("newsletter-input");
	public By newsletterbtn = By.xpath("/html/body/div/div[3]/footer/div/div[1]/div/form/div/button");
	public By facebookfooter = By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[1]/a");
	public By womencategorypath = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[1]/div/div/span");
	public String categoryexpected = "Women";
	public By womenpageheadingpath = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]");
	public String headingexpected = "WOMEN ";
	public By specialsurl = By.partialLinkText("prices-drop");
	public By contactheadingpath = By.xpath("/html/body/div/div[2]/div/div[3]/div/h1");
	public String contactheadingexp = "CUSTOMER SERVICE - CONTACT US";
	public By subheadingpath = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/fieldset/h3");
	public String subheadingexp = "SEND A MESSAGE";
	public By newssuccessmessage = By.xpath("/html/body/div/div[2]/div/p");
	public String newssuccessexpmsg = "Newsletter : You have successfully subscribed to this newsletter.";
	public By facebookpath = By.xpath("/html/body/div/div[3]/footer/div/section[1]/ul/li[1]/a");
	public String targetvalue = "_blank";
}
