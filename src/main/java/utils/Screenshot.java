package utils;

import core.configuration.baseConfiguration.BaseConfiguration;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.util.Calendar;

public class Screenshot {

    public void captureScreenshot(WebDriver driver, BaseConfiguration baseConfiguration) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(source, new File(baseConfiguration.getScreenshotPath() +
                    Calendar.getInstance().getTimeInMillis() + "." + baseConfiguration.getScreenshotFileType()));
        } catch (Exception e) {
            LogManager.getLogger(Screenshot.class).error("Screenshot generating error"+ e);
        }
    }
}