package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
	WebDriver driver;

	public CompanyPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="company-company_name")
	WebElement company;
	@FindBy(id="company-company_email")
	WebElement email;
	@FindBy(id="company-company_address")
	WebElement address;
	@FindBy(id="company-started_at")
	WebElement start;
	@FindBy(xpath="//span[@class='cbx-icon']")
	WebElement box;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement save;
	@FindBy(xpath="//a[text()='Branch']")
	WebElement branch;
	@FindBy(xpath = "//a[text()='Company']")
	WebElement getCompanyText;
	public String getCompanyPageTitle() {
		String title=driver.getTitle();
		return title;
	}
	public String getCompanyText() {
		String text= getCompanyText.getText();
		return text;
	}
	public void enterCompanyName() {
		company.clear();
		company.sendKeys("My company");
	}
	public void enterCompanyEmail() {
		email.clear();
		email.sendKeys("amal321@gmail.com");
	}
	public void enterCompanyEmailAdrress() {
		address.clear();
		address.sendKeys("amal cottage tvm");
	}
	public void enterStartedDate() {
		start.clear();
		start.sendKeys("23/10/2020");
	}
	public void clickStatus() {
		box.clear();
		box.click();
	}
	public void clickSave() {
		save.click();
	}
	public void clickBranchoption()  {
		branch.click();
	}
}
