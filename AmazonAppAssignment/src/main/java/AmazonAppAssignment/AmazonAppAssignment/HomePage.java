package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;

public class HomePage {
	
	@SuppressWarnings("static-access")
	public void clickHamburgerMenuButton()
	{
		try {
			AndroidDriverManager manager = AndroidDriverManager.getAndroidDriverInstance();
			manager.androidDriver.findElementById("in.amazon.mShop.android.shopping:id/action_bar_burger_icon").click();
			System.out.println("Menu clicked");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
