package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import factory.DataProviderFactory;

@Listeners(TestNGListener.class)
public class listernertest {
	
	WebDriver driver;
	
	@Test
	public void fbtest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
	String s=	driver.findElement(By.xpath("//div[contains(text(),\"It's free and always will be.\")]")).getText();
	//String t = "It's free and always will be.";
	String t = "x";
     Assert.assertEquals(t,s);
//	Assert.assertEquals(s, expected);
	driver.quit();
	}

}
