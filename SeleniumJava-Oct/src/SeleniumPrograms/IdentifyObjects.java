package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IdentifyObjects extends BaseClass{

	//static 	WebDriver driver; //=super.driver;	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		invokeFirefoxBrowser();
	//	invokeFirefoxBrowser();//Open the browser
		enterURL("https://www.testandquiz.com/selenium/testing.html");// to Enter the URL	
		
		IdentifyObjects obj = new IdentifyObjects();//Creating an object
		Thread.sleep(2000); //To sleep for 2 seconds
	//	obj.driver.navigate().to("https://www.rediff.com/");
		
		/*WebElement txtfield = obj.driver.findElement(By.id("fname"));
		txtfield.sendKeys("Monica");
		*/
		
		/*obj.driver.findElement(By.linkText("This is a link")).click();
		obj.driver.navigate().back();
				
		Thread.sleep(2000);
		obj.driver.findElement(By.id("fname")).sendKeys("Monika");
		
		//Identify the button object & perform click
		obj.driver.findElement(By.tagName("button")).click();
	//	Thread.sleep(2000);
		//Identify the radio button & click
		obj.driver.findElement(By.xpath("//input[@id='female']")).click();
		Thread.sleep(2000);//delay of 2 secs
		obj.driver.findElement(By.xpath("//input[@id='male']")).click();
		//Identify the checkbox & click
		obj.driver.findElement(By.className("Automation")).click();
		obj.driver.findElement(By.className("Performance")).click();
		Thread.sleep(2000);*/
		
		WebElement testing = obj.driver.findElement(By.id("testingDropdown"));
		Select testingType= new Select(testing);
		
		testingType.selectByIndex(0);
		testingType.selectByValue("Performance");
		testingType.selectByVisibleText("Manual Testing");
		testingType.selectByIndex(3);
		
		JavascriptExecutor js = (JavascriptExecutor) obj.driver;  
		js.executeScript("window.scrollBy(0,500)");//scroll down to 1000 pixels
		
		//Identify the double click button	
		Actions action = new Actions(driver);
		WebElement buttonElement = obj.driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		System.out.println("Button element "+buttonElement);		
		Thread.sleep(2000);
		//Perform double click		
		action.doubleClick(buttonElement);//Action
		
		action.moveToElement(buttonElement).doubleClick();
		
	//	obj.driver.close(); //Close the browser window
		System.out.println("Script executed successfully");

	}

}
