package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PageBulkStatusUpdate {
	
	private WebDriver driver;
	private By toolsLink;
	private By bulkStatusUpdateLink;
	private By pageTitle;
	private By lastNameField;
	private By firstNameField;
	private By policyDrop;
	private By policyMultiSelectField;
	private By fromDateCalendar;
	private By toDateCalendar;
	private By changeStatusToDrop;
	private By updateButton;
	private By searchButton;
	private By selectAllCheckBox;
	private By secondPageLink;
	private By confirmationMessage;
	
	public PageBulkStatusUpdate (WebDriver driver)
	{
		this.driver = driver;
		this.toolsLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MenuBar_Menu_MasterMenu\"]/ul/li[7]/a");
		this.bulkStatusUpdateLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_33\"]/div");
		this.pageTitle = By.xpath("//*[@id=\"mp_cont_middle\"]/table/tbody/tr[3]/td/h4/center");
		this.lastNameField = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_SurnameTextBox");
		this.firstNameField = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_FirstnameTextBox");
		this.policyDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_shrduserMultiValue_shrduserMultiValue_txt");
		this.policyMultiSelectField = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_shrduserMultiValue_shrduserMultiValue_filterBox");
		this.fromDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_BeginDate_BeginDate_inp");
		this.toDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_EndDate_EndDate_inp");
		this.changeStatusToDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_ddlPolicyStatuses_disp");
		this.updateButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_ImgBtnUpdate");
		this.searchButton = By.id("SearchButton");
		this.selectAllCheckBox = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_bulkUpdateDataGrid_ctl02_SelectAllCheckBox");
		this.secondPageLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_bulkUpdateDataGrid\"]/tbody/tr[12]/td/a[1]");
		this.confirmationMessage = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BulkUpdateStatus_ValidationSummary");
	}
	
	public void searchRecordsBSU(String lastName, String firstName, String policyName, String fromDate, String toDate, String changeStatus)
	{
		Helpers helper = new Helpers(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement toolsLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(toolsLink));
		toolsLinkElement.click();
		WebElement bulkStatusUpdateLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(bulkStatusUpdateLink));
		bulkStatusUpdateLinkElement.click();
		WebElement titleElement = wait.until(ExpectedConditions.presenceOfElementLocated(pageTitle));
		driver.findElement(lastNameField).sendKeys(lastName);
		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(policyDrop).click();
		driver.findElement(policyMultiSelectField).clear();
		helper.waitingTime(1);
		driver.findElement(policyMultiSelectField).sendKeys(policyName);
		helper.waitingTime(1);
		driver.findElement(policyMultiSelectField).sendKeys(Keys.ENTER);
		driver.findElement(toDateCalendar).click();
		driver.findElement(fromDateCalendar).sendKeys(fromDate);
		helper.waitingTime(1);
		driver.findElement(fromDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(toDateCalendar).sendKeys(toDate);
		helper.waitingTime(1);
		driver.findElement(toDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(searchButton).click();
		helper.waitingTime(2);
		driver.findElement(changeStatusToDrop).sendKeys(changeStatus);
		helper.waitingTime(1);
		driver.findElement(changeStatusToDrop).sendKeys(Keys.TAB);
		helper.screenshotcapture("BSU Parameters_");
		
	}
	
	public void firstPageBSU()
	{
		Helpers helper = new Helpers(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement selectAllElement = wait.until(ExpectedConditions.presenceOfElementLocated(selectAllCheckBox));
		helper.waitingTime(1);
		driver.findElement(selectAllCheckBox).click();
		driver.findElement(updateButton).click();
		WebElement confirmMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
		helper.screenshotcapture("BSU Completed_");
		
	}
	
	public void secondPageBSU()
	{
		Helpers helper = new Helpers(driver);
		((JavascriptExecutor)driver).executeScript("scroll(0,180)");
		driver.findElement(secondPageLink).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement selectAllElement2 = wait.until(ExpectedConditions.presenceOfElementLocated(selectAllCheckBox));
		helper.waitingTime(1);
		driver.findElement(selectAllCheckBox).click();
		driver.findElement(updateButton).click();
		WebElement confirmMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
		helper.screenshotcapture("BSU Completed_");
	}

}
