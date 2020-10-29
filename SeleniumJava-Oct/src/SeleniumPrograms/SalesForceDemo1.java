package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class SalesForceDemo1 extends BaseClass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\git\\Selenium-Oct\\SeleniumJava-Oct\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
	//	invokeChromeBrowser();
		invokeFirefoxBrowser();
		enterURL(prop.getProperty("url"));		
	
		String username = prop.getProperty("username");
		
		//Identify the username textfield
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys(prop.getProperty("password"));
		
	
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
		String error = driver.findElement(By.id("error")).getText();
		System.out.println(error);
		
		if (error.contains("Please check your username and password")) //if(true)
		{
			System.out.println("Test case failed");
		}
		else
		{
			System.out.println("Test passed");
		}
		
		Thread.sleep(3000);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile, new File("./screenshot/"+"SFLoginPage"+System.currentTimeMillis()+".png"));
		driver.close();

	}

}
