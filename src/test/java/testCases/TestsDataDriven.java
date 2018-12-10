package testCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.DataDriven;
import helpers.Helpers;
import dataDriven.DataDriven;
import pageObjects.PageAssignee;
import pageObjects.PageAssigneePolicy;
import pageObjects.PageAssignment;
import pageObjects.PageCompImportLegacy;
import pageObjects.PageLogin;
import pageObjects.PageNewCompImport;
import pageObjects.PagePolicies;

public class TestsDataDriven {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://app2.iastax.com/SingleSiteOne/GlobalAdvantageIHR/GAShare/Portal/Userlogin.aspx?ClientId=GLTSTUSER23");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.login("psup", "B8j$#8ft");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"MasterMenu\"]/ul/li[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	//********************************DATA DRIVEN TEST CASES*********************************************
	
	//--------------------------Creación de Assignee-----------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataAssignee()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderAssignee();
		return testData.iterator();
	}
	
	@Test(dataProvider="getDataAssignee")
	public void newAssignee(String effectiveDate, String firstName, String surname, String social, String id, String dob, String homeCntry, String homeSt)
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		DataDriven.dataReaderAssigneeAssignmentPolicy();
		pageAssignee.newAssignee(effectiveDate, firstName, surname, social, id, dob, homeCntry, homeSt);		
	}
	
	//-----------------Creación de Assignee Assignment--------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataAssigneeAssignment()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderAssigneeAssignment();
		return testData.iterator();
	}
		
	@Test(dataProvider="getDataAssigneeAssignment")
	public void newAssigneeAssignment(String effectiveDate, String firstName, String surname, String social, String id, String dob, String homeCntry, String homeSt, String assignment, String type, String identifier, String estimatedBegin, String estimatedEnd, String actualBegin, String homeOrg, String payCycle, String workLoc, String taxSt)
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		DataDriven.dataReaderAssigneeAssignmentPolicy();
		pageAssignee.newAssignee(effectiveDate, firstName, surname, social, id, dob, homeCntry, homeSt);
		PageAssignment pageAssignment = new PageAssignment(driver);
		pageAssignment.newAssignment(assignment, type, identifier, estimatedBegin, estimatedEnd, actualBegin, homeOrg, payCycle, workLoc, taxSt);		
	}
	
	
	//-----------------Creación de Assignee Assignment y Asociación de Policy--------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataAssigneeAssignmentPolicy()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderAssigneeAssignmentPolicy();
		return testData.iterator();
	}
	
	@Test(dataProvider="getDataAssigneeAssignmentPolicy")
	public void newAssigneeAssignmentPolicy(String effectiveDate, String firstName, String surname, String social, String id, String dob, String homeCntry, String homeSt, String assignment, String type, String identifier, String estimatedBegin, String estimatedEnd, String actualBegin, String homeOrg, String payCycle, String workLoc, String taxSt, String policy, String policyFrom, String policyTo)
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		DataDriven.dataReaderAssigneeAssignmentPolicy();
		pageAssignee.newAssignee(effectiveDate, firstName, surname, social, id, dob, homeCntry, homeSt);
		PageAssignment pageAssignment = new PageAssignment(driver);
		pageAssignment.newAssignment(assignment, type, identifier, estimatedBegin, estimatedEnd, actualBegin, homeOrg, payCycle, workLoc, taxSt);
		PageAssigneePolicy pageAssigneePolicy = new PageAssigneePolicy(driver);
		pageAssigneePolicy.newAssigneeAssignmentPolicy(policy, policyFrom, policyTo);		
	}
	
	//-----------------------Creación de Policy-------------------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataPolicy()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderPolicy();
		return testData.iterator();
	}
	
	@Test(dataProvider="getDataPolicy")
	public void newPolicies(String policy, String currency, String beginDate, String endDate, String covarNumber, String covar1, String covar2, String covar3, String covar4, String covar5, String covar6, String covar7, String covar8, String covar9, String covar10)
	{
		PagePolicies pagePolicies = new PagePolicies(driver);
		DataDriven.dataReaderPolicy();
		pagePolicies.newPolicy(policy, currency, beginDate, endDate, covarNumber, covar1, covar2, covar3, covar4, covar5, covar6, covar7, covar8, covar9, covar10);
	}
	
	//------------------------Comp Import Legacy------------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataCompImportLegacy()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderCompImportLegacy();
		return testData.iterator();
	}
	
	@Test(dataProvider="getDataCompImportLegacy")
	public void compImportLegacy(String scenario, String testFile)
	{
		PageCompImportLegacy pageLegacy = new PageCompImportLegacy(driver);
		DataDriven.dataReaderCompImportLegacy();
		pageLegacy.compImportLegacy(scenario, testFile);
	}
	
	//------------------------New Comp Import------------------------------------
	
		@DataProvider
		public Iterator<Object[]> getDataNewCompImport()
		{
			ArrayList<Object[]> testData = DataDriven.dataReaderNewCompImport();
			return testData.iterator();
		}
		
		@Test(dataProvider="getDataNewCompImport")
		public void newCompImport(String scenario, String testFile)
		{
			PageNewCompImport pageLegacy = new PageNewCompImport(driver);
			DataDriven.dataReaderNewCompImport();
			pageLegacy.newCompImport(scenario, testFile);
		}
	
	//------------------------Pasos que se ejecutan siempre al final------------------------------------
	@AfterMethod
	public void tearDown()
	{
		Helpers helper = new Helpers (driver);
		helper.waitingTime(2);
		//helper.screenshotcapture("Finished_");
		driver.quit();
	}

}

