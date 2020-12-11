package com.test.SeleniumJava_Oct1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertVerfication {
	WebDriver driver=null;
	@Test
	public void verification() throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://learn-automation.com/");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
		
		Thread.sleep(3000);
		driver.close();
	}

}
