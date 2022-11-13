package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataconfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public ExcelDataconfig(String excelPath) throws IOException{
		
		
		try {
			File file = new File(excelPath);
			FileInputStream fis= new FileInputStream(file);
			 wb= new XSSFWorkbook(fis);//workbook object
			
			int sheetscount = wb.getNumberOfSheets();
			System.out.println("Total no of Sheets in Workbook"  + sheetscount);
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column) {
		
		sheet=wb.getSheetAt(0);//here get the Sheet name
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		
		return data;
		
	}

	
	
	
}
