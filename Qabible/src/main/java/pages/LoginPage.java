package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="loginform-username")
	WebElement loginUsername;
	@FindBy(id="loginform-password")
	WebElement loginPassword;
	@FindBy(name="login-button")
	WebElement loginButton;
	@FindBy(xpath = "//a[text()='Login']")
	WebElement getLoginText;
	
	public String getLoginPageTitle() {
		String title=driver.getTitle();
		return title;
		
}
	public String getLoginText() {
		String text=getLoginText.getText();
		return text;
	}
	public void enterUserName(String uname) {
		loginUsername.sendKeys(uname);
}
	public void enterPassword(String Pwd) {
		loginPassword.sendKeys(Pwd);	
}
	public DashboardPage clickLoginButton() {
		loginButton.click();
		return new DashboardPage(driver);
	}
	
}
