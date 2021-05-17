package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.PageUtil;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Payroll Application']")
	WebElement payrollApplicationText;
	@FindBy(xpath = "//a[text()='Company']")
	WebElement clickCompanyMenu;
	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clickClientMenu;
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement clickWorkerMenu;
	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement clickDeductionMenu;
	@FindBy(xpath = "//a[text()='TimeSheet']")
	WebElement clickTimeSheetMenu;
	@FindBy(xpath = "//a[text()='Approved Timesheets']")
	WebElement clickapprovedtimesheet;
	@FindBy(xpath = "//button[text()='Generate Playslip']")
	WebElement clickGeneratePaySlip;
	@FindBy(xpath = "//a[text()='Payslip']")
	WebElement clickPaySlip;
	@FindBy(xpath = "//a[text()='Invoice']")
	WebElement clickInvoice;
	@FindBy(xpath = "//a[text()='Report']")
	WebElement clickReport;
	@FindBy(xpath="//h1[text()='Payslips']")
	WebElement payslipText;
	@FindBy(xpath = "//a[text()='Company']")
	WebElement getCompanyText;
	@FindBy(xpath="//h1[text()='Worker Id']")
	WebElement getWorkerId;
	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement getDeductionText;
	@FindBy(xpath="//a[text()='Timesheets']")
	WebElement getTimesheetText;
	@FindBy(xpath="//a[text()='Payslips']")
	WebElement getPaySlipText;
	@FindBy(xpath = "//button[text()='Generate Playslip']")
	WebElement getGeneratePaySlip;
	@FindBy(xpath = "//a[text()='Invoice']")
	WebElement getInvoiceText;

	public String getpayrollapplicationtext() {
		String text = payrollApplicationText.getText();
		return text;
	}
	public  String getpaysliptext() {
		String text= payslipText.getText();
		return text;
	}
	public String getCompanyText() {
		String text= getCompanyText.getText();
		return text;
	}
	public  String getWorkerId() {
		String text= getWorkerId.getText();
		return text;
	}
	public String getDeductionText() {
		String text = getDeductionText.getText();
		return text;
	}
	public String getTimesheetText() {
		String text =getTimesheetText.getText();
		return text;
		
	}
	public String getPayslipText() {
		String text =getPaySlipText.getText();
		return text;
	}
	public String getGeneratePaySlipText() {
		String text =getGeneratePaySlip.getText();
		return text;
	}
	public String getInvoiceText() {
		String text =getInvoiceText.getText();
		return text;
	}
		
	public CompanyPage clickOnCompanyMenu() {
		PageUtil.waitforelementtobeclickable(driver, clickCompanyMenu, 8);
		clickCompanyMenu.click();
		return new CompanyPage(driver);
	}

	public ClientPage clickOnClientMenu() {
		PageUtil.waitforelementtobeclickable(driver, clickClientMenu, 8);
		clickClientMenu.click();
		return new ClientPage(driver);
	}

	public WorkerPage ClickOnWorkerMenu() {
		PageUtil.waitforelementtobeclickable(driver, clickWorkerMenu, 8);
		clickWorkerMenu.click();
		return new WorkerPage(driver);
	}

	public DeductionPage ClickOnDeductionMenu() {
		PageUtil.waitforelementtobeclickable(driver, clickDeductionMenu, 8);
		clickDeductionMenu.click();
		return new DeductionPage(driver);

	}

	public void TimeSheetPageClickOnTimeSheetMenu() {
		PageUtil.waitforelementtobeclickable(driver, clickTimeSheetMenu, 5);
		clickTimeSheetMenu.click();
	}

	public void ClickOnApprovedTimeSheet() {
		PageUtil.waitforelementtobeclickable(driver, clickapprovedtimesheet, 5);
		clickapprovedtimesheet.click();
	}

	public void ClickGeneratePaySlip() {
		PageUtil.waitforelementtobeclickable(driver, clickGeneratePaySlip, 5);
		clickGeneratePaySlip.click();
	}

	public void ClickOnPaySlip() {
		PageUtil.waitforelementtobeclickable(driver, clickPaySlip, 8);
		clickPaySlip.click();
	}

	public void ClickOnInvoice() {
		PageUtil.waitforelementtobeclickable(driver, clickInvoice, 8);
		clickInvoice.click();
	}

	public void ClickOnReport() {
		PageUtil.waitforelementtobeclickable(driver, clickReport, 8);
		clickReport.click();
	}
}
