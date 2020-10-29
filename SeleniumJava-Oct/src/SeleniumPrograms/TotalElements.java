package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TotalElements extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeChromeBrowser();
		enterURL("https://www.spicejet.com/");
		
		List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@type='radio']"));
		int radiobtns = radioBtns.size();
		System.out.println("Total number of radio buttons is : "+radiobtns);
		
		for(WebElement radios:radioBtns)
		{
			System.out.println(radios.getText());
		}
		
		Thread.sleep(2000);
	//	driver.close();
		
	}

}
