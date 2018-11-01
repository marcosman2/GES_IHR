package testCases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.DataDriven;
import dataDriven.DataDriven;
import pageObjects.PageAssignee;
import pageObjects.PageAssigneePolicy;
import pageObjects.PageAssignment;
import pageObjects.PageLogin;

public class TestsDataDriven {
	
	private WebDriver driver;
	
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

	//********************************DATA DRIVEN TEST CASES*********************************************
	
			//----------Creación de Assignee Assignment y Asociación de Policy------------
	
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
}
