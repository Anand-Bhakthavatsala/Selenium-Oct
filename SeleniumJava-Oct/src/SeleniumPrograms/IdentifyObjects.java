package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdentifyObjects extends BaseClass{

	WebDriver driver=super.driver;	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		invokeChromeBrowser();
	//	invokeFirefoxBrowser();//Open the browser
		enterURL("https://www.testandquiz.com/selenium/testing.html");// to Enter the URL	
		
		IdentifyObjects obj = new IdentifyObjects();//Creating an object
		Thread.sleep(2000); //To sleep for 2 seconds
	//	obj.driver.navigate().to("https://www.rediff.com/");
		
		/*WebElement txtfield = obj.driver.findElement(By.id("fname"));
		txtfield.sendKeys("Monica");
		*/
		
		obj.driver.findElement(By.linkText("This is a link")).click();
		obj.driver.navigate().back();
		obj.driver.navigate().
		
		Thread.sleep(2000);
		obj.driver.findElement(By.id("fname")).sendKeys("Monika");
		
		Thread.sleep(2000);
		obj.driver.close(); //Close the browser window
		System.out.println("Script executed successfully");

	}

}
