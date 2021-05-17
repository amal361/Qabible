package test_script;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.CompanyPage;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest extends Base {
	LoginPage loginpage;
	DashboardPage dashboardpage;

	@Test(enabled = false)
	public void verifyPayrollApplicationText() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		String actualText = dashboardpage.getpayrollapplicationtext();
		String expectedText = "PAYROLL APPLICATION";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = true)
	public void verifyCompanyMenuClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		CompanyPage companypage = dashboardpage.clickOnCompanyMenu();
		String actualText = dashboardpage.getCompanyText();
		String expectedText = "Company";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = false)
	public void verifyDeuctionMenuClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.ClickOnDeductionMenu();
		String actualText = dashboardpage.getDeductionText();
		String expectedText = "Deduction";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = false)
	public void verifyTimesheetMenuClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.TimeSheetPageClickOnTimeSheetMenu();
		String actualText = dashboardpage.getTimesheetText();
		String expectedText = "Timesheets";
		Assert.assertEquals(actualText, expectedText, "invalid text");


	}

	@Test(enabled = false)
	public void verifyGeneratePaySlipClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.TimeSheetPageClickOnTimeSheetMenu();
		dashboardpage.ClickGeneratePaySlip();
		String actualText = dashboardpage.getGeneratePaySlipText();
		String expectedText = "Generate Playslip";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = false)
	public void verifyPaySlipClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.ClickOnPaySlip();
		String actualText = dashboardpage.getPayslipText();
		String expectedText = "Payslips";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = false)
	public void verifyInvoiceClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.ClickOnInvoice();
		String actualText = dashboardpage.getInvoiceText();
		String expectedText = "Invoice";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}

	@Test(enabled = false)
	public void verifyReportClick() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		dashboardpage.ClickOnReport();
		String actualText = dashboardpage.getWorkerId();
		String expectedText = "Worker Id";
		Assert.assertEquals(actualText, expectedText, "invalid text");
	}

	@Test(enabled = false)
	public void verifypaysliptext() {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		dashboardpage = loginpage.clickLoginButton();
		String actualText = dashboardpage.getpaysliptext();
		String expectedText = "Payslips";
		Assert.assertEquals(actualText, expectedText, "invalid text");
	}
}