package SeleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\git\\Selenium-Oct\\SeleniumJava-Oct\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(username);
		System.out.println(password);

	}

}
