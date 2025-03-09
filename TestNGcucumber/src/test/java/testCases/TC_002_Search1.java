package testCases;
import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.SearchPage;

import testBase.BaseClass;


public class TC_002_Search1 extends BaseClass
{
	@Test(groups= {"Regression","Master"})

	public void testSearch()
	{
		
		HomePage1 hp=new HomePage1(driver);
		hp.clickMyAccount();
		hp.clickLogin1();
		hp.setUserName("mallemchaitanya13@gmail.com");
		hp.setPassword("Chaitu@412");
		hp.clickLogin2();	
		
	SearchPage sp=new SearchPage(driver);
	sp.clickserach_box("iMac");
	sp.clickserach_icon();
	
	}

}
