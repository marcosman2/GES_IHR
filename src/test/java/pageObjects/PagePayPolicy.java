package pageObjects;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helpers;

public class PagePayPolicy {
	
	private WebDriver driver;
	private By policyAdministrationLink;
	private By payPolicyTemplateLink;
	private By newTemplateButton;
	private By payPolicyTitle;
	private By payPolicyNameField;
	private By payPolicyBeginDateCalendar;
	private By payPolicyPLDrop;
	private By payPolicyPLSDrop;
	private By payPolicyChargeToDrop;
	private By payPolicySocialTaxDrop;
	private By payPolicyHypoDrop;
	private By payPolicyTETDrop;
	private By saveTemplateButton;
	private By savedTemplateMessage;
	private By configurationLink;
	private By remunerationVariablesAccordion;
	private By addVariablesButton;
	private By variableCodeField;
	private By searchVariableButton;
	private By appendVariablesCheckBox;
	private By selectVariablesCheckBox;
	private By okVariableButton;
	private By source1Link;
	private By source2Link;
	private By source3Link;
	private By source4Link;
	private By source5Link;
	private By sourceTypeDrop;
	private By amountField;
	private By howStatedDrop;
	private By saveAmountButton;
	private By savedAmountMessage;
	private By closeAmountIcon;
	private By costProjectionAccordion;
	private By addElementButton;
	private By elementCodeField;
	private By searchElementButton;
	private By appendElementCheckBox;
	private By selectElementsCheckBox;
	private By selectElementButton;
	private By elementAmountField1;
	private By elementAmountField2;
	private By elementAmountField3;
	private By elementAmountField4;
	private By elementAmountField5;
	private By elementCurrencyDrop1;
	private By elementCurrencyDrop2;
	private By elementCurrencyDrop3;
	private By elementCurrencyDrop4;
	private By elementCurrencyDrop5;
	private By elementCurrencyIndDrop1;
	private By elementCurrencyIndDrop2;
	private By elementCurrencyIndDrop3;
	private By elementCurrencyIndDrop4;
	private By elementCurrencyIndDrop5;
	private By saveElementButton;
	private By addCompensationMappingButton;
	private By variableDrop1;
	private By variableDrop2;
	private By variableDrop3;
	private By variableDrop4;
	private By variableDrop5;
	private By elementDrop1;
	private By elementDrop2;
	private By elementDrop3;
	private By elementDrop4;
	private By elementDrop5;
	private By overrideCheckBox1;
	private By overrideCheckBox2;
	private By overrideCheckBox3;
	private By overrideCheckBox4;
	private By overrideCheckBox5;
	private By activeCheckBox1;
	private By activeCheckBox2;
	private By activeCheckBox3;
	private By activeCheckBox4;
	private By activeCheckBox5;
	private By usageDrop1;
	private By usageDrop2;
	private By usageDrop3;
	private By usageDrop4;
	private By usageDrop5;
	private By lookupCheckBox1;
	private By lookupCheckBox2;
	private By lookupCheckBox3;
	private By lookupCheckBox4;
	private By lookupCheckBox5;
	private By saveCompensationMappingButton;
	private By savedCompensationMappingMessage;
	
	
	public PagePayPolicy(WebDriver driver)
	{
		this.driver = driver;
		this.policyAdministrationLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MenuBar_Menu_MasterMenu\"]/ul/li[4]/a");
		this.payPolicyTemplateLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_3\"]/div/span");
		this.newTemplateButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_newBtn");
		this.payPolicyTitle = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_updtpnlPayPolicyDetails\"]/div[1]/h4");
		this.payPolicyNameField = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_policyNameTxtBx");
		this.payPolicyBeginDateCalendar = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_beginDateCntrl_beginDateCntrl_inp");
		this.payPolicyPLDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_procLocDDL_disp");
		this.payPolicyPLSDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_procSysDDL_disp");
		this.payPolicyChargeToDrop = By.id("chargeToDDL_disp");
		this.payPolicySocialTaxDrop = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_socTaxHomeHostDDL_disp");
		this.payPolicyHypoDrop = By.id("hypoDefaultToDropDownList_disp");
		this.payPolicyTETDrop = By.id("TaxElectionsTemplateDropdown_disp");
		this.saveTemplateButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_saveBtn");
		this.savedTemplateMessage = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_validationSummary");
		this.configurationLink = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_ContextNav_ContextNav_ContextNav_NavFastFind_ctl00_FastFindNav_LinksGrid_lnkButton_6\"]/div");
		this.remunerationVariablesAccordion = By.id("variablesHeader");
		this.addVariablesButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_variablesAddBtn");
		this.variableCodeField = By.id("ctl00_ctl00_Main_MainContent_CodeTextBox");
		this.searchVariableButton = By.id("ctl00_ctl00_Main_MainContent_SearchButton");
		this.appendVariablesCheckBox = By.id("ctl00_ctl00_Main_MainContent_appendCheckbox");
		this.selectVariablesCheckBox = By.id("ctl00_ctl00_Main_MainContent_variableSearchDataGrid_ctl02_Selectallcheckbox");
		this.okVariableButton = By.id("ctl00_ctl00_Main_MainContent_SelectButton");
		this.source1Link = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_remunVarsGridView_ctl02_linkBtn3_item");
		this.source2Link = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_remunVarsGridView_ctl03_linkBtn3_item");
		this.source3Link = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_remunVarsGridView_ctl04_linkBtn3_item");
		this.source4Link = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_remunVarsGridView_ctl05_linkBtn3_item");
		this.source5Link = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_remunVarsGridView_ctl06_linkBtn3_item");
		this.sourceTypeDrop = By.id("ctl00_ctl00_Main_MainContent_sourceType2_disp");
		this.amountField = By.id("ctl00_ctl00_Main_MainContent_AmountTxtBx");
		this.howStatedDrop = By.id("ctl00_ctl00_Main_MainContent_HowStated_disp");
		this.saveAmountButton = By.id("ctl00_ctl00_Main_MainContent_saveBtn");
		this.savedAmountMessage = By.id("ctl00_ctl00_Main_MainContent_ValidationSummary1");
		this.closeAmountIcon = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_PageBody\"]/div[4]/div[1]/a/span");
		this.costProjectionAccordion = By.id("elementsHeader");
		this.addElementButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_elementsAddBtn");
		this.elementCodeField = By.id("ctl00_ctl00_ctl00_Main_MainContent_MainContent_INCDED_ELMNT_CODE");
		this.searchElementButton = By.id("ctl00_ctl00_ctl00_Main_MainContent_MainContent_SEARCH");
		this.appendElementCheckBox = By.id("ctl00_ctl00_ctl00_Main_MainContent_MainContent_APPEND");
		this.selectElementsCheckBox = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_Main_MainContent_MainContent_dgElmntSearchResult_ctl02_SelectAllCheckBox1\"]");
		this.selectElementButton = By.id("ctl00_ctl00_ctl00_Main_MainContent_MainContent_SelectElmnts");
		this.elementAmountField1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl02_amountTxtBx");
		this.elementAmountField2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl03_amountTxtBx");
		this.elementAmountField3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl04_amountTxtBx");
		this.elementAmountField4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl05_amountTxtBx");
		this.elementAmountField5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl06_amountTxtBx");
		this.elementCurrencyDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl02_currencyDDL_disp");
		this.elementCurrencyDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl03_currencyDDL_disp");
		this.elementCurrencyDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl04_currencyDDL_disp");
		this.elementCurrencyDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl05_currencyDDL_disp");
		this.elementCurrencyDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl06_currencyDDL_disp");
		this.elementCurrencyIndDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl02_currencyIndDDL_disp");
		this.elementCurrencyIndDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl03_currencyIndDDL_disp");
		this.elementCurrencyIndDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl04_currencyIndDDL_disp");
		this.elementCurrencyIndDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl05_currencyIndDDL_disp");
		this.elementCurrencyIndDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_cpElementsGridView_ctl06_currencyIndDDL_disp");
		this.saveElementButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_elementsSaveBtn");
		this.addCompensationMappingButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsAddBtn");
		this.variableDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_variableDDL_disp");
		this.variableDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_variableDDL_disp");
		this.variableDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_variableDDL_disp");
		this.variableDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_variableDDL_disp");
		this.variableDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_variableDDL_disp");
		this.elementDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_elementDDL_disp");
		this.elementDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_elementDDL_disp");
		this.elementDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_elementDDL_disp");
		this.elementDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_elementDDL_disp");
		this.elementDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_elementDDL_disp");
		this.overrideCheckBox1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_overrideChkBx");
		this.overrideCheckBox2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_overrideChkBx");
		this.overrideCheckBox3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_overrideChkBx");
		this.overrideCheckBox4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_overrideChkBx");
		this.overrideCheckBox5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_overrideChkBx");
		this.activeCheckBox1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_activeChkBx");
		this.activeCheckBox2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_activeChkBx");
		this.activeCheckBox3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_activeChkBx");
		this.activeCheckBox4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_activeChkBx");
		this.activeCheckBox5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_activeChkBx");
		this.usageDrop1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_usageTypeDDL_disp");
		this.usageDrop2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_usageTypeDDL_disp");
		this.usageDrop3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_usageTypeDDL_disp");
		this.usageDrop4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_usageTypeDDL_disp");
		this.usageDrop5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_usageTypeDDL_disp");
		this.lookupCheckBox1 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl02_lookupEnabledChkBx");
		this.lookupCheckBox2 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl03_lookupEnabledChkBx");
		this.lookupCheckBox3 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl04_lookupEnabledChkBx");
		this.lookupCheckBox4 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl05_lookupEnabledChkBx");
		this.lookupCheckBox5 = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsGridView_ctl06_lookupEnabledChkBx");
		this.saveCompensationMappingButton = By.id("ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_mappingsSaveBtn");
		this.savedCompensationMappingMessage = By.xpath("//*[@id=\"ctl00_ctl00_ctl00_ctl00_Main_MainContent_MainContent_MainContent_pageValidationSummary\"]");
	}
	
	//----------------------------------------New Pay Policy Template Method------------------------------------------

	public void newPayPolicyTemplate(String payPolicyName, String payPolicyBD, String payPolicyPL, String payPolicyPLS, String payPolicyCharge, String payPolicySocial, String payPolicyHypo, String payPolicyTET, String var1, String var2, String var3, String var4, String var5, String srcType, double amount1, String howStated1, double amount2, String howStated2, double amount3, String howStated3, double amount4, String howStated4, double amount5, String howStated5, String elem1, String elem2, String elem3, String elem4, String elem5, String currency, String curIndicator, String varMapping1, String elemMapping1, String usageMapping1, String varMapping2, String elemMapping2, String usageMapping2, String varMapping3, String elemMapping3, String usageMapping3, String varMapping4, String elemMapping4, String usageMapping4, String varMapping5, String elemMapping5, String usageMapping5)
	{
		
		Helpers helper = new Helpers(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement policyLink = wait.until(ExpectedConditions.presenceOfElementLocated(policyAdministrationLink));
		policyLink.click();
		
		//-----------------------------------PPT Initial Information--------------------------------------------------------------
		
		WebElement payPolicyLink = wait.until(ExpectedConditions.presenceOfElementLocated(payPolicyTemplateLink));
		payPolicyLink.click();
		WebElement newPPTButton = wait.until(ExpectedConditions.elementToBeClickable(newTemplateButton));
		newPPTButton.click();
		WebElement pptTitle = wait.until(ExpectedConditions.presenceOfElementLocated(payPolicyTitle));
		driver.findElement(payPolicyNameField).sendKeys(payPolicyName);
		driver.findElement(payPolicyBeginDateCalendar).sendKeys(payPolicyBD);
		driver.findElement(payPolicyBeginDateCalendar).sendKeys(Keys.TAB);
		driver.findElement(payPolicyPLDrop).sendKeys(payPolicyPL);
		helper.waitingTime(1);
		driver.findElement(payPolicyPLDrop).sendKeys(Keys.TAB);
		WebElement plsDrop = wait.until(ExpectedConditions.elementToBeClickable(payPolicyPLSDrop));
		plsDrop.sendKeys(payPolicyPLS);
		helper.waitingTime(1);
		plsDrop.sendKeys(Keys.TAB);
		driver.findElement(payPolicyChargeToDrop).sendKeys(payPolicyCharge);
		helper.waitingTime(1);
		driver.findElement(payPolicyChargeToDrop).sendKeys(Keys.TAB);
		driver.findElement(payPolicySocialTaxDrop).sendKeys(payPolicySocial);
		helper.waitingTime(1);
		driver.findElement(payPolicySocialTaxDrop).sendKeys(Keys.TAB);
		driver.findElement(payPolicyHypoDrop).sendKeys(payPolicyHypo);
		helper.waitingTime(1);
		driver.findElement(payPolicyHypoDrop).sendKeys(Keys.TAB);
		driver.findElement(payPolicyTETDrop).sendKeys(payPolicyTET);
		helper.waitingTime(1);
		driver.findElement(payPolicyTETDrop).sendKeys(Keys.TAB);
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		driver.findElement(saveTemplateButton).click();
		WebElement savedTemplate = wait.until(ExpectedConditions.visibilityOfElementLocated(savedTemplateMessage));
		helper.screenshotcapture("PPT Created_");
		driver.findElement(configurationLink).click();
		
		//--------------------------------------Adding Variables-------------------------------------------------------------
		WebElement remunAccordion = wait.until(ExpectedConditions.presenceOfElementLocated(remunerationVariablesAccordion));
		remunAccordion.click();
		WebElement addVariables = wait.until(ExpectedConditions.elementToBeClickable(addVariablesButton));
		addVariables.click();	
		WebElement variablesFrame = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(variablesFrame);
		driver.findElement(variableCodeField).sendKeys(var1);
		driver.findElement(searchVariableButton).click();
		WebElement appendCheck = wait.until(ExpectedConditions.elementToBeClickable(appendVariablesCheckBox));
		appendCheck.click();
		driver.findElement(variableCodeField).clear();
		driver.findElement(variableCodeField).sendKeys(var2);
		driver.findElement(searchVariableButton).click();
		driver.findElement(variableCodeField).clear();
		driver.findElement(variableCodeField).sendKeys(var3);
		driver.findElement(searchVariableButton).click();
		driver.findElement(variableCodeField).clear();
		driver.findElement(variableCodeField).sendKeys(var4);
		driver.findElement(searchVariableButton).click();
		driver.findElement(variableCodeField).clear();
		driver.findElement(variableCodeField).sendKeys(var5);
		driver.findElement(searchVariableButton).click();
		WebElement selectAllVariables = wait.until(ExpectedConditions.elementToBeClickable(selectVariablesCheckBox));
		selectAllVariables.click();
		driver.findElement(okVariableButton).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(source1Link).click();
		WebElement amountFrame = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(amountFrame);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sourceTypeDrop).clear();
		driver.findElement(sourceTypeDrop).sendKeys(srcType);
		helper.waitingTime(1);
		driver.findElement(sourceTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(amountField).clear();
		driver.findElement(amountField).sendKeys(String.valueOf(amount1));
		driver.findElement(howStatedDrop).clear();
		driver.findElement(howStatedDrop).sendKeys(howStated1);
		helper.waitingTime(1);
		driver.findElement(howStatedDrop).sendKeys(Keys.TAB);
		driver.findElement(saveAmountButton).click();
		WebElement savedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(savedAmountMessage));
		driver.switchTo().defaultContent();
		driver.findElement(closeAmountIcon).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement sourceLink2 = wait.until(ExpectedConditions.presenceOfElementLocated(source2Link));
		helper.waitingTime(1);
		driver.findElement(source2Link).click();
		WebElement amountFrame2 = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(amountFrame2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sourceTypeDrop).clear();
		driver.findElement(sourceTypeDrop).sendKeys(srcType);
		helper.waitingTime(1);
		driver.findElement(sourceTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(amountField).clear();
		driver.findElement(amountField).sendKeys(String.valueOf(amount2));
		driver.findElement(howStatedDrop).clear();
		driver.findElement(howStatedDrop).sendKeys(howStated2);
		helper.waitingTime(1);
		driver.findElement(howStatedDrop).sendKeys(Keys.TAB);
		driver.findElement(saveAmountButton).click();
		driver.switchTo().defaultContent();
		driver.findElement(closeAmountIcon).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(source3Link).click();
		WebElement amountFrame3 = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(amountFrame3);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sourceTypeDrop).clear();
		driver.findElement(sourceTypeDrop).sendKeys(srcType);
		helper.waitingTime(1);
		driver.findElement(sourceTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(amountField).clear();
		driver.findElement(amountField).sendKeys(String.valueOf(amount3));
		driver.findElement(howStatedDrop).clear();
		driver.findElement(howStatedDrop).sendKeys(howStated3);
		helper.waitingTime(1);
		driver.findElement(howStatedDrop).sendKeys(Keys.TAB);
		driver.findElement(saveAmountButton).click();
		driver.switchTo().defaultContent();
		driver.findElement(closeAmountIcon).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(source4Link).click();
		WebElement amountFrame4 = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(amountFrame4);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sourceTypeDrop).clear();
		driver.findElement(sourceTypeDrop).sendKeys(srcType);
		helper.waitingTime(1);
		driver.findElement(sourceTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(amountField).clear();
		driver.findElement(amountField).sendKeys(String.valueOf(amount4));
		driver.findElement(howStatedDrop).clear();
		driver.findElement(howStatedDrop).sendKeys(howStated4);
		helper.waitingTime(1);
		driver.findElement(howStatedDrop).sendKeys(Keys.TAB);
		driver.findElement(saveAmountButton).click();
		driver.switchTo().defaultContent();
		driver.findElement(closeAmountIcon).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(source5Link).click();
		WebElement amountFrame5 = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(amountFrame5);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(sourceTypeDrop).clear();
		driver.findElement(sourceTypeDrop).sendKeys(srcType);
		helper.waitingTime(1);
		driver.findElement(sourceTypeDrop).sendKeys(Keys.TAB);
		driver.findElement(amountField).clear();
		driver.findElement(amountField).sendKeys(String.valueOf(amount5));
		driver.findElement(howStatedDrop).clear();
		driver.findElement(howStatedDrop).sendKeys(howStated5);
		helper.waitingTime(1);
		driver.findElement(howStatedDrop).sendKeys(Keys.TAB);
		driver.findElement(saveAmountButton).click();
		driver.switchTo().defaultContent();
		driver.findElement(closeAmountIcon).click();		
				
		//---------------------------------------------Adding Elements-----------------------------------------------
		helper.waitingTime(1);
		driver.findElement(costProjectionAccordion).click();
		WebElement addCPButton = wait.until(ExpectedConditions.elementToBeClickable(addElementButton));
		helper.waitingTime(1);
		addCPButton.click();
		WebElement elementsFrame = driver.findElement(By.xpath("//*[@id=\"jPopUpFrame\"]"));
		driver.switchTo().frame(elementsFrame);
		driver.findElement(elementCodeField).sendKeys(elem1);
		driver.findElement(searchElementButton).click();
		WebElement appendElem = wait.until(ExpectedConditions.elementToBeClickable(appendElementCheckBox));
		appendElem.click();
		driver.findElement(elementCodeField).clear();
		helper.waitingTime(1);
		driver.findElement(elementCodeField).sendKeys(elem2);
		driver.findElement(searchElementButton).click();
		driver.findElement(elementCodeField).clear();
		helper.waitingTime(1);
		driver.findElement(elementCodeField).sendKeys(elem3);
		driver.findElement(searchElementButton).click();
		driver.findElement(elementCodeField).clear();
		helper.waitingTime(1);
		driver.findElement(elementCodeField).sendKeys(elem4);
		driver.findElement(searchElementButton).click();
		driver.findElement(elementCodeField).clear();
		helper.waitingTime(1);
		driver.findElement(elementCodeField).sendKeys(elem5);
		driver.findElement(searchElementButton).click();
		helper.waitingTime(1);
		driver.findElement(selectElementsCheckBox).click();
		driver.findElement(selectElementButton).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(elementCurrencyDrop1).sendKeys(currency);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyDrop1).sendKeys(Keys.TAB);
		driver.findElement(elementCurrencyIndDrop1).sendKeys(curIndicator);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyIndDrop1).sendKeys(Keys.TAB);
		((JavascriptExecutor)driver).executeScript("scroll(0,150)");
		
		driver.findElement(elementCurrencyDrop2).sendKeys(currency);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyDrop2).sendKeys(Keys.TAB);
		driver.findElement(elementCurrencyIndDrop2).sendKeys(curIndicator);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyIndDrop2).sendKeys(Keys.TAB);
		
		driver.findElement(elementCurrencyDrop3).sendKeys(currency);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyDrop3).sendKeys(Keys.TAB);
		driver.findElement(elementCurrencyIndDrop3).sendKeys(curIndicator);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyIndDrop3).sendKeys(Keys.TAB);
		
		driver.findElement(elementCurrencyDrop4).sendKeys(currency);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyDrop4).sendKeys(Keys.TAB);
		driver.findElement(elementCurrencyIndDrop4).sendKeys(curIndicator);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyIndDrop4).sendKeys(Keys.TAB);
		
		driver.findElement(elementCurrencyDrop5).sendKeys(currency);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyDrop5).sendKeys(Keys.TAB);
		driver.findElement(elementCurrencyIndDrop5).sendKeys(curIndicator);
		helper.waitingTime(1);
		driver.findElement(elementCurrencyIndDrop5).sendKeys(Keys.TAB);
		driver.findElement(saveElementButton).click();
		
		//---------------------Adding Compensation Mappings----------------------------------------------------------------
		
		WebElement addMapp = wait.until(ExpectedConditions.elementToBeClickable(addCompensationMappingButton));
		helper.waitingTime(2);
		driver.findElement(addCompensationMappingButton).click();
		helper.waitingTime(1);
		driver.findElement(addCompensationMappingButton).click();
		helper.waitingTime(1);
		driver.findElement(addCompensationMappingButton).click();
		helper.waitingTime(1);
		driver.findElement(addCompensationMappingButton).click();
		helper.waitingTime(1);
		driver.findElement(addCompensationMappingButton).click();
		
		WebElement variable1 = wait.until(ExpectedConditions.elementToBeClickable(variableDrop1));
		helper.waitingTime(2);
		driver.findElement(variableDrop1).sendKeys(varMapping1);
		helper.waitingTime(1);
		driver.findElement(variableDrop1).sendKeys(Keys.TAB);
		driver.findElement(elementDrop1).sendKeys(elemMapping1);
		helper.waitingTime(1);
		driver.findElement(overrideCheckBox1).click();
		driver.findElement(activeCheckBox1).click();
		driver.findElement(usageDrop1).sendKeys(usageMapping1);
		helper.waitingTime(1);
		driver.findElement(usageDrop1).sendKeys(Keys.TAB);
		driver.findElement(lookupCheckBox1).click();
		
		driver.findElement(variableDrop2).sendKeys(varMapping2);
		helper.waitingTime(1);
		driver.findElement(variableDrop2).sendKeys(Keys.TAB);
		driver.findElement(elementDrop2).sendKeys(elemMapping2);
		helper.waitingTime(1);
		driver.findElement(overrideCheckBox2).click();
		driver.findElement(activeCheckBox2).click();
		driver.findElement(usageDrop2).sendKeys(usageMapping2);
		helper.waitingTime(1);
		driver.findElement(usageDrop2).sendKeys(Keys.TAB);
		driver.findElement(lookupCheckBox2).click();
		
		driver.findElement(variableDrop3).sendKeys(varMapping3);
		helper.waitingTime(1);
		driver.findElement(variableDrop3).sendKeys(Keys.TAB);
		driver.findElement(elementDrop3).sendKeys(elemMapping3);
		helper.waitingTime(1);
		driver.findElement(overrideCheckBox3).click();
		driver.findElement(activeCheckBox3).click();
		driver.findElement(usageDrop3).sendKeys(usageMapping3);
		helper.waitingTime(1);
		driver.findElement(usageDrop3).sendKeys(Keys.TAB);
		driver.findElement(lookupCheckBox3).click();
		
		driver.findElement(variableDrop4).sendKeys(varMapping4);
		helper.waitingTime(1);
		driver.findElement(variableDrop4).sendKeys(Keys.TAB);
		driver.findElement(elementDrop4).sendKeys(elemMapping4);
		helper.waitingTime(1);
		driver.findElement(overrideCheckBox4).click();
		driver.findElement(activeCheckBox4).click();
		driver.findElement(usageDrop4).sendKeys(usageMapping4);
		helper.waitingTime(1);
		driver.findElement(usageDrop4).sendKeys(Keys.TAB);
		driver.findElement(lookupCheckBox4).click();
		
		driver.findElement(variableDrop5).sendKeys(varMapping5);
		helper.waitingTime(1);
		driver.findElement(variableDrop5).sendKeys(Keys.TAB);
		driver.findElement(elementDrop5).sendKeys(elemMapping5);
		helper.waitingTime(1);
		driver.findElement(overrideCheckBox5).click();
		driver.findElement(activeCheckBox5).click();
		driver.findElement(usageDrop5).sendKeys(usageMapping5);
		helper.waitingTime(1);
		driver.findElement(usageDrop5).sendKeys(Keys.TAB);
		driver.findElement(lookupCheckBox5).click();
				
		driver.findElement(saveCompensationMappingButton).click();
		//---------------------------------------------------------------------------------------------------------------------
		WebElement messageDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(savedCompensationMappingMessage));
		String message = messageDisplayed.getText();
		if (message.equals("Compensation Mapping Saved Successfully."))
		{
			helper.screenshotcapture("Mappings Added_");
		}
		else
		{
			helper.screenshotcapture("ISSUE_Mappings Not Added_");
		}
				
		
	}
}
