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
import pageObjects.PageBulkStatusUpdate;
import pageObjects.PageCompImportLegacy;
import pageObjects.PageLogin;
import pageObjects.PageNewCompImport;
import pageObjects.PagePayPolicy;
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
	
	//------------------------Creación Pay Policy Template------------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataPayPolicyTemplate()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderPayPolicyTemplate();
		return testData.iterator();
	}
			
	@Test(dataProvider="getDataPayPolicyTemplate")
	public void newPPT(String payPolicyName, String payPolicyBD, String payPolicyPL, String payPolicyPLS, String payPolicyCharge, String payPolicySocial, String payPolicyHypo, String payPolicyTET, String var1, String var2, String var3, String var4, String var5, String srcType, double amount1, String howStated1, double amount2, String howStated2, double amount3, String howStated3, double amount4, String howStated4, double amount5, String howStated5, String elem1, String elem2, String elem3, String elem4, String elem5, String currency, String curIndicator, String varMapping1, String elemMapping1, String usageMapping1, String varMapping2, String elemMapping2, String usageMapping2, String varMapping3, String elemMapping3, String usageMapping3, String varMapping4, String elemMapping4, String usageMapping4, String varMapping5, String elemMapping5, String usageMapping5)
	{
		PagePayPolicy pagePPT = new PagePayPolicy(driver);
		DataDriven.dataReaderPayPolicyTemplate();
		pagePPT.newPayPolicyTemplate(payPolicyName, payPolicyBD, payPolicyPL, payPolicyPLS, payPolicyCharge, payPolicySocial, payPolicyHypo, payPolicyTET, var1, var2, var3, var4, var5, srcType, amount1, howStated1, amount2, howStated2, amount3, howStated3, amount4, howStated4, amount5, howStated5, elem1, elem2, elem3, elem4, elem5, currency, curIndicator, varMapping1, elemMapping1, usageMapping1, varMapping2, elemMapping2, usageMapping2, varMapping3, elemMapping3, usageMapping3, varMapping4, elemMapping4, usageMapping4, varMapping5, elemMapping5, usageMapping5);
	}
		

	//------------------------Bulk Status Update------------------------------------
	
	@DataProvider
	public Iterator<Object[]> getDataBSU()
	{
		ArrayList<Object[]> testData = DataDriven.dataReaderBulkStatusUpdate();
		return testData.iterator();
	}
	
	@Test(dataProvider="getDataBSU")
	public void bulkStatusUpdate(String lastName, String firstName, String policyName, String fromDate, String toDate, String changeStatus)
	{
		PageBulkStatusUpdate PageBSU = new PageBulkStatusUpdate(driver);
		DataDriven.dataReaderBulkStatusUpdate();
		PageBSU.searchRecordsBSU(lastName, firstName, policyName, fromDate, toDate, changeStatus);
		PageBSU.firstPageBSU();
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

