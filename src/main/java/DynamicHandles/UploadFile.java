package DynamicHandles;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	//String URL = "application URL";
	@Test
	public void testUpload() throws InterruptedException
	{
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/upload-download");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   WebElement fileUpload=driver.findElement(By.id("uploadFile"));
		   Actions act=new Actions(driver);
		   act.moveToElement(fileUpload).build().perform();
		   act.moveToElement(fileUpload).click().perform();
		   JavascriptExecutor jse=(JavascriptExecutor)driver;
			//jse.executeScript("arguments[0].click();", fileUpload);
	//	   fileUpload.sendKeys();
		
		//   fileUpload.click();
		uploadFile("C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Files\\NewDataFile.xlsx");
		Thread.sleep(2000);
	}
	
	/**
     * This method will set any parameter string to the system's clipboard.
     */
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void uploadFile(String fileLocation) {
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
}
