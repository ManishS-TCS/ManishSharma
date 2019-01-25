package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;

public class MenuPage extends HomePage{

	private static AndroidDriverManager manager = null;
	
	@SuppressWarnings("static-access")
	public void clickShopByCategory()
	{
		try {
			manager = AndroidDriverManager.getAndroidDriverInstance();
			manager.androidDriver.findElementById("in.amazon.mShop.android.shopping:id/subnav_button_text").click();
			System.out.println("Shop By category clicked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickKindle() throws MalformedURLException
	{
		ShopByCategories category = new ShopByCategories();
		category.clickKindle();
	}
}
