package stepsdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	
	@Given("the user is on OrangeHRM Page")
	public void NavigatingToLoginPage() 
	{
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	    
	}

	@When("the user enters the valid credentials \\(Usernmae: {string}, password: {string})")
	public void EnteringCredentials(String user, String pwd) 
	{
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys(pwd);
		
	    
	}

	@When("the user clicks on the login button")
	public void ClickingOnTheLoginButton() 
	{
		driver.findElement(By.xpath("//*[text()=\" Login \"]")).click();
		
		
	}

	@Then("the user redirected to the dashboard page.")
	public void RedirectedToTheDashboardPage() 
	{
		WebElement element = driver.findElement(By.xpath("//*[@class=\"oxd-main-menu-item active\"]"));
	    Assert.assertEquals(element.getText(), "Dashboard");
	    //driver.quit();
	}
}
