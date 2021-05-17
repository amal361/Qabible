package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkerPage {
	WebDriver driver;

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "workersearch-first_name")
	WebElement firstname;
	@FindBy(id = "workersearch-last_name")
	WebElement lastname;
	@FindBy(id = "workersearch-postcode")
	WebElement postcode;
	@FindBy(id = "workersearch-ni_number")
	WebElement ninumber;
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchbutton;
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement getWorkersText;

	public void enterFirstName() {
		firstname.sendKeys("Ramona");
	}

	public void enterLastName() {
		lastname.sendKeys("Panait");
	}

	public void enterPostCode() {
		postcode.sendKeys("BN23 5RL");
	}

	public void enterNiNumber() {
		ninumber.sendKeys("SZ593292A");
	}

	public void clickSearchButton() {
		searchbutton.click();
	}

	public String getWorkertext() {
		String text = getWorkersText.getText();
		return text;
	}
}