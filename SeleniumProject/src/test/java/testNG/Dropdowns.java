package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdowns {
	
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("starting the browser");
		
	}
	
	@Test
	public void Main()
	{
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='btn btn-primary login-btn']")).click();
		
		
		
		/*Actions a=new Actions(driver);
		a.moveToElement(courses).perform();
		
		WebElement devOpTraining = driver.findElement(By.xpath("//span[normalize-space()='DevSecOps Training']"));

		a.click(devOpTraining).perform();*/		
		
		
		/*WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry=new Select(drpCountryEle);
		
		List<WebElement> options=drpCountry.getOptions();
        System.out.println("total number of options:"+options.size());*/

		
	}

}
