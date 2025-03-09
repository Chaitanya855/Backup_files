package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage1;
import pageObject.ProductComparePage;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC_003_ProducComparision extends BaseClass
{
	@Test
	
	public void testProductComparision()
	
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
		
		ProductComparePage pp = new ProductComparePage(driver);
		pp.compare_box_icon();
		pp.product_comparision_link();
		
	}
	

}
