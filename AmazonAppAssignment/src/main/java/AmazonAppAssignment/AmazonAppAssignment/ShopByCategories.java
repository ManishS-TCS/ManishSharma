package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class ShopByCategories extends HomePage {
	

	@SuppressWarnings("static-access")
	public void clickKindle()
	{
		System.out.println("Clicking Kindle");
		AndroidDriverManager manager;
		try {
			manager = AndroidDriverManager.getAndroidDriverInstance();
			manager.androidDriver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
			manager.androidDriver.findElementByXPath("//android.webkit.WebView[@content-desc=\"Amazon.in - Departments : Books, Movies, Music, Kindle, Mobiles, Cameras, Computers, Toys, Baby products, Health & Personal Care, Home & Kitchen, Pet Supplies, Sports & Outdoors, Watches, Fashion Jewellery, Luggage, Shoes & Handbags, Clothing & Accessories, Musical Instruments & Professional Audio, Office & Stationery, Car & Motorbike\"]/android.view.View[10]/android.widget.Image").click();
			System.out.println("Kindle clicked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("static-access")
	public void clickKindleEReaders()
	{
		AndroidDriverManager manager;
		try {
			manager = AndroidDriverManager.getAndroidDriverInstance();
			manager.androidDriver.findElementByXPath("//android.view.View[@content-desc=\"Kindle E-Readers \"]").click();
			System.out.println("Kindle EReaders clicked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	

}
