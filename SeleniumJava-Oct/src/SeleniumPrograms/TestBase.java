package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		invokeChromeBrowser();
		enterURL("https://www.testandquiz.com/selenium/testing.html");
		
	//	driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		WebElement testing = driver.findElement(By.id("testingDropdown"));
		Select testingType= new Select(testing);
		
		testingType.selectByIndex(0);
		testingType.selectByValue("Performance");
		Thread.sleep(2000);
		testingType.selectByVisibleText("Manual Testing");
		Thread.sleep(2000);
		testingType.selectByIndex(3);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,500)");
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();;
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		//Identify the double click button	
		Actions action = new Actions(driver);
		WebElement buttonElement = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
		System.out.println("Button element "+buttonElement);		
		Thread.sleep(2000);
		//Perform double click		
		action.doubleClick(buttonElement);//Action
		driver.switchTo().alert().accept();
	}

}
