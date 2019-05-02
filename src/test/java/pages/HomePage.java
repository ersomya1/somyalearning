package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public void Homepage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/ul[1]/li[1]/span[1]") WebElement welcome ;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")  WebElement SignIn;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")  WebElement createaccount ;
    
    public void clickonSignIn()
    {
    	SignIn.click();
    }
    
    public void clickOnCreateAccount()
    {
    	createaccount.click();
    }
    
    
    public String getHomePageTitle()
    {
     	return welcome.getText();
     
    	
    }
	
}