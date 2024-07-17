package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExcel {
	
	public static void main (String [] args) throws IOException{
		
		 //Create an object of File class to open xlsx file
        File file =    new File("filepath");

        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);

        //creating workbook instance that refers to .xlsx file
        XSSFWorkbook  wb=new XSSFWorkbook(inputStream);

        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("EmpData");
        

        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        //iterate over all the row to print the data present in each cell.
        for(int i=0;i<=rowCount;i++){
            
            //get cell count in a row
            int cellcount=sheet.getRow(i).getLastCellNum();
            
            //iterate over each cell to print its value
            System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
                
                String data=sheet.getRow(i).getCell(j).getStringCellValue().toString();
                }
            System.out.println();
        }
    }
}
