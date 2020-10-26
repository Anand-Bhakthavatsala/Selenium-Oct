package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestAndQuiz extends BaseClass {

	public static void main(String[] args) throws Exception {
		
		// Invoke the browser
	//	invokeChromeBrowser();
		
		invokeFirefoxBrowser();
		
		//Enter the URL
		enterURL("https://www.testandquiz.com/selenium/testing.html");
		
	/*	//Identify the link
		driver.findElement(By.linkText("This is a link")).click();
		Thread.sleep(1000);//1 sec
		//to navigate back to original url
		driver.navigate().back();
		
		//To identify the text field and enter the value (action)
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Learning Automation");
		Thread.sleep(2000);
		
		//To identify the button and click
		driver.findElement(By.cssSelector("#idOfButton")).click();
		
		//To identify the radio button and click
		driver.findElement(By.xpath("//input[@id='male']")).click();
		Thread.sleep(2000);//sleep
		driver.findElement(By.xpath("//input[@id='female']")).click();
		
		//To identify the checkbox & perform click
		driver.findElement(By.className("Automation")).click();
		driver.findElement(By.className("Performance")).click();*/
		
		//To identify the dropdown boxes & perform action
		WebElement testingDropdown = driver.findElement(By.id("testingDropdown"));
		Select s1 = new Select(testingDropdown);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByValue("Database");
		Thread.sleep(2000);
		s1.selectByVisibleText("Manual Testing");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(0,500)");//scroll down to 500 pixels
		
		//button and popup window
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();//handle the popup window		
		
		//identify the source image
		WebElement from = driver.findElement(By.xpath("//img[@id='sourceImage']"));		
		WebElement to = driver.findElement(By.id("targetDiv"));
		
		Actions act = new Actions(driver);//Actions class to perform drag & drop
		act.dragAndDrop(from, to).build().perform();
		
		Thread.sleep(2000);
		//close the browser window
	//	driver.close();
		
	//	System.out.println("Script ran successfully");
	
	}

}
