package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage1 extends BasePage1
{
	
WebDriver driver;
Actions actions;
	
	//constructor
	public HomePage1(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
		//PageFactory.initElements(driver, this);
		actions = new Actions(driver);
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
    
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[8]/a")  
	WebElement Mp3_Player;

	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a")  
	WebElement showAll_Mp3_Players;
	
	@FindBy(xpath="//*[text()=\"iPod Classic\"]")  
	WebElement iPod_classic;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/ul[2]/li[2]/a")  
	WebElement Reviews;
	
	@FindBy(xpath="//*[@id=\"input-review\"]")  
	WebElement Your_Review;
	
	@FindBy(xpath="//*[@name=\"rating\" and @value=\"3\"]")  
	WebElement Rating;
	
	

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
	
	// Method to hover over the menu
	public void Mp3_Player1()
	{
		actions.moveToElement(Mp3_Player).perform();
	}
	
	// Method to click the submenu after hovering
	public void showAll_Mp3_Players1()
	{
		actions.moveToElement(showAll_Mp3_Players).click().perform();
	}
    
	public void iPod_classic1()
	{
		iPod_classic.click();
	}
		
	public void Reviews1()
	{
		Reviews.click();
	}
	
	//sending my Review
	public void Your_Review1()
	{
		Your_Review.sendKeys("very nice product");
	}
	
	//Radio button 
	public void Rating1()
	{
		Rating.click();
	}
	

}
