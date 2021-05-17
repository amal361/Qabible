package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "clientsearch-client_name")
	WebElement clientname;
	@FindBy(id = "clientsearch-id")
	WebElement clientid;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchbutton;
	public String getClientPageTitle() {
		String title=driver.getTitle();
		return title;
	}

	public void enterClientname() {
		clientname.sendKeys("Valley View");
	}

	public void enterClientid() {
		clientid.sendKeys("19");
	}
	public void clicksearchbutton() {
		searchbutton.click();
	}
}