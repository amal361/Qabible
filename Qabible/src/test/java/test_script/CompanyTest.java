package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.CompanyPage;
import pages.DashboardPage;
import pages.LoginPage;

public class CompanyTest extends Base {
	LoginPage loginpage;
	DashboardPage dashboardpage;
	CompanyPage companypage;

	@Test(enabled = true)
	public void verifyCompanyPageTitle() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		companypage = dashboardpage.clickOnCompanyMenu();
		String actualTitle = companypage.getCompanyPageTitle();
		String expectedTitle = "Company";
		Assert.assertEquals(actualTitle, expectedTitle, "invalid Title");
	}

	@Test(enabled = true)
	public void verifyCompanyPage() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		companypage = dashboardpage.clickOnCompanyMenu();
		companypage.enterCompanyName();
		companypage.enterCompanyEmail();
		companypage.enterCompanyEmailAdrress();
		companypage.enterStartedDate();
		companypage.clickStatus();
		companypage.clickSave();
		companypage.clickBranchoption();
		String actualTitle = companypage.getCompanyText();
		String expectedTitle = "Company";
		Assert.assertEquals(actualTitle, expectedTitle, "invalid Title");
	}
}
