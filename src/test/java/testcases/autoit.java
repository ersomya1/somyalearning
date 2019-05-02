package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import factory.DataProviderFactory;

public class autoit {

	@Test
	public static void autoitt() throws IOException, InterruptedException
	{  WebDriver driver;
		System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\DELL\\Desktop\\res.html");
		driver.findElement(By.name("resume")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\autoit\\resumeupload.exe");
	}
	
}
