package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		
		// To open the browser		
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //create a chrome driver object
			
	/*	System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); //create a Firefox driver object
		*/
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");//enter the URL using get method
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement textfield = driver.findElement(By.name("q")); //Identify the web-element/object
				
		textfield.sendKeys("Selenium automation");//Action
		textfield.sendKeys(Keys.RETURN);//Keyboard action
	
		try {
			Thread.sleep(3000); //2000 millisecond is 2 seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();//Close method will close the browser
	}	

}
