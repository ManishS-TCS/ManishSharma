/**
 * 
 */
/**
 * @author rbcmobility
 *
 */
package com.RBC.Mobile.Android.Tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AmazonAppAssignment.AmazonAppAssignment.*;

public class AmazonPlace 
{
	@BeforeTest
	public void setUpCap(){
		
		
	}
	
	@Test
	public void maintest()
	{
		//1. Click Hamburger/Menu button
		HomePage menu = new HomePage();
		menu.clickHamburgerMenuButton();
		
		//2. Click 'Shop By Category'
		MenuPage shopCat = new MenuPage();
		shopCat.clickShopByCategory();
		
		//3. Click 'Kindle'
		ShopByCategories cat = new ShopByCategories();
		cat.clickKindle();
		
		//4. Click 'Kindle E Readers'
		cat.clickKindleEReaders();
		
		//5. Click first Kindle entry
		KindleObjects kObj = new KindleObjects();
		kObj.clickFirstKindleObject();
		
		//6. Scroll to Add to Cart and click
		KindleObjectDetails kObjDetails = new KindleObjectDetails();
		kObjDetails.scrollToInStockElement();

	}
	
}