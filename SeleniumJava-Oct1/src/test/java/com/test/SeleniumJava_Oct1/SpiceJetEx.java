package com.test.SeleniumJava_Oct1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpiceJetEx {
	public WebDriver driver=null;
	@BeforeMethod
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void spicejet() throws InterruptedException
	{
		driver.navigate().to("https://www.spicejet.com/");
		
		//identify the object
		WebElement box1 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		
				
		
		System.out.println("Whether selected "+box1.isSelected());//boolean value
		Thread.sleep(3000);
		
		driver.close();
	}
	

}
