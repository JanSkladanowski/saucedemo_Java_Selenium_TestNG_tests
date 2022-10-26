package core.configuration.driverConfiguration;

import configuration.driverConfiguration.drivers.ChromeDriverConfiguration;
import configuration.driverConfiguration.drivers.FirefoxDriverConfiguration;
import org.apache.log4j.LogManager;

public class DriverConfigurationFactory {

    public static DriverConfiguration getDriver(String driverType){
        switch (driverType){
            case "firefox": return new FirefoxDriverConfiguration();
            case "chrome": return new ChromeDriverConfiguration();
            default:
                LogManager.getLogger(DriverConfiguration.class).error("Problem with browser parameter");
                return null;
        }
    }
}
