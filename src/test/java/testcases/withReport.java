package testcases;

	
	
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.Browserfactory;
	import factory.DataProviderFactory;
	import junit.framework.Assert;
	import pages.HomePage;
	import pages.LoginPage;
import utilities.Helper;


public class withReport

{
	
		
		WebDriver driver;
		ExtentReports report;
		ExtentTest logger;

		@BeforeTest
		public   void startup() 
		{
			report = new ExtentReports("./reports/LoginPageReport.html",true);
		//	logger = new ExtentTest("Verify login page", "This page will verify signout");
			logger= report.startTest("Verify login test");
			 driver = Browserfactory.getBrowser("chrome");
			 
			
		
		driver.get(DataProviderFactory.getConfig().getApplicationUrl());
		
		logger.log(LogStatus.INFO, "Application is up and running");
		}
		
		
		
		@Test
		public void homepagetestcase() throws Throwable
		{
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
		    Thread.sleep(20000);
		    
			  String homePageTitle = hp.getHomePageTitle();
			  logger.log(LogStatus.INFO, "Home Page Loaded");
	//	  Assert.assertEquals("WELCOME",homePageTitle);
		  hp.clickonSignIn();
		  LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		//  lp.LoginApplication("ersomya1@gmail.com","123456");
	 lp.LoginApplication(DataProviderFactory.getexcel().getdata(0,0,0),DataProviderFactory.getexcel().getdata(0,0,1));
		}
	 @AfterTest
	 public void Teardown()
	 {
	 report.endTest(logger);
	 report.flush();
	 }
		}
	
	


