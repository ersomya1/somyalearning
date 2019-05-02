package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public void LoginPage(WebDriver ldriver)
	{
		this.driver =ldriver;
	}
     
	@FindBy(xpath ="//fieldset[@class='fieldset login']//input[@id='email']") WebElement username;
	@FindBy(xpath ="//fieldset[@class='fieldset login']//input[@id='pass']") WebElement password;
	@FindBy(xpath="//fieldset[@class='fieldset login']//button[@id='send2']") WebElement sgnbtn;
	public void LoginApplication(String uname,String pass) throws Throwable
	{  
		Thread.sleep(4000);
		username.sendKeys(uname);
		Thread.sleep(4000);
		password.sendKeys(pass);
		Thread.sleep(4000);
		sgnbtn.click();
	}
   
}
