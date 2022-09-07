package orange_hrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_read {
	public static void main(String[] arg)throws IOException {
	File path=new File("D:\\Selenium_Practice.xlsx");
	FileInputStream load=new FileInputStream(path);
	XSSFWorkbook workbook=new XSSFWorkbook(load);
	XSSFSheet sheet=workbook.getSheetAt(0);
	String Data=sheet.getRow(0).getCell(0).getStringCellValue();
	System.out.print(Data);
	
	

}
}