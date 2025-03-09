package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.MyAccountPage;
import pageObject.SearchPage;
import testBase.BaseClass;


public class TC_001_Login extends BaseClass {

	
	@Test(groups= {"Sanity","Master"})
	public void testLogin()
	{
		
	try
	{
		HomePage1 hp=new HomePage1(driver);
		hp.clickMyAccount();
		hp.clickLogin1();
		hp.setUserName(p.getProperty("email"));
		hp.setPassword(p.getProperty("password"));
		hp.clickLogin2();
		
		
		MyAccountPage Macc = new MyAccountPage(driver);
		boolean targetPage=Macc.isMyAccountPageExists();
		
		Assert.assertTrue(targetPage);
	    }
	    catch(Exception e)
	    {
		  Assert.fail();
	    }

		
	}
	
	
	

}
