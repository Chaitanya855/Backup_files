package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage1
{
	public MyAccountPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="(//*[text()=\"My Account\"])[4]") 
	WebElement msgHeading;
	
	@FindBy(xpath="//*[@class='list-group-item' and text()='Logout']") 
	WebElement lnkLogout;
	
	
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try 
		{
			return (msgHeading.isDisplayed());
		} 
		catch (Exception e) 
		{
			return (false);
		}
	}
	
	public void clickLogout() 
	{
		lnkLogout.click();
		
	}




}
