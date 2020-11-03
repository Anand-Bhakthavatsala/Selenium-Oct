package com.test.SeleniumJava_Oct1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		
		// Invoking the browser using webdrivermanger
		
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://mvnrepository.com/");
	}

}
