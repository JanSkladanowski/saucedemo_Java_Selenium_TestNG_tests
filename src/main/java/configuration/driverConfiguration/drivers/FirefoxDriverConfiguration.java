package configuration.driverConfiguration.drivers;

import configuration.driverConfiguration.DefaultDriverConfiguration;
import core.configuration.driverConfiguration.DriverConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverConfiguration extends DefaultDriverConfiguration implements DriverConfiguration {

    public WebDriver getDefaultDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = configurationDefaultDriver(new FirefoxDriver());
        return driver;
    }
}
