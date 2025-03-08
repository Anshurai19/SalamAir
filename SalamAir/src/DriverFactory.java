import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
public WebDriver createDriver() {
         
        WebDriver driver = new ChromeDriver();
       

        return driver; 
    }
public ArrayList<String> getData (String para) throws IOException
{
	ArrayList<String> a= new ArrayList<String>();  
	FileInputStream fis = new FileInputStream("C:\\Users\\user\\git\\repository\\SalamAir\\DataFiles\\Requirments.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	int sheets = workbook.getNumberOfSheets();
	
	for (int i=0;i<sheets;i++)
	{
		if (workbook.getSheetName(i).equalsIgnoreCase("Data"))
		{
			XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			Row firstrow = rows.next();
			
			Iterator<Cell> cel = firstrow.cellIterator();
			int k = 0;
			int coloumn = 0;
			while(cel.hasNext())
			{
				Cell value =cel.next();
				if (value.getStringCellValue().equalsIgnoreCase("Requirment"))
				{
					coloumn =k;
							}
				k++;
			}
			System.out.println(coloumn);	
				
			
			while(rows.hasNext()) {
			//rows.next();
			Row r = rows.next();
			if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(para))
			{
			Iterator<Cell> cv =r.cellIterator();
			while(cv.hasNext()) 
				{
				Cell c = cv.next();
				if(c.getCellType()==CellType.STRING) {
				a.add(c.getStringCellValue());}
				
				else {
					a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
				}
				}
			}
			}
			
		}
		//return a;

	}
	System.out.println("Data retrieved: " + a); 
	return a;   
	
	
	
}
	
}
