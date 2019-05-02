package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import factory.DataProviderFactory;

public class CrossBrowserTesting {
	
	
	@Test
	@Parameters("Browser")
    public void test1(String browser)
     {  WebDriver driver;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
			driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			driver.quit();
		}
     if(browser.equalsIgnoreCase("firefox"))
     {
    	 driver  = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://facebook.com");
			driver.quit();
     }
     
     
     }
	
}
