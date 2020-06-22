package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EnvironmentVariables {

	public static WebDriver driver;
	public static String url="http://automationpractice.com/index.php";
	public static String browser="firefox";
	
	protected static WebDriver setProperty() {
		if (browser.toLowerCase().contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		} else if (browser.toLowerCase().contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
					
	}
		return driver;
	
}
}