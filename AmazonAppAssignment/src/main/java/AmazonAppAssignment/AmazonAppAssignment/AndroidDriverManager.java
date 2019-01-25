package AmazonAppAssignment.AmazonAppAssignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidDriverManager {

	static AndroidDriver<AndroidElement> androidDriver;
	private static AndroidDriverManager androidDriverManager = null;
	private static String serverAddress = "http://0.0.0.0:4723/wd/hub";
	private static URL serverURL = null;
	
	private AndroidDriverManager() throws MalformedURLException
	{
		CapabilitiesManager capManager = CapabilitiesManager.sharedInstance();
		serverURL = new URL(serverAddress);
		androidDriver = new AndroidDriver<AndroidElement>(serverURL, capManager.capabilities);
		System.out.println("AndroidDriver initialized");
		
	}
	
	public static AndroidDriverManager getAndroidDriverInstance() throws MalformedURLException
	{
		if (androidDriverManager == null)
			androidDriverManager = new AndroidDriverManager();
		return androidDriverManager;
	}
	
	public static void waitImplicitelyFor(long seconds)
	{
		androidDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void quit()
	{
		androidDriver.quit();
	}
	
	
	
	
}
