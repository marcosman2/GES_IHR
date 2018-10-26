package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helpers {

	private WebDriver driver;
	
	public Helpers(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//---------------------M�TODO PARA ESPERAR LOS SEGUNDOS INDICADOS-------------------------
	
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
	
	//---------------------M�TODO PARA HACER CAPTURAS DE PANTALLA----------------------------
	
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

}
