package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends BasePage1
{
	
 WebDriver driver;
	
	//constructor
	public ProductComparePage (WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="(//*[@data-toggle=\"tooltip\"])[4]") 
	WebElement compare_box;
	
	@FindBy(xpath="//*[text()=\"product comparison\"]") 
	WebElement product_comparision;
	
	
	
	
	public void compare_box_icon()
	{
		compare_box.click();
	}
	
	
	public void product_comparision_link()
	{
		
		try 
		{
			// First, try normal click
			product_comparision.click(); 
        } 
		catch (Exception e) 
		{
            // If normal click fails, use JavaScript Executor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", product_comparision);
        }
		
	}
	
	

}
