package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage1 extends BasePage1
{
	
WebDriver driver;
	
	//constructor
	public HomePage1(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	@FindBy(xpath="//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;

	@FindBy(xpath="//a[normalize-space()='Login']") 
	WebElement lnkLogin;

	@FindBy(xpath="//*[@id='input-email']")  
	WebElement txt_Email;
			
	@FindBy(xpath="//*[@id='input-password']")  
	WebElement txt_password;
			
	@FindBy(xpath="//*[@value='Login']")  
	WebElement btn_login;




	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}

	public void clickLogin1()
	{
		lnkLogin.click();
		
	}
	public void setUserName(String user)
	{
		txt_Email.sendKeys(user);
	}
			
			
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}

	public void clickLogin2()
	{
		 btn_login.click();
	}

		
	

}
