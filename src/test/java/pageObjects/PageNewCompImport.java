package pageObjects;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PageNewCompImport {
	
	private WebDriver driver;
	private By toolsLink;
	private By newInterfaceButton;
	private By categoryDrop;
	private By nameDrop;
	private By saveInterfaceButton;
	private By uploadLink;
	private By chooseFileButton;
	private By uploadFileButton;
	private By worksheetDrop;
	private By saveMappingButton;
	private By validateButton;
	private By importButton;
	private By successfullyMessage;
	private By errorMessageDisplayedLabel;
	private By processingMessageDisplayedLabel;
	
	public PageNewCompImport(WebDriver driver)
	{
		this.driver = driver;
		this.toolsLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MenuBar_Menu_MasterMenu\"]/ul/li[7]/a");
		this.newInterfaceButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_NewInterface");
		this.categoryDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_CategoryWebCombo_disp");
		this.nameDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_InterfaceWebCombo_disp");
		this.saveInterfaceButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_SaveBtn");
		this.uploadLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_22\"]/div/span");
		this.chooseFileButton = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_File1");
		this.uploadFileButton = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_UploadBtn");
		this.worksheetDrop = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_MainContent_WorksheetCombo_disp");
		this.saveMappingButton = By.id("SaveImageButton1");
		this.validateButton = By.id("ctl00_ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_ButtonsContent_ValidateImageButton");
		this.importButton = By.id("createPaymentButton");
		this.successfullyMessage = By.xpath("//*[@id=\"mp_cont_middle\"]/table/tbody/tr[3]/td/table/tbody/tr[2]/td/h4/center");
		this.errorMessageDisplayedLabel = By.xpath("//*[@id=\"ValidationSummary\"]/ul/li");
		processingMessageDisplayedLabel = By.xpath("//*[@id=\"ProcessingText\"]/td");
	}
	
	//-------------------------------------New Comp Import Method-------------------------------------------------------------
	
	public void newCompImport(String scenario, String testFile)
	{
		Helpers helper = new Helpers(driver);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement toolsLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(toolsLink));
		toolsLinkElement.click();
		WebElement newButtonElement = wait.until(ExpectedConditions.elementToBeClickable(newInterfaceButton));
		newButtonElement.click();
		WebElement categoryElement = wait.until(ExpectedConditions.elementToBeClickable(categoryDrop));
		WebElement nameElement = wait.until(ExpectedConditions.elementToBeClickable(nameDrop));
		categoryElement.sendKeys("Comp Assistant");
		helper.waitingTime(1);
		categoryElement.sendKeys(Keys.TAB);
		helper.waitingTime(1);
		nameElement.sendKeys("Compensation Import");
		helper.waitingTime(1);
		nameElement.sendKeys(Keys.TAB);
		driver.findElement(saveInterfaceButton).click();
		WebElement uploadLinkElement = wait.until(ExpectedConditions.presenceOfElementLocated(uploadLink));
		uploadLinkElement.click();
		WebElement chooseFileElement = wait.until(ExpectedConditions.presenceOfElementLocated(chooseFileButton));
		chooseFileElement.sendKeys(testFile);
		helper.screenshotcapture("Uploaded File_");
		driver.findElement(uploadFileButton).click();
		WebElement worksheetElement = wait.until(ExpectedConditions.presenceOfElementLocated(worksheetDrop));
		worksheetElement.sendKeys("Export");
		helper.waitingTime(1);
		worksheetElement.sendKeys(Keys.TAB);
		WebElement saveMappingElement = wait.until(ExpectedConditions.presenceOfElementLocated(saveMappingButton));
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		saveMappingElement.click();
		WebElement validateElement = wait.until(ExpectedConditions.presenceOfElementLocated(validateButton));
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		validateElement.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		try
		{
		Alert groupingAlert = driver.switchTo().alert();
		System.out.println(groupingAlert.getText());
		groupingAlert.accept();
		}
		catch(Exception e)
		{
			System.out.print("No alert displayed");
		}
		WebElement importElement = wait.until(ExpectedConditions.presenceOfElementLocated(importButton));
		importElement.click();
		try
		{
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.findElement(errorMessageDisplayedLabel).isDisplayed();
			helper.screenshotcapture("Validation Failures_" + scenario + "_");	
		}
		catch(Exception e)
		{
			boolean processedElement = wait.until(ExpectedConditions.invisibilityOfElementLocated(processingMessageDisplayedLabel));
			helper.screenshotcapture("Processed_" + scenario + "_");
		}
				
	}	

}
