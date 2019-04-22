import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CourseMock {

	public static void main(String[] args) throws FileNotFoundException
	{
		//this.filename=filename;
		FileInputStream fs = new FileInputStream(new File("output.xlsx")); //read in the excel file 
		try {
			XSSFWorkbook xs = new XSSFWorkbook(fs);
			XSSFSheet sheet=xs.getSheetAt(0);
		  //  for(Row row:sheet)
		 //   {
			Row row=sheet.getRow(1);
		    	String value=row.getCell(7).getStringCellValue();
		    	System.out.println(value);
		  //  }
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
