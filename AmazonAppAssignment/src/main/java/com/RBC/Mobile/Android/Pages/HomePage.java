package com.RBC.Mobile.Android.Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

public class HomePage {
	private AndroidDriver<AndroidElement> driver=null;
	private String testName="";
	private final By HAMBURGERMENU =By.xpath("//*[@text='Show Navigation Menu']");
	private final By CATEGORY =By.xpath("//*[@text='Shap by Category']");
	
	
	
	public HomePage(AndroidDriver<AndroidElement> driver, String testName) {
		this.driver=driver;
		this.testName=testName;
		
	}
	public void hambergurgerClick()
	{
		driver.findElement(HAMBURGERMENU).click();
	}

}
