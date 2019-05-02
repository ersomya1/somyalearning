package testcases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import factory.DataProviderFactory;

public class CalendarPicker {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
		driver  = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        
        driver.get("https://redbus.in");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
      List<WebElement>  date = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']//table[@class='rb-monthTable first last']//td"));
    int date_count = date.size();
    for (int i =0;i<date_count;i++)
    {
     String s=	date.get(i).getText();
     if(s.equalsIgnoreCase("25"))
     {
    	 date.get(i).click();
    	 Thread.sleep(5000);
    	   
    	 break;
     }
    }
  driver.findElement(By.xpath("//div[@class='manageHeaderLbl']")).click();
  driver.findElement(By.xpath("//span[contains(text(),'Reschedule')]")).click();
    

	}}
    
 
