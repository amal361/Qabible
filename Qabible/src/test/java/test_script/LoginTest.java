package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;

import pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginpage;
	@Test(enabled = true)
	public void verifyLoginPageTitle() {
		loginpage = new LoginPage(driver);
		String actualTitle = loginpage.getLoginPageTitle();
		String expectedTitle = "Login";
		Assert.assertEquals(actualTitle, expectedTitle, "Invalid Loginpage title");
	}

	@Test(enabled = false)
	public void verifyLogin() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		loginpage.clickLoginButton();
		String actualTitle = loginpage.getLoginText();
		String expectedTitle = "Login";
		Assert.assertEquals(actualTitle, expectedTitle, "Invalid Loginpage title");
	}
}