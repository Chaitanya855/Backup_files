package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage1
{
WebDriver driver;
	
	//constructor
	public SearchPage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//*[@class=\"form-control input-lg\"]") 
	WebElement search_box;
	
	@FindBy(xpath="//*[@class=\"btn btn-default btn-lg\"]") 
	WebElement search_icon;
	
	
	
	
	
	
	public void clickserach_box(String item)
	{
		search_box.sendKeys(item);
	}
	
	public void clickserach_icon()
	{
		search_icon.click();
	}
  
}
