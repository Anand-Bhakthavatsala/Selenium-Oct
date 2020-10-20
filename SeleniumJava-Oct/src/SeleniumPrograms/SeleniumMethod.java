package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethod {

	static ChromeDriver driver=null;
	public static void main(String[] args) {
		
		SeleniumMethod sm = new SeleniumMethod(); //creating the object
		sm.invokeChromeBrowser();//calling the method
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //maximize the browser window
		
	//	driver.get("https://www.google.com/");//enter the URL using get method
		sm.enterURL("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement textfield = driver.findElement(By.name("q")); //Identify the web-element/object
				
		textfield.sendKeys("Selenium automation");//Action
		textfield.sendKeys(Keys.RETURN);//Keyboard action
		System.out.println(driver.getTitle());
	
		try {
			Thread.sleep(3000); //2000 millisecond is 2 seconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();//Close method will close the browser
	}	
	
	public void invokeChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver = new ChromeDriver(); //create a chrome driver object
	}
	
	public void enterURL(String url)
	{
		driver.get(url);
	}
	

}
