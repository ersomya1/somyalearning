package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {
	
	  XSSFWorkbook wb;

	public Excelfile()
	{
		File src = new File("./ApplicationTestData/testdata.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
		   wb = new XSSFWorkbook(fis);
		
		} catch (Exception e) {
		
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	
	public String getdata(int sheetindex,int row,int column)
	{
	    DataFormatter df = new DataFormatter();
	String data=    df.formatCellValue(wb.getSheetAt(sheetindex).getRow(row).getCell(column));
	//wb.getSheetAt(sheetindex).getRow(row).getCell(column).getRawValue();
		return data;
	}
	
	/*public String getdata(String sheetname,int row,int column)
	{
		String data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return data;
	}*/
}
