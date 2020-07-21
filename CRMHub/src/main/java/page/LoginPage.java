package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Elements in Log in Page
	@FindBy(how = How.XPATH, using = "//a[@class='cta--secondary cta--small']")
	WebElement LogInLink;
	@FindBy(how = How.ID, using = "username")
	WebElement UserName;
	@FindBy(how = How.ID, using = "password")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@class='uiButton private-button private-button__link private-button--default']")
	WebElement ShowPasswordButton;
	@FindBy(how = How.XPATH, using = "//button[@class='uiButton private-button private-button__link private-button--default']")
	WebElement ForgotPasswordButton;
	
	
}
