package AmazonAppAssignment.AmazonAppAssignment;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class UtilityClass {

	public MobileElement scrollToExactElement(MobileElement ele,String str) 

	{

		//Log.info("Scrolling to exact element");

		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\""+str+"\"));");
		


	}
}
