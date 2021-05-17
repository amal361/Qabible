package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.DashboardPage;
import pages.LoginPage;
import pages.WorkerPage;

public class WorkerTest extends Base {
	LoginPage loginpage;
	@Test(enabled = true)
	public void verifyWorkerPage()  {
		loginpage = new LoginPage(driver);
		loginpage.enterUserName("carol");
		loginpage.enterPassword("1q2w3e4r");
		DashboardPage dashboardpage = loginpage.clickLoginButton();
		WorkerPage workerpage = dashboardpage.ClickOnWorkerMenu();
		workerpage.enterFirstName();
		workerpage.enterLastName();
		workerpage.enterNiNumber();
		workerpage.enterPostCode();
		workerpage.clickSearchButton();
		String actualText = workerpage.getWorkertext();
		String expectedText = "Workers";
		Assert.assertEquals(actualText, expectedText, "invalid text");

	}
}
