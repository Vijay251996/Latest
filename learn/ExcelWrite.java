package learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelWrite {

    @Test
	public void basics() throws IOException
	{
    	XSSFWorkbook wb=new XSSFWorkbook();
    	XSSFSheet sh= wb.createSheet("Sheet1");
    	Row r0=sh.createRow(0);
    	Cell c0=r0.createCell(0);
    	c0.setCellValue("Vijay");
    	
    	File file=new File("C:\\Users\\user\\git\\Latest\\Learning\\TestData.xls");
    	FileOutputStream fis= new FileOutputStream(file);
    	wb.write(fis);
    	
    	
    	
	}
}
