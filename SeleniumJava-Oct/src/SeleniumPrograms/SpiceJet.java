package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet extends BaseClass {

	public static void main(String[] args) throws Exception {
		// Call the Base Class 
		invokeChromeBrowser();//To invoke chrome browser
	//	invokeFirefoxBrowser();
		enterURL("https://www.spicejet.com/");
		
		//To select the currency values from the dropdown window
		WebElement c = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency = new Select(c);
		Thread.sleep(2000);
		currency.selectByValue("USD");
		Thread.sleep(1000);
		currency.selectByIndex(2);
		Thread.sleep(1000);
		currency.selectByVisibleText("AED");
		
		//Identify the passenger & perform action
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	
		WebElement adult1 = driver.findElement(By.name("ctl00$mainContent$ddl_Adult"));
		Select adult = new Select(adult1);
		adult.selectByValue("5");
		Thread.sleep(1000);
		adult.selectByVisibleText("9");//NoSuchElementException
		
		//Check the family & friends checkbox
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		
		//Select from city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Hyderabad (HYD)')]")).click();
		Thread.sleep(2000);
		
		//Select the TO city
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		
		Thread.sleep(2000);
		//Select the current date picker
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		
		//To click on Search button
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
	/*	Thread.sleep(2000);
		closeBrowser();*/
		
		
		
	}

}
