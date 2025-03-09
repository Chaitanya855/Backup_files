package testNG2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class TimeIBM {
	
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() 
	{
		
		System.out.println("Starting the browser session");
	  }
	
	
	
	@Test
	public void A() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://time.ibm.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
         /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds timeout
        
        // Wait for the element to be clickable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("credentialSignin")));*/
		
		
                // Wait for the element to be clickable
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("credentialSignin")));
                
               element.click();
                WebElement H = wait.until(ExpectedConditions.elementToBeClickable(By.id("user-name-input")));
                H.sendKeys("Mallem.Chaitanya@ibm.com");
                
                WebElement h = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-input")));
                h.sendKeys("Chaitu@HelloJava");
                
                
                WebElement M = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
                M.click();
              
                
                WebElement K = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Feature voting')]")));
                K.click();
		
                /*wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));
                System.out.println(driver.getPageSource());*/
                
                     WebElement s = driver.findElement(By.xpath("//a[normalize-space()='In development (1)']"));
                
                      String z = s.getText();
                      System.out.println(z); 
	}
	
	
	 
	  /*@AfterMethod
	  public void afterMethod() 
	  {
	  	  System.out.println("Closing the browser session");
	  	  driver.quit();
	  }*/
	
	

}

