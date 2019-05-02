package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import factory.DataProviderFactory;

public class Moneycontrol {
	
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
		driver  = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        
        driver.get("http://www.moneycontrol.com");
        driver.findElement(By.xpath("//form[@id='form_topsearch']//input[@id='search_str']")).sendKeys("tcs");
        driver.findElement(By.xpath("//a[@title='Submit']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'FINANCIALS')]")).click();
        for(int j=7;j<10;j++)
        {
        String t = "//tr" + "[" + j + "]" + "//td";
   List<WebElement> data =    driver.findElements(By.xpath(t));
       int count = data.size();
       for (int i=0;i<count;i++)
       {
    	   String s=data.get(i).getText();
    	   System.out.println(s);
       }
        }
}}
