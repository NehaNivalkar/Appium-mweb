package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tests extends BaseClass{

	@Test
	public void testOne() {
	driver.get("http://google.com");
	driver.get("http://www.google.com");
	System.out.println("URL opened");

	WebElement src = driver.findElement(By.className("gLFyf"));
		src.sendKeys("Appium");
		src.sendKeys(Keys.ENTER);
		System.out.println("Completed testOne");
		
}
}
