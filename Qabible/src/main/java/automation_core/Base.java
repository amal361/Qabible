package automation_core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;

	
	public void testInizalise(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\selenium files\\DriverFiles\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"F:\\selenium files\\DriverFiles\\geckodriver-v0.28.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("internetexplorer")) {

			System.setProperty("webdriver.ie.driver",
					"F:\\selenium files\\DriverFiles\\IEDriverServer_x64_3.141.59\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else

		{
			throw new Exception("INVALID BROWSER ");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@BeforeMethod
	public void browserLaunch() throws Exception {
		testInizalise("chrome");
		driver.get("https://www.qabible.in/payrollapp/site/login");
	}

	@AfterMethod
	public void browserClose(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File Screenshot = takeScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Screenshot, new File("./Screenshots/" + result.getName() + ".png"));
		}
		driver.quit();

	}
}
