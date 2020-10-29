package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class MultipleWindows extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeFirefoxBrowser();
		enterURL("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		System.out.println(driver.getTitle());
		
		//Identify the Help link and perform click action
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String googleAccount = it.next();
		String googleHelp= it.next();
		System.out.println(googleAccount+ "   "+ googleHelp);
		driver.switchTo().window(googleHelp);
		Thread.sleep(2000);
		driver.switchTo().window(googleAccount);
		Thread.sleep(5000);
		driver.quit();
	}

}
