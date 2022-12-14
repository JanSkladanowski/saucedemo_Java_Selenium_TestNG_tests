package configuration.driverConfiguration;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public abstract class DefaultDriverConfiguration {

    protected static WebDriver driver;

    public static WebDriver configurationDefaultDriver(WebDriver driver) {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver;
    }
}
