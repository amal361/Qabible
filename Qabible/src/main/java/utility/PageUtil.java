package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import pages.CompanyPage;

public class PageUtil  {
	WebDriver driver;

	public PageUtil(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public static  WebElement waitforelementtobeclickable(WebDriver driver,WebElement elementToBeLoaded, int time) {
	    WebDriverWait wait = new WebDriverWait(driver, time);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));
	    return element;
	
}	
	public static WebElement isElementLoaded(WebDriver driver, WebElement elementToBeLoaded, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
		return element;
	}
}

