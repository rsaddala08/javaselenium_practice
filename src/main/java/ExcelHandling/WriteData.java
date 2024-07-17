package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Throwable {
		//Create an object of File class to open xlsx file
		File file =    new File("filepath");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xls file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //creating a Sheet object using the sheet Name
        XSSFSheet sheet=wb.getSheet("EmpData");
        
        //Create a row object to retrieve row at index 3
        XSSFRow row8=sheet.createRow(8);
        
        //create a cell object to enter value in it using cell Index
        row8.createCell(0).setCellValue("XYZZZZZ");
        row8.createCell(1).setCellValue("Emp@gmail.com");
        row8.createCell(2).setCellValue("bgl");
        row8.createCell(3).setCellValue("AP");
       
        //write the data in excel using output stream
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Datasheet\\MySheet.xlsx");
        wb.write(outputStream);
        wb.close();

	}

}
