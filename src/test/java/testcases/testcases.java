package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import factory.Browserfactory;
import factory.DataProviderFactory;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class testcases {
	
	WebDriver driver;
	

	@BeforeTest
	public   void startup() 
	{
		 driver = Browserfactory.getBrowser("chrome");
		 
		
	
	driver.get(DataProviderFactory.getConfig().getApplicationUrl());
	
	}
		
	@Test
	public void homepagetestcase() throws Throwable
	{
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
	    Thread.sleep(15000);
		 hp.clickonSignIn();
		 Thread.sleep(15000);
		  String homePageTitle = hp.getHomePageTitle();
	 Assert.assertEquals("WELCOME",homePageTitle);
	  hp.clickOnCreateAccount();
	}
	
	@AfterTest
        public void closeBrowser()
        {
        	driver.quit();
        }
}
