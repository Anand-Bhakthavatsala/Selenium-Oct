package com.test.SeleniumJava_Oct1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMS{
	
	@Test
	public void HRMS() throws IOException
	{
		// TODO Auto-generated method stub
		//	System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
		//webdriver manager will download the latest drivers from the location
		FileInputStream fis = new FileInputStream("E:\\eclipse-workspace\\Selenium-June-Maven\\Data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		WebDriver driver=null;
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); //upcasting
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		//	driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.get(prop.getProperty("baseurl"));//enter the url

		String title = driver.getTitle();
		System.out.println(title);		

		if(title.equals("opensource-demo"))
		{
			System.out.println("Test case pass");
		}
		else 
		{
			System.out.println("Test case failed");
		}

		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");*/

		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.name("Submit")).click();		
	}
}