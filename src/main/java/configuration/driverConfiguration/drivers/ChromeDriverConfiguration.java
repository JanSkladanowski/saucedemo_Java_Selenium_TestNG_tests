package configuration.driverConfiguration.drivers;

import configuration.driverConfiguration.DefaultDriverConfiguration;

import core.configuration.driverConfiguration.DriverConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverConfiguration extends DefaultDriverConfiguration implements DriverConfiguration {

    public WebDriver getDefaultDriver(){
        WebDriverManager.chromedriver().setup();
        driver = configurationDefaultDriver(new ChromeDriver());
        return driver;
    }
}
