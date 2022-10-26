package core.tests;

import core.configuration.baseConfiguration.BaseConfiguration;
import core.configuration.baseConfiguration.BaseConfigurationFactory;
import core.configuration.driverConfiguration.DriverConfiguration;
import core.configuration.driverConfiguration.DriverConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.HomePage;
import pages.LoginPage;

public abstract class DefaultTestConfiguration {

    protected BaseConfiguration baseConfiguration;
    protected DriverConfiguration driverConfiguration;
    protected static WebDriver driver;
    protected String url;
    protected LoginPage loginPage;
    protected HomePage homePage;

    @BeforeClass
    public void setUpClass(){
        this.url = baseConfiguration.getProtocol() + baseConfiguration.getUrl();
        this.loginPage = new LoginPage(driver);
        this.homePage = new HomePage(driver);
    }

    @Parameters({"browser"})
    @BeforeTest
    public void setUpTest(String browser) {
        baseConfiguration = BaseConfigurationFactory.getConfiguration();
        driverConfiguration = DriverConfigurationFactory.getDriver(browser);

        assert driverConfiguration != null;
        driver = driverConfiguration.getDefaultDriver();
        driver.get(baseConfiguration.getProtocol() + baseConfiguration.getUrl());
    }

    @BeforeMethod
    public void setUpMethod () {
        driver.navigate().refresh();
    }

    @AfterTest
    public void tearDownTest(){driver.quit();}

    @AfterMethod
    public void tearDownMethod() {
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
    }
}
