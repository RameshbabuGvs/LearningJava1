package excelreader;

import java.io.IOException;

public class ReadExceldatabyusingExcelDataconfig {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ExcelDataconfig excel= new ExcelDataconfig("F:\\Testdata3.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));

	}

}
