package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helpers {

	private WebDriver driver;
	
	public Helpers(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//---------------------MÉTODO PARA ESPERAR LOS SEGUNDOS INDICADOS-------------------------
	
	public void waitingTime(int seconds)
	{
		try
		{
			Thread.sleep(seconds*1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	//---------------------MÉTODO PARA HACER CAPTURAS DE PANTALLA----------------------------
	
	public void screenshotcapture(String prefix)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(src, new File (prefix+System.currentTimeMillis()+".png"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//------------------------MÉTODO PARA VALIDAR EXISTENCIA DE UN ELEMENTO--------------------------
	
	public boolean elementExists(String id)
	{
		try
		{
			driver.findElement(By.id(id));
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
		return true;
	}

}
