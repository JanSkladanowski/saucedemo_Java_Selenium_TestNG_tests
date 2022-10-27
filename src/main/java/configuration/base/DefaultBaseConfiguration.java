package configuration.base;

import core.configuration.baseConfiguration.BaseConfiguration;
import org.apache.logging.log4j.LogManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class DefaultBaseConfiguration extends BaseConfiguration {

public DefaultBaseConfiguration(){

    try {
        FileInputStream fis = new FileInputStream("src\\main\\resources\\properties.properties");
        Properties properties = new Properties();
        properties.load(fis);
        protocol = properties.getProperty("protocol");
        url = properties.getProperty("url");
        userLogin = properties.getProperty("login");
        userPassword = properties.getProperty("password");
        screenshotFileType= properties.getProperty("screenshotFileType");
        screenshotPath= properties.getProperty("screenshotPath");
    }catch (IOException e) {
        LogManager.getLogger(DefaultBaseConfiguration.class).error("Problem with configuration" + e);
    }

}
}
