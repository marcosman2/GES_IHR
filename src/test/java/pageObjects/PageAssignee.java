package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Verify;

import helpers.Helpers;

public class PageAssignee {
	
	private WebDriver driver;
	private By idSearchField;
	private By searchButton;
	private By newButton;
	private By effectiveDateCalendar;
	private By firstNameField;
	private By surnameField;
	private By socialNumberField;
	private By employeeIdField;
	private By birthDateCalendar;
	private By homeCountryDrop;
	private By homeStateDrop;
	private By saveButton;
	private By messageDisplayedLabel;
	
	public PageAssignee(WebDriver driver)
	{
		this.driver = driver;
		this.idSearchField = By.id("TrackingIDTextbox");
		this.searchButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_SearchButton");
		this.newButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_NewButton");
		this.effectiveDateCalendar = By.id("namedate_inp");
		this.firstNameField = By.id("firstNameTextBox");
		this.surnameField = By.id("surnameTextBox");
		this.socialNumberField = By.id("socialInsNoTextBox");
		this.employeeIdField = By.id("empidTextBox");
		this.birthDateCalendar = By.id("birthDate_inp");
		this.homeCountryDrop = By.id("homeCountryDropDown_disp");
		this.homeStateDrop = By.id("homeStateDropdownlist_disp");
		this.saveButton = By.id("btnSave");
		this.messageDisplayedLabel = By.id("validationSummary1");
	}
	
	public void newAssignee(String effectiveDate, String firstName, String surname, String socialNumber, String idNumber, String dob, String homeCountry, String homeState)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement newButtonWait = wait.until(ExpectedConditions.presenceOfElementLocated(newButton));
		newButtonWait.click();
		WebElement effectiveDateWait = wait.until(ExpectedConditions.presenceOfElementLocated(effectiveDateCalendar));
		effectiveDateWait.clear();
		effectiveDateWait.sendKeys(effectiveDate);
		effectiveDateWait.sendKeys(Keys.TAB);
		driver.findElement(firstNameField).sendKeys(firstName);
		driver.findElement(surnameField).sendKeys(surname);
		driver.findElement(socialNumberField).sendKeys(socialNumber);
		driver.findElement(employeeIdField).sendKeys(idNumber);
		driver.findElement(birthDateCalendar).sendKeys(dob);
		driver.findElement(birthDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(homeCountryDrop).sendKeys(homeCountry);
		Helpers helper = new Helpers(driver);
		helper.waitingTime(2);
		driver.findElement(homeCountryDrop).sendKeys(Keys.TAB);
		driver.findElement(homeStateDrop).sendKeys(homeState);
		helper.waitingTime(2);
		driver.findElement(homeStateDrop).sendKeys(Keys.TAB);
		driver.findElement(saveButton).click();
		WebElement messageDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(messageDisplayedLabel));
		String message = messageDisplayed.getText();		
		if (message.equals("Save completed successfully."))
			{
				helper.screenshotcapture("Assignee Created_");
			}
			else
			{
				helper.screenshotcapture("ISSUE_Assinee Not Created_");
			}
		
	}
}
