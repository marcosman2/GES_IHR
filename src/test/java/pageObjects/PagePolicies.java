package pageObjects;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PagePolicies {
	
	private WebDriver driver;
	private By policyAdministrationLink;
	private By policiesLink;
	private By addPolicyButton;
	private By policyNameField;
	private By colorIcon;
	private By colorSelection;
	private By currencyDrop;
	private By beginDateCalendar;
	private By endDateCalendar;
	private By activeCheck;
	private By covarNumberDrop;
	private By addCovarButton;
	private By paymentDescDrop1;
	private By paymentDescDrop2;
	private By paymentDescDrop3;
	private By paymentDescDrop4;
	private By paymentDescDrop5;
	private By paymentDescDrop6;
	private By paymentDescDrop7;
	private By paymentDescDrop8;
	private By paymentDescDrop9;
	private By paymentDescDrop10;
	private By activeCovarCheck1;
	private By activeCovarCheck2;
	private By activeCovarCheck3;
	private By activeCovarCheck4;
	private By activeCovarCheck5;
	private By activeCovarCheck6;
	private By activeCovarCheck7;
	private By activeCovarCheck8;
	private By activeCovarCheck9;
	private By activeCovarCheck10;
	private By savePolicyButton;
	
	public PagePolicies(WebDriver driver)
	{
		this.driver = driver;
		this.policyAdministrationLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MenuBar_Menu_MasterMenu\"]/ul/li[4]/a");
		this.policiesLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_31\"]/div/span");
		this.addPolicyButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_addImageButton");
		this.policyNameField = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_PolicyNameTextBox\"]");
		this.colorIcon = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_pick\"]/img");
		this.colorSelection = By.xpath("/html/body/center/table/tbody/tr[1]/td[1]/font/a");
		this.currencyDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_Currencycombo_disp");
		this.beginDateCalendar = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_BeginDatePU_BeginDatePU_inp\"]");
		this.endDateCalendar = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_EndDatePU_EndDatePU_inp\"]");
		this.activeCheck = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_Active");
		this.covarNumberDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_iastcRecNum_disp");
		this.addCovarButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_addImageButton");
		this.paymentDescDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl03_DescNameDropDown_disp");
		this.paymentDescDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl04_DescNameDropDown_disp");
		this.paymentDescDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl05_DescNameDropDown_disp");
		this.paymentDescDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl06_DescNameDropDown_disp");
		this.paymentDescDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl07_DescNameDropDown_disp");
		this.paymentDescDrop6 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl08_DescNameDropDown_disp");
		this.paymentDescDrop7 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl09_DescNameDropDown_disp");
		this.paymentDescDrop8 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl10_DescNameDropDown_disp");
		this.paymentDescDrop9 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl11_DescNameDropDown_disp");
		this.paymentDescDrop10 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl12_DescNameDropDown_disp");
		this.activeCovarCheck1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl03_CbActive");
		this.activeCovarCheck2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl04_CbActive");
		this.activeCovarCheck3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl05_CbActive");
		this.activeCovarCheck4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl06_CbActive");
		this.activeCovarCheck5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl07_CbActive");
		this.activeCovarCheck6 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl08_CbActive");
		this.activeCovarCheck7 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl09_CbActive");
		this.activeCovarCheck8 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl10_CbActive");
		this.activeCovarCheck9 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl11_CbActive");
		this.activeCovarCheck10 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_DetailsDataGrid_ctl12_CbActive");
		this.savePolicyButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_SaveImageButton");
	}
	
	//----------------------------------------MÉTODO PARA CREAR UN NUEVO POLICY------------------------------------------------------------------------
	
	public void newPolicy(String policy, String currency, String beginDate, String endDate, String covarNumber, String covar1, String covar2, String covar3, String covar4, String covar5, String covar6, String covar7, String covar8, String covar9, String covar10)
	{
		Helpers helper = new Helpers(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement policyLink = wait.until(ExpectedConditions.presenceOfElementLocated(policyAdministrationLink));
		policyLink.click();
		WebElement policiesMenuLink = wait.until(ExpectedConditions.presenceOfElementLocated(policiesLink));
		((JavascriptExecutor)driver).executeScript("scroll(0,300)");
		policiesMenuLink.click();
		WebElement addPolicy = wait.until(ExpectedConditions.presenceOfElementLocated(addPolicyButton));
		addPolicy.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		WebElement policyName = wait2.until(ExpectedConditions.elementToBeClickable(policyNameField));
		policyName.sendKeys(policy);
		driver.findElement(colorIcon).click();
		Set <String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentWindowID = it.next();
		System.out.println("Parent Window ID: "+ parentWindowID);
		String childWindowID = it.next();
		System.out.println("Child Window ID: "+ childWindowID);
		driver.switchTo().window(childWindowID);
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		WebElement colorWait = wait3.until(ExpectedConditions.presenceOfElementLocated(colorSelection));
		colorWait.click();
		driver.switchTo().window(parentWindowID);
		driver.findElement(currencyDrop).sendKeys(currency);
		helper.waitingTime(2);
		driver.findElement(currencyDrop).sendKeys(Keys.TAB);
		driver.findElement(beginDateCalendar).clear();
		driver.findElement(beginDateCalendar).sendKeys(beginDate);
		driver.findElement(beginDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(endDateCalendar).clear();
		driver.findElement(endDateCalendar).sendKeys(endDate);
		driver.findElement(endDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(activeCheck).click();
		helper.screenshotcapture("Policy Information_");
		driver.findElement(covarNumberDrop).clear();
		driver.findElement(covarNumberDrop).sendKeys(covarNumber);
		helper.waitingTime(2);
		driver.findElement(covarNumberDrop).sendKeys(Keys.TAB);
		driver.findElement(addCovarButton).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 3);
		WebElement covar_1 = wait4.until(ExpectedConditions.presenceOfElementLocated(paymentDescDrop1));
		
		try
		{
			covar_1.sendKeys(covar1);
			helper.waitingTime(1);
			covar_1.sendKeys(Keys.TAB);
			driver.findElement(activeCovarCheck1).click();
			((JavascriptExecutor)driver).executeScript("scroll(0,300)");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			try
			{
				driver.findElement(paymentDescDrop2).sendKeys(covar2);
				helper.waitingTime(1);
				driver.findElement(paymentDescDrop2).sendKeys(Keys.TAB);
				driver.findElement(activeCovarCheck2).click();				
				try
				{
					driver.findElement(paymentDescDrop3).sendKeys(covar3);
					helper.waitingTime(1);
					driver.findElement(paymentDescDrop3).sendKeys(Keys.TAB);
					driver.findElement(activeCovarCheck3).click();
					try
					{
						driver.findElement(paymentDescDrop4).sendKeys(covar4);
						helper.waitingTime(1);
						driver.findElement(paymentDescDrop4).sendKeys(Keys.TAB);
						driver.findElement(activeCovarCheck4).click();
						try
						{
							driver.findElement(paymentDescDrop5).sendKeys(covar5);
							helper.waitingTime(1);
							driver.findElement(paymentDescDrop5).sendKeys(Keys.TAB);
							driver.findElement(activeCovarCheck5).click();
							try
							{
								driver.findElement(paymentDescDrop6).sendKeys(covar6);
								helper.waitingTime(1);
								driver.findElement(paymentDescDrop6).sendKeys(Keys.TAB);
								driver.findElement(activeCovarCheck6).click();
								try
								{
									driver.findElement(paymentDescDrop7).sendKeys(covar7);
									helper.waitingTime(1);
									driver.findElement(paymentDescDrop7).sendKeys(Keys.TAB);
									driver.findElement(activeCovarCheck7).click();
									try
									{
										driver.findElement(paymentDescDrop8).sendKeys(covar8);
										helper.waitingTime(1);
										driver.findElement(paymentDescDrop8).sendKeys(Keys.TAB);
										driver.findElement(activeCovarCheck8).click();
										try
										{
											driver.findElement(paymentDescDrop9).sendKeys(covar9);
											helper.waitingTime(1);
											driver.findElement(paymentDescDrop9).sendKeys(Keys.TAB);
											driver.findElement(activeCovarCheck9).click();
											try
											{
												driver.findElement(paymentDescDrop10).sendKeys(covar10);
												helper.waitingTime(1);
												driver.findElement(paymentDescDrop10).sendKeys(Keys.TAB);
												driver.findElement(activeCovarCheck10).click();
											}catch(NoSuchElementException e){System.out.println("Just 9 Covars.");}												
													
										}catch(NoSuchElementException e){System.out.println("Just 8 Covars.");} 
												
									}catch(NoSuchElementException e){System.out.println("Just 7 Covars.");} 
											
								}catch(NoSuchElementException e){System.out.println("Just 6 Covars.");}
										
							}catch(NoSuchElementException e){System.out.println("Just 5 Covars.");}
									
						}catch(NoSuchElementException e){System.out.println("Just 4 Covars.");}
								
					}catch(NoSuchElementException e){System.out.println("Just 3 Covars.");} 
							
				}catch(NoSuchElementException e){System.out.println("Just 2 Covars.");} 
						
			}catch(NoSuchElementException e){System.out.println("Just 1 Covar.");}
					
		}catch(NoSuchElementException e){}
		
		driver.findElement(savePolicyButton).click();
	}

}