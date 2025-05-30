package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

/*Data is valid  - login success - test pass  - logout
Data is valid -- login failed - test fail

Data is invalid - login success - test fail  - logout
Data is invalid -- login failed - test pass
*/


public class TC_005_LoginDDT extends BaseClass
{
	
  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)	
	public void Verify_loginDDT(String email, String password, String exp)
	{
	  
	 try
	 {
	HomePage1 hp=new HomePage1(driver);
	hp.clickMyAccount();
	hp.clickLogin1();
	hp.setUserName(email);
	hp.setPassword(password);
	hp.clickLogin2();
	
	
	MyAccountPage Macc = new MyAccountPage(driver);
	boolean targetPage=Macc.isMyAccountPageExists();
	
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(targetPage==true)
		{
			Macc.clickLogout();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	if(exp.equalsIgnoreCase("Invalid"))
	{
		if(targetPage==true)
		{
			Macc.clickLogout();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	}	

  catch(Exception e)
  {
	Assert.fail("An exception occurred: " + e.getMessage());
  }
	


}

}
