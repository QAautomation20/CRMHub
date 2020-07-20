package page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public static WebDriver driver;
	public static Properties propfile;

	public BasePage() throws IOException {
		try {
			propfile = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\thegh\\Selenium-java\\CRMHub\\src\\main\\java\\page\\datafile.properties");
			propfile.load(file);
		} catch (FileNotFoundException No) {
			No.printStackTrace();
		}
	}
	public static void intialization() {
		String browserName = propfile.getProperty("browser");
		if (browserName.equalsIgnoreCase("chomre")) {
			System.setProperty("webdriver,chrome.driver", "./Driver/chromedriver.exe");
		} else if (browserName.equalsIgnoreCase("FF")) {
			driver = new FirefoxDriver();
		}
		driver.get(propfile.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
