package orange_hrm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excek_Write {
	public static void main(String[]arg) throws IOException {
		File path=new File("D:\\Selenium_Practice.xlsx");
		FileInputStream load=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(load);
		XSSFSheet sheet=workbook.getSheetAt(0);
		FileOutputStream input=new FileOutputStream(path);
		sheet.createRow(0).createCell(0).setCellValue("testNg");
		workbook.write(input);
		
	}

}
