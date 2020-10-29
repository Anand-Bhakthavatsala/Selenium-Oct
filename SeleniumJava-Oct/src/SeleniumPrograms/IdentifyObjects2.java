package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdentifyObjects2 extends BaseClass{

	WebDriver driver=super.driver;	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		invokeChromeBrowser();
	//	invokeFirefoxBrowser();//Open the browser
		enterURL("https://www.testandquiz.com/selenium/testing.html");// to Enter the URL	
		
		driver.close();
	}

}
