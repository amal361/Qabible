package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.ClientPage;
import pages.DashboardPage;
import pages.LoginPage;

public class ClientTest extends Base {
	LoginPage loginpage;
	DashboardPage dashboardpage;
	ClientPage clientpage;

	@Test(enabled = true)
	public void verifyClientPageTitle()  {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		clientpage = dashboardpage.clickOnClientMenu();
		String actualTitle = clientpage.getClientPageTitle();
		String expectedTitle = "Clients";
		Assert.assertEquals(actualTitle, expectedTitle, "Invalid Title");
	}

	@Test(enabled = false)
	public void verifyClientPage()  {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		clientpage = dashboardpage.clickOnClientMenu();
		clientpage.enterClientname();
		clientpage.enterClientid();
		clientpage.clicksearchbutton();
		String actualTitle = clientpage.getClientPageTitle();
		String expectedTitle = "Clients";
		Assert.assertEquals(actualTitle, expectedTitle, "Invalid Title");
	}
}