package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = null;
		FileOutputStream outputStream1 = null;
		// Create an object of File class to open xlsx file
		File file = new File("C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Datasheet\\Demo.xlsx");

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("EmpData");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		// iterate over all the row to print the data present in each cell.
		for (int i = 1; i <= rowCount; i++) {
			if (sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase("NO")) {
				String data = sheet.getRow(i).getCell(1).getStringCellValue().toString();
				// data to be enter
			 sheet.getRow(i).createCell(0).setCellValue("Yes");
				break;
			}
			if (i == 4) {
				for (int i1 = 1; i1 <= i; i1++) {
					sheet.getRow(i1).createCell(0).setCellValue("NO");
					outputStream = new FileOutputStream(file);
					wb.write(outputStream);
				}
				outputStream.close();
				for (int j = 1; j <= i; j++) {
					if (sheet.getRow(j).getCell(0).getStringCellValue().equals("NO")) {
						String data = sheet.getRow(j).getCell(1).getStringCellValue().toString();
						// data to be enter
						sheet.getRow(j).createCell(0).setCellValue("Yes");
						break;
					}
				}
				break;
			}
		}
		outputStream = new FileOutputStream(file);
		wb.write(outputStream);
		wb.close();
		}
}
