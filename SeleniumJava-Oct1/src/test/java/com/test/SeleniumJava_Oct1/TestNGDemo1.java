package com.test.SeleniumJava_Oct1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGDemo1 {
	
	public WebDriver driver=null;
	
	@BeforeMethod
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority=-3)//It is annotation in TestNG
	public void TC1()
	{		
		System.out.println("Welcome to test case 1");
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
	
	}
	
	@Test (priority=0, groups="smoke")  
	public void TC2()
	{
	//	WebDriverManager.firefoxdriver().setup();
	//	driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com/");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
