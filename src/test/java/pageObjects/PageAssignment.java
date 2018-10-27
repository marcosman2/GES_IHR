package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PageAssignment {

	private WebDriver driver;
	private By AssigmentlistLink;
	private By addAssignmentButton;
	private By assignmentNameDrop;
	private By assignmentTypeDrop;
	private By assignmentIdentField;
	private By estimatedBeginDateCalendar;
	private By estimatedEndDateCalendar;
	private By actualBeginDateCalendar;
	private By homeOrganizationDrop;
	private By payCycleDrop;
	private By workLocationDrop;
	private By taxStateDrop;
	private By saveAssignmentButton;
	
	public PageAssignment(WebDriver driver)
	{
		this.driver = driver;
		this.AssigmentlistLink = By.xpath("//*[@id=\"FastFindNav_LinksGrid_lnkButton_13\"]/div/span");
		this.addAssignmentButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_addAsgneAsgnmtButton");
		this.assignmentNameDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_asgnmtNameDropDown_disp");
		this.assignmentTypeDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_asgnmtTypeDropDown_disp");
		this.assignmentIdentField = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_asgnmtIdentifierTextBox");
		this.estimatedBeginDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_estBeginDateCalendarPopUp_estBeginDateCalendarPopUp_inp");
		this.estimatedEndDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_estEndDateCalendarPopUp_estEndDateCalendarPopUp_inp");
		this.actualBeginDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_actBeginDateCalendarPopUp_actBeginDateCalendarPopUp_inp");
		this.homeOrganizationDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_homeOrgTextbox_disp");
		this.payCycleDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_payCycleTypeDropdownlist_disp");
		this.workLocationDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_workLocationDropDown_disp");
		this.taxStateDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_taxStateDropDown_disp");
		this.saveAssignmentButton = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_ButtonsContent_saveImageButton");
	}
	
	public void newAssignment(String assignmentName, String assignmentType, String assignmentIdent, String estimatedBegin, String estimatedEnd, String actualBegin, String homeOrg, String payCycle, String workLocation, String taxState)
	{
		driver.findElement(AssigmentlistLink).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement addWait = wait.until(ExpectedConditions.presenceOfElementLocated(addAssignmentButton));
		addWait.click();
		WebElement assignmentWait = wait.until(ExpectedConditions.presenceOfElementLocated(assignmentNameDrop));
		assignmentWait.sendKeys(assignmentName);
		Helpers helper = new Helpers(driver);
		helper.waitingTime(2);
		assignmentWait.sendKeys(Keys.TAB);
		helper.waitingTime(2);
		driver.findElement(assignmentTypeDrop).sendKeys(assignmentType);
		helper.waitingTime(1);
		driver.findElement(assignmentTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(assignmentIdentField).sendKeys(assignmentIdent);
		driver.findElement(estimatedBeginDateCalendar).sendKeys(estimatedBegin);
		helper.waitingTime(1);
		driver.findElement(estimatedBeginDateCalendar).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		driver.findElement(estimatedEndDateCalendar).sendKeys(estimatedEnd);
		helper.waitingTime(1);
		driver.findElement(estimatedEndDateCalendar).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		driver.findElement(actualBeginDateCalendar).sendKeys(actualBegin);
		helper.waitingTime(1);
		driver.findElement(actualBeginDateCalendar).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		driver.findElement(homeOrganizationDrop).sendKeys(homeOrg);
		helper.waitingTime(1);
		driver.findElement(homeOrganizationDrop).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		driver.findElement(payCycleDrop).sendKeys(payCycle);
		helper.waitingTime(1);
		driver.findElement(payCycleDrop).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		driver.findElement(workLocationDrop).sendKeys(workLocation);
		helper.waitingTime(1);
		driver.findElement(workLocationDrop).sendKeys(Keys.TAB);
		driver.findElement(taxStateDrop).sendKeys(taxState);
		helper.waitingTime(1);
		driver.findElement(taxStateDrop).sendKeys(Keys.TAB);
		helper.waitingTime(1);
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		driver.findElement(saveAssignmentButton).click();
		
		
	}
	
}
