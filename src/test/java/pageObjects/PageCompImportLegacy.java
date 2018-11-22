package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PageCompImportLegacy {
	
	private WebDriver driver;
	private By toolsLink;
	private By compAssistImportLink;
	private By chooseFileButton;
	private By importButton;
	private By messageDisplayedLabel;
	
	public PageCompImportLegacy(WebDriver driver)
	{
		this.driver = driver;
		this.toolsLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MenuBar_Menu_MasterMenu\"]/ul/li[7]/a");
		this.compAssistImportLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_29\"]/div/span");
		this.chooseFileButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_compImport_CompensationCollectorFile");
		this.importButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_compImport_CompensationImportButton");
		this.messageDisplayedLabel = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_compImport_validationSummaryComensation\"]/ul/li");
	}
	
	public void compImportLegacy(String scenario, String testFile)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement toolsLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(toolsLink));
		toolsLinkElement.click();
		WebElement compImportLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(compAssistImportLink));
		compImportLinkElement.click();
		driver.findElement(chooseFileButton).sendKeys(testFile);
		Helpers helper = new Helpers(driver);
		helper.screenshotcapture(scenario + "_");
		driver.findElement(importButton).click();
		driver.findElement(messageDisplayedLabel).isDisplayed();		
		
	}

}
