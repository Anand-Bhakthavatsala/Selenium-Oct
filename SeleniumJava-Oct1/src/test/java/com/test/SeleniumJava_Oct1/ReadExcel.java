package com.test.SeleniumJava_Oct1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	FileInputStream fis=null;
	XSSFWorkbook workbook;
	static XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	@Test
	public void read() throws IOException
	{
		//This is to identify the excel file location
		fis = new FileInputStream("E:/Anand/Automation/AutomationData.xlsx");
		
		//Identify the excel file
		workbook = new XSSFWorkbook(fis); //colletion of sheets
		sheet = workbook.getSheetAt(0);//getting the sheet number
		row = sheet.getRow(6);//Row is a collection of cells
		cell= row.getCell(1); //referring to 5th row & 2nd column
		
		System.out.println(cell);
		
		//No of rows
		System.out.println("Rows "+ sheet.getPhysicalNumberOfRows());
		int row1 = sheet.getPhysicalNumberOfRows();
		//No of columns
		System.out.println("Columns "+sheet.getRow(0).getLastCellNum());
		int col = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row1;i++) //Rows
		{
			for(int j=0;j<col;j++) //column
			{
				System.out.print(getCellDataString(i,j)+"  ");
			}
			System.out.println();
		}
		
		
		//Write the data on a particular cell
		cell.setCellValue("T-20,Dubai");
		FileOutputStream fos = new FileOutputStream("E:/Anand/Automation/AutomationData.xlsx");
		workbook.write(fos);	
		
	}
	
	public static String getCellDataString(int row, int col)
	{
		String celldata=null;		
		try {
			
			celldata = sheet.getRow(row).getCell(col).getStringCellValue();
			//System.out.println("Cell data : "+ celldata);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return celldata;
	}

}
