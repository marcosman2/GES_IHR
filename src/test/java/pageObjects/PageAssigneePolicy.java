package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PageAssigneePolicy {
	private WebDriver driver;
	private By assigneePolicyLink;
	private By addPolicyButton;
	private By policyNameDrop;
	private By policyFromDateDrop;
	private By policyToDateDrop;
	private By saveAssigneePolicyButton;
	private By policyMessageLabel;
	
	public PageAssigneePolicy(WebDriver driver)
	{
		this.driver = driver;
		this.assigneePolicyLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_29\"]/div/span");
		this.addPolicyButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_AddPolicies");
		this.policyNameDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_PolicyDetailsGrid_ctl02_PolicyNameDropDown_disp");
		this.policyFromDateDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_PolicyDetailsGrid_ctl02_BeginDate_BeginDate_inp");
		this.policyToDateDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_PolicyDetailsGrid_ctl02_EndDate_EndDate_inp");
		this.saveAssigneePolicyButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_SaveImageButton");
		this.policyMessageLabel = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_ValidationSummary\"]/ul/li");
	}
	
	//----------------------------Association of a Policy to an Assignee-Assignment Method-----------------------------------------------
	
	public void newAssigneeAssignmentPolicy(String policyName, String fromDate, String toDate)
	{
		driver.findElement(assigneePolicyLink).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement addPolicyWait = wait.until(ExpectedConditions.presenceOfElementLocated(addPolicyButton));
		addPolicyWait.click();
		WebElement policyNameWait = wait.until(ExpectedConditions.presenceOfElementLocated(policyNameDrop));
		policyNameWait.sendKeys(policyName);
		Helpers helper = new Helpers(driver);
		helper.waitingTime(2);
		policyNameWait.sendKeys(Keys.TAB);
		driver.findElement(policyFromDateDrop).sendKeys(fromDate);
		helper.waitingTime(2);
		driver.findElement(policyFromDateDrop).sendKeys(Keys.TAB);
		helper.waitingTime(2);
		driver.findElement(policyToDateDrop).sendKeys(toDate);
		helper.waitingTime(2);
		driver.findElement(policyToDateDrop).sendKeys(Keys.TAB);
		helper.waitingTime(2);
		driver.findElement(saveAssigneePolicyButton).click();
		WebElement messageDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(policyMessageLabel));
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		String message = messageDisplayed.getText();
		if (message.equals("Save completed successfully."))
		{
			helper.screenshotcapture("Policy Associated_");
		}
		else
		{
			helper.screenshotcapture("ISSUE_Policy Not Associated_");
		}
		
	}

}
