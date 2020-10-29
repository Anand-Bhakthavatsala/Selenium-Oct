package SeleniumPrograms;

import org.openqa.selenium.By;

public class FrameDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeFirefoxBrowser();
		enterURL("file:///E:/Anand/Automation/html/iframpage.html");	
		
		driver.findElement(By.id("t1")).sendKeys("hi"); //enter hi value
		driver.switchTo().frame(0);//index 0
		driver.findElement(By.id("t2")).sendKeys("hello");//send the value hello
		driver.switchTo().parentFrame(); // or use defaultContent()
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).clear();//clear the text
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("testing");
		
	}

}
