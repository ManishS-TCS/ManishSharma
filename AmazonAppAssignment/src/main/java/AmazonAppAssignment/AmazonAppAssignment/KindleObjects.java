package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;

public class KindleObjects {
	
	@SuppressWarnings("static-access")
	public void clickFirstKindleObject()
	{
		
		try {
			AndroidDriverManager manager = AndroidDriverManager.getAndroidDriverInstance();
			manager.androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.widget.ListView[1]/android.view.View[1]").click();
			System.out.println("Kindle object clicked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
