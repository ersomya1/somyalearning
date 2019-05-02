package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataprovider.Configdataprovider;


public  class Browserfactory

{
	
	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
			driver  = new ChromeDriver();
		}
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   return driver;
	}
	
	public static void closeBrowser(WebDriver cdriver)
	{
		cdriver.quit();
	}
	

}
