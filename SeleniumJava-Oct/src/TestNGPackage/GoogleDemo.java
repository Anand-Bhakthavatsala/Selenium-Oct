package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDemo {
	WebDriver driver=null;
	String browser="chrome";
	
	@Test (priority=1,invocationCount=3)//1
	public void google()
	{			
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
		Assert.assertEquals(actualTitle,expectedTitle,"Test executed");
	}
	
	@Test (priority=0,invocationCount=2)//2
	public void spicejet()
	{
		driver.get("https://www.spicejet.com/");
	}
	
	@BeforeClass //TestNG Annotation
	public void invokeBrowser()
	{
		System.out.println("Before method");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "c:/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
