package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {
	
	private WebDriver driver;
	private By userField;
	private By passwordField;
	private By loginButton;
	
	public PageLogin(WebDriver driver)
	{
		this.driver = driver;
		this.userField = By.id("UserNameTextBox");
		this.passwordField = By.id("PasswordTextBox");
		this.loginButton = By.id("LoginImageButton");
	}
	
	//-------------------Log into IHR-------------------------------
	
	public void login(String user, String password)
	{
		driver.findElement(userField).clear();
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	

}
