package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	AppiumDriver driver;
	@BeforeTest
	public void setup(){
		
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "realme 9 Pro 5G");
		caps.setCapability("udid", "69aecc55"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "13");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
 	    caps.setCapability("appium:chromedriverExecutable", "C:\\Users\\Neha\\eclipse-workspace\\Appium\\Appium_Demo\\Drivers\\chromedriver.exe");
 	   
 	   URL url = new URL("http://127.0.0.1:4723/wd/hub");

       // Initialize the AndroidDriver with the provided capabilities and server URL
		  driver = new AppiumDriver(url, caps);

	}catch(Exception exp) {
		System.out.println("Cause is:" +exp.getCause());
		System.out.println("Message is:" +exp.getMessage());
		exp.printStackTrace();
		}
	}
	
	@Test
	public void SampleTest() {
		System.out.println("I am inside sample test");
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
