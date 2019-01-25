package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;

import mx4j.log.Log;

import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class KindleObjectDetails {

	public void scrollToInStockElement()
	{
		AndroidDriverManager manager;
		try {
			manager = AndroidDriverManager.getAndroidDriverInstance();
			MobileElement sourcePage = (MobileElement) manager.androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout");			
			String checkAvailability = ("add-to-cart-button"); 

			UtilityClass scroll = new UtilityClass();
			MobileElement addToCartBtn = scroll.scrollToExactElement(sourcePage, checkAvailability);

			if(addToCartBtn.isDisplayed())
			{
				System.out.println("Element found");
				sourcePage.click();
			}
			else
			{
				System.out.println("Element not found");

			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
