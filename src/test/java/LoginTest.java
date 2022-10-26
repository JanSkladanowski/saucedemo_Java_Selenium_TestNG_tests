import core.tests.DefaultTestConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends DefaultTestConfiguration {

	@Test(priority = 1)
	public void loginPageTitleValidation(){
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, LoginPage.pageTitle);
		System.out.println();
	}

	@Test(priority = 1)
	public void logoValidation(){
		loginPage.visibilityOfElement(loginPage.logo);
	}

	@Test(priority = 2)
	public void loginValidation(){
		loginPage.loginProcedure(baseConfiguration.getUserLogin(),baseConfiguration.getUserPassword());
		homePage.visibilityOfElement(homePage.menuBtn);
		Assert.assertEquals(driver.getCurrentUrl(), baseConfiguration.getProtocol()
				+ baseConfiguration.getUrl()
				+ HomePage.HOMEPAGE_URL);
	}
}
