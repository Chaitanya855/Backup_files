package pageObject;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;






 public class CurrencyDropdownPage extends BasePage1
 {
  WebDriver driver;
	
	//constructor
	public CurrencyDropdownPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	
	@FindBy(xpath="//*[@class=\"btn btn-link dropdown-toggle\"]") 
	 WebElement  currencyButton;

	@FindBy(xpath="//*[@Class=\"currency-select btn btn-link btn-block\" and @type=\"button\"]") 
	private List<WebElement>  currencydropdowns;
	
	
	
	
	public void clickcurrencyButton()
	{
		currencyButton.click();
	}
	
    public void getDropdownCount()
    {
       //int count =  currencydropdowns.size();
       System.out.println("Number of dropdowns: " + currencydropdowns.size());
       
       for(int i=0;i<currencydropdowns.size();i++)
		{
			System.out.println(currencydropdowns.get(i).getText());
     }
     
    }

}
