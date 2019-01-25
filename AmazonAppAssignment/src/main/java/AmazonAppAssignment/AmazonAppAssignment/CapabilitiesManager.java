package AmazonAppAssignment.AmazonAppAssignment;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesManager {

	DesiredCapabilities capabilities;
	private static CapabilitiesManager capabilityManager = null;
	
	private CapabilitiesManager()
	{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "samsung note 4");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("noReset", true);
		System.out.println("Capabilities are initalized");
	}
	
	public static CapabilitiesManager sharedInstance()
	{
		if (capabilityManager == null)
		capabilityManager = new CapabilitiesManager();
		return capabilityManager;
				
	}
}
