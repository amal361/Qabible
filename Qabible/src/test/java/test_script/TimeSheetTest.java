package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation_core.Base;
import pages.DashboardPage;
import pages.LoginPage;



public class TimeSheetTest extends Base {
	LoginPage loginpage;
	DashboardPage dashboardpage;

	

@Test(enabled=true)
public void verifyClickOnApprovedTimeSheet() {
	loginpage =new LoginPage(driver);
	loginpage.enterUserName("carol");
	loginpage.enterPassword("1q2w3e4r");
	dashboardpage=loginpage.clickLoginButton();
	dashboardpage.TimeSheetPageClickOnTimeSheetMenu();
	dashboardpage.ClickOnApprovedTimeSheet();
	String actualText = dashboardpage.getTimesheetText();
	String expectedText = "Timesheets";
	Assert.assertEquals(actualText, expectedText, "invalid text");

}
}