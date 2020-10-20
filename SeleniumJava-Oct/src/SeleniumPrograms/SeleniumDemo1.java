package SeleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		
		// To open the browser		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();//create a chrome driver object

		driver.get("https://www.spicejet.com/");
		
		driver.get("https://www.google.com/");
		
	//	driver.close();
		
	}

}
