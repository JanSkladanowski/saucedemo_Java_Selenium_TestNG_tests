package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public abstract class DefaultPage {

    protected WebDriver driver;
    protected Duration timeout = Duration.ofSeconds(4);

    public DefaultPage(WebDriver driver) {this.driver = driver;}

    public void elementsInitialization (Object pageObject) {
        PageFactory.initElements(this.driver,pageObject);
    }

    public void visibilityOfElement(WebElement element){
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());
    }

    public String validatePageTitle(){
        return driver.getTitle();
    }

}
