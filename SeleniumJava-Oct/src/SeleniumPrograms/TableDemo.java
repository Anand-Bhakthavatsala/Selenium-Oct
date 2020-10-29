package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		invokeFirefoxBrowser();
		enterURL("http://demo.guru99.com/test/web-table-element.php");
		
		//Total number of columns
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Columns : "+columns.size());//Total columns 5
		
		//Print the headers
		for (WebElement header:columns)
		{
			System.out.println(header.getText());//To print the text of all the header columns
		}
		
		//To find the total number of rows/records
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Total number of rows/records in the table : "+rows.size());
		
		//To find the cell value in a table		
		WebElement cell =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[3]"));
		System.out.println(cell.getText());
		
		List<WebElement> recordtwenty = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[20]/td"));
		
		for(WebElement rec: recordtwenty)
		{
			System.out.print("   "+rec.getText());
		}
	}

}
