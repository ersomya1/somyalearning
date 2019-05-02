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

	public class VerifyLoginPage {
		
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
		    Thread.sleep(20000);
		    
			  String homePageTitle = hp.getHomePageTitle();
	//	  Assert.assertEquals("WELCOME",homePageTitle);
		  hp.clickonSignIn();
		  LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		//  lp.LoginApplication("ersomya1@gmail.com","123456");
	 lp.LoginApplication(DataProviderFactory.getexcel().getdata(0,0,0),DataProviderFactory.getexcel().getdata(0,0,1));
		}
	}
	/*	@AfterTest
	        public void closeBrowser()
	        {
	        	driver.quit();
	        }
	}
*/
	
	

