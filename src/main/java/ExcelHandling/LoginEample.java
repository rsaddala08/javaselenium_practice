package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginEample {

	public static void main(String[] args) throws IOException {
		
		//set the ChromeDriver path
        //System.setProperty("webdriver.chrome.driver","path");
		
		WebDriverManager.chromedriver().setup();
		

        //Create an object of File class to open xls file
		File file =    new File("C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Datasheet\\MySheet.xlsx");

        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //creating workbook instance that refers to .xlsx file
        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
        
        //creating a Sheet object
        XSSFSheet sheet=wb.getSheet("EmpData");
        
        //get all rows in the sheet
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
       //Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //Navigate to the URL
        driver.get("https://demoqa.com/text-box");


        //Identify the WebElements for the student registration form
        WebElement fullName=driver.findElement(By.id("userName"));
        WebElement email=driver.findElement(By.id("userEmail"));
        WebElement currAddress=driver.findElement(By.id("currentAddress"));
        WebElement perAddress=driver.findElement(By.id("permanentAddress"));
        
        WebElement submitBtn=driver.findElement(By.id("submit"));



        //iterate over all the rows in Excel and put data in the form.
        for(int i=1;i<=rowCount;i++) {
        	
            //Enter the values read from Excel in fullname,email,curraddress,peradd, sub
        	
        	fullName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            currAddress.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            perAddress.sendKeys(sheet.getRow(i).getCell(3).getStringCellValue());
            
            //Click on submit button
            
            JavascriptExecutor jse=(JavascriptExecutor)driver;
            jse.executeScript("arguments[0].click();", submitBtn);
            
            
            //submitBtn.click();
            
            //Verify the confirmation message
            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
            //create a new cell in the row at index 6
            XSSFCell cell = sheet.getRow(i).createCell(6);
            
            //check if confirmation message is displayed
            if (confirmationMessage.isDisplayed()) {
                // if the message is displayed , write PASS in the excel sheet
                cell.setCellValue("PASS");
                
            } else {
                //if the message is not displayed , write FAIL in the excel sheet
                cell.setCellValue("FAIL");
            }
            
            // Write the data back in the Excel file
            FileOutputStream outputStream = new FileOutputStream("E:\\TestData\\TestData.xls");
            wb.write(outputStream);

            //close the confirmation popup
            WebElement closebtn = driver.findElement(By.id("closeLargeModal"));
            closebtn.click();
            
            //wait for page to come back to registration page after close button is clicked
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        }
        
        //Close the workbook
        wb.close();
        
        //Quit the driver
        driver.quit();
        }
	}


