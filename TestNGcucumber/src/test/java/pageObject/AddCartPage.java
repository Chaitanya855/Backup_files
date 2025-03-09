package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends BasePage1
{
	WebDriver driver;
	public AddCartPage (WebDriver driver)
	{
		super(driver);
		
		
	}
	
	
	
	@FindBy(xpath="(//*[@class=\"hidden-xs hidden-sm hidden-md\"])[7]") 
	WebElement AddCart_box;
	
	@FindBy(xpath="//*[text()=\"shopping cart\"]") 
	WebElement Shopping_box;
	
	

	public void AddCart_box_icon()
	{
		AddCart_box.click();
		
	}
	
	public void Shopping_box_link()
	{
		Shopping_box.click(); 
		
		/*try 
		{
			// First, try normal click
			Shopping_box.click(); 
        } 
		catch (Exception e) 
		{
            // If normal click fails, use JavaScript Executor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", Shopping_box);
        }*/
	
	}
}
