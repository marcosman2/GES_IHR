package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pageObjects.PageAssignee;
import pageObjects.PageAssigneePolicy;
import pageObjects.PageAssignment;
import pageObjects.PageBulkStatusUpdate;
import pageObjects.PageCompImportLegacy;
import pageObjects.PageLogin;
import pageObjects.PageNewCompImport;
import pageObjects.PagePayPolicy;
import pageObjects.PagePolicies;


public class TestCases {

	private WebDriver driver;
	//----------------------Initial Steps----------------------------
	
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
	
	//-------------------------------TEST CASES-----------------------------------------------------
	
	
	//------------------------------New Assignee--------------------------------------------------------
	@Test
	public void newAssignee()
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		pageAssignee.newAssignee("1/1/2018", "Alejandra", "Paz", "577845453011", "1152191801021", "10/22/2000", "Argentina", "Buenos Aires");
	}
	
	
	//------------------------------New Assignee-Assignment--------------------------------------------------------
	@Test
	public void newAssigneeAssignment()
	{
			PageAssignee pageAssignee = new PageAssignee(driver);
			pageAssignee.newAssignee("1/1/2018", "Sandra", "Preston", "577845853011", "1152791801021", "10/22/2000", "Argentina", "Buenos Aires");
			PageAssignment pageAssignment = new PageAssignment(driver);
			pageAssignment.newAssignment("Australia", "Business Trip", "2924731", "1/1/2018", "12/31/2018", "1/1/2018", "Org ONe|XYZ|", "Monthly", "AUSTRALIA", "Australia Capital Territory");
	}
	
	//------------------------------Assignee-Assignment Policy--------------------------------------------------------
	@Test
	public void newAssigneeAssignmentPolicy()
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		pageAssignee.newAssignee("1/1/2018", "Julio", "Manrique", "21102759", "221120489", "10/22/2000", "Argentina", "Buenos Aires");
		PageAssignment pageAssignment = new PageAssignment(driver);
		pageAssignment.newAssignment("Australia", "Business Trip", "1924785", "1/1/2018", "12/31/2018", "1/1/2018", "XYZ|", "Monthly", "AUSTRALIA", "Australia Capital Territory");
		PageAssigneePolicy pageAssigneePolicy = new PageAssigneePolicy(driver);
		pageAssigneePolicy.newAssigneeAssignmentPolicy("Big Policy", "1/1/2018", "12/31/2018");
	}
	
	
	//------------------------------New Policy--------------------------------------------------------
	@Test
	public void newPolicy()
	{
		PagePolicies pagePolicies = new PagePolicies(driver);
		pagePolicies.newPolicy("CO Inbound", "United States Dollar", "1/1/2018", "12/31/2018", "10", "Net Pay", "zzzAlimony Received", "zzzAnnual Paid Premium", "zzzAnnuities", "zzzAuto Loan Advance", "zzzAutomobile Expense", "zzzBase Salary", "zzzBonus - Current Year", "zzzEducation Trip", "zzzEntertainment Allowance");
	}
	
	//------------------------------Comp Import Legacy--------------------------------------------------------
	@Test
	public void importLegacy()
	{
		PageCompImportLegacy pageLegacy = new PageCompImportLegacy(driver);
		pageLegacy.compImportLegacy("Successfully", "C:/Users/mamanrique/Desktop/Test.xlsx");
	}
	
	//------------------------------New Comp Import--------------------------------------------------------
	@Test
	public void newCompImport()
	{
		PageNewCompImport pageNewCompImport = new PageNewCompImport(driver);
		pageNewCompImport.newCompImport("Successfully", "C:/Users/mamanrique/Desktop/NewCompImportAutomated_Grouping.xlsx");
	}
	
	//------------------------------New Pay Policy Template--------------------------------------------------------
	@Test
	public void newPayPolicyTemplate()
	{
		PagePayPolicy pagePP = new PagePayPolicy(driver);
		pagePP.newPayPolicyTemplate("Automate97", "5/18/2018", "United States", "FPE PLS", "Home", "Both", "HOME", "New From Issue", "NETPY", "EXTPY", "AUTLS", "DEPTR", "BONCY", "Fixed Amount", 5000, "Semi-Monthly", 2500.5, "Weekly", 1000, "Annually", 700, "Bi-Monthly", 1200, "Quarterly", "DEPTR", "AUTLS", "BONUS", "RTMTN", "HHRCO", "United States Dollar", "HOME", "AUTLS - zzzAutomobile Leasing", "AUTLS - Automobile Leasing", "Both", "BONCY - zzzBonus - Current Year", "BONUS - Bonus - Current Year", "Both", "DEPTR - zzzEducation Trip", "DEPTR - Education Trip", "Both", "EXTPY - External System", "HHRCO - Host Housing - Rented by Company", "Both", "NETPY - Net Pay", "RTMTN - Rental Maintenance", "Both");
	}	
	
	//-----------------------------Bulk Status Update----------------------------------------------
	@Test
	public void pageOneBSU()
	{
		PageBulkStatusUpdate pageBSU = new PageBulkStatusUpdate(driver);
		pageBSU.searchRecordsBSU("Juan", "", "2010 - 2030", "1/1/2018", "12/31/2018", "Reviewed");
		pageBSU.firstPageBSU();
	}
	
	@Test
	public void pageTwoBSU()
	{
		PageBulkStatusUpdate pageBSU = new PageBulkStatusUpdate(driver);
		pageBSU.searchRecordsBSU("Juan", "Diaz", "2010 - 2030", "1/1/2018", "12/31/2018", "Reviewed");
		pageBSU.secondPageBSU();
	}	
	
	//-------------------------Final Steps-----------------------------------------------------------
	@AfterMethod
	public void tearDown()
	{
		Helpers helper = new Helpers (driver);
		helper.waitingTime(2);
		driver.quit();
	}
}
