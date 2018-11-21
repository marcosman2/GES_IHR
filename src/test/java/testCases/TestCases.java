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
import pageObjects.PageLogin;
import pageObjects.PagePolicies;


public class TestCases {

	private WebDriver driver;
	//----------------------Pasos que se ejecutan siempre al inicio----------------------------
	
	@BeforeMethod
	public void setUp()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
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
	
	
	//------------------------------Creaci�n de Assignee--------------------------------------------------------
	@Test
	public void newAssignee()
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		pageAssignee.newAssignee("1/1/2018", "Alejandra", "Paz", "577845453011", "1152191801021", "10/22/2000", "Argentina", "Buenos Aires");
	}
	
	
	//------------------------------Creaci�n de Assignee Assignment--------------------------------------------------------
	@Test
	public void newAssigneeAssignment()
	{
			PageAssignee pageAssignee = new PageAssignee(driver);
			pageAssignee.newAssignee("1/1/2018", "Alejandra", "Paz", "577845453011", "1152191801021", "10/22/2000", "Argentina", "Buenos Aires");
			PageAssignment pageAssignment = new PageAssignment(driver);
			pageAssignment.newAssignment("Australia", "Business Trip", "924731", "1/1/2018", "12/31/2018", "1/1/2018", "Org ONe|XYZ|", "Monthly", "AUSTRALIA", "Australia Capital Territory");
	}
	
	//------------------------------Creaci�n de Assignee Assignment Policy--------------------------------------------------------
	@Test
	public void newAssigneeAssignmentPolicy()
	{
		PageAssignee pageAssignee = new PageAssignee(driver);
		pageAssignee.newAssignee("1/1/2018", "Alejandra", "Paz", "577845453011", "1152191801021", "10/22/2000", "Argentina", "Buenos Aires");
		PageAssignment pageAssignment = new PageAssignment(driver);
		pageAssignment.newAssignment("Australia", "Business Trip", "924731", "1/1/2018", "12/31/2018", "1/1/2018", "XYZ|", "Monthly", "AUSTRALIA", "Australia Capital Territory");
		PageAssigneePolicy pageAssigneePolicy = new PageAssigneePolicy(driver);
		pageAssigneePolicy.newAssigneeAssignmentPolicy("Big Policy", "1/1/2018", "12/31/2018");
	}
	
	
	//------------------------------Creaci�n de Policy--------------------------------------------------------
	@Test
	public void newPolicy()
	{
		PagePolicies pagePolicies = new PagePolicies(driver);
		pagePolicies.newPolicy("Automated Policy23", "United States Dollar", "1/1/2018", "12/31/2018", "10", "Net Pay", "zzzAlimony Received", "zzzAnnual Paid Premium", "zzzAnnuities", "zzzAuto Loan Advance", "zzzAutomobile Expense", "zzzBase Salary", "zzzBonus - Current Year", "zzzEducation Trip", "zzzEntertainment Allowance");
	}
	
	//-------------------------Pasos que se ejecutan siempre al final-----------------------------------------------------------
	@AfterMethod
	public void tearDown()
	{
		Helpers helper = new Helpers (driver);
		helper.waitingTime(3);
		helper.screenshotcapture("Finished_");
		driver.quit();
	}
}
