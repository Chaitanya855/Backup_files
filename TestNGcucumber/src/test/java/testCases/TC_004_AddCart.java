package testCases;

import org.testng.annotations.Test;

import pageObject.AddCartPage;
import pageObject.HomePage1;
import pageObject.ProductComparePage;
import pageObject.SearchPage;
import testBase.BaseClass;

public class TC_004_AddCart extends BaseClass
{
	
	@Test
	public void testAddCart()
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
	
	/*ProductComparePage pp = new ProductComparePage(driver);
	pp.compare_box_icon();
	pp.product_comparision_link();*/
	
	AddCartPage Ap = new AddCartPage(driver);
	Ap.AddCart_box_icon();
	Ap.Shopping_box_link();
	
	
	
	}
	
	

}
