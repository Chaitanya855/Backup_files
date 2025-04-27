package pageObject;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



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
	
	@FindBy(xpath="//*[@id=\"accordion\"]/div[2]/div[1]/h4/a") 
	WebElement Shipping_Taxes;
	
	@FindBy(xpath="//select[@id=\"input-country\"]/option") 
	private List<WebElement>  countrysdropdowns;
	
	
	

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
	
	public void Shipping_Taxes()
	{
		Shipping_Taxes.click();
	}
	
	public void getCountrys() throws InterruptedException
    {
       System.out.println("Number of countrys: " + countrysdropdowns.size());
       Thread.sleep(5000);
       //Select Obj1= new Select(driver.findElement(By.xpath("//*[@id=\"input-country\"]")));
       //Obj1.selectByVisibleText("India");
       
       for(int i=0;i<countrysdropdowns.size();i++)
		{
    	   WebElement option=countrysdropdowns.get(i);
						
    	   if (option.getText().equals("India"))
           {  
    	        option.click(); 
    	        break;  
    	    }
		}
       }
	
	
    
}
