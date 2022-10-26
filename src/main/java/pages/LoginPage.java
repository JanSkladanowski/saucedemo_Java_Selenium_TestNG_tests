package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DefaultPage {

	public static final String pageTitle = "Swag Labs";
	@FindBy(id = "user-name")
	WebElement userNameInput;
	@FindBy(id = "password")
	WebElement passwordInput;
	@FindBy(name = "login-button")
	WebElement loginBnt;
	@FindBy(xpath = "//div[@class='bot_column']")
	public WebElement logo;

    public LoginPage(WebDriver driver){
        super(driver);
        elementsInitialization(this);
    }

	public HomePage loginProcedure(String userName, String password){
		userNameInput.sendKeys(userName);
		passwordInput.sendKeys(password);
		loginBnt.click();
		return new HomePage(driver);
	}
}
