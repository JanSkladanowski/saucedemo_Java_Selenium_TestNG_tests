package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DefaultPage {

    public static final String HOMEPAGE_URL = "/inventory.html";
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuBtn;

    public HomePage(WebDriver driver){
        super(driver);
        elementsInitialization(this);
    }
}
