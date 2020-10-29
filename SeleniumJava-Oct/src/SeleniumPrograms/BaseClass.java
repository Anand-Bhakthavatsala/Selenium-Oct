package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver=null; //Global declaration
	String browser="firefox";
	
	static public void invokeChromeBrowser() //to invoke the chrome
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver(); //create a chrome driver object
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	static public void invokeFirefoxBrowser() //firefox browser
	{
		System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.manage().window().maximize();
	}
	
	static public void enterURL(String url) //enter the URL on the browser address-bar
	{
		driver.get(url);
	}
	
	static public void closeBrowser() //to close the browser window
	{
		driver.close();
	}

}
