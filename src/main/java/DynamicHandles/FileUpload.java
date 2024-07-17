package DynamicHandles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws Throwable {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demoqa.com/upload-download");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   WebElement fileUpload=driver.findElement(By.xpath("//input[@type='file']"));
		   
	     fileUpload.sendKeys("C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Files\\NewDataFile.xlsx");
		   
		   System.out.println("File uploaded");
			
			/*
			 * Actions act=new Actions(driver);
			 * act.moveToElement(fileUpload).build().perform();
			 * act.moveToElement(fileUpload).click().perform();
			 * 
			 * //How many ways we can upload a file //1. By using selenium sendKeys() method
			 * //2. By using robot class //open upload window
			 * 
			 * // WebElement
			 * fileUpload=driver.findElement(By.xpath("//input[@type='file']")); //
			 * fileUpload.click(); //put path to your image in a clipboard StringSelection
			 * ss = new StringSelection(
			 * "C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Files\\NewDataFile.xlsx"
			 * ); Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			 * clipboard.setContents(ss, null);
			 * 
			 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			 * 
			 * //imitate mouse events like ENTER, CTRL+C, CTRL+V Robot robot = new Robot();
			 * robot.delay(250); robot.keyPress(KeyEvent.VK_ENTER);
			 * robot.keyRelease(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_CONTROL);
			 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
			 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
			 * robot.delay(90); robot.keyRelease(KeyEvent.VK_ENTER); robot.delay(250);
			 * 
			 */			 
		   //3. By using AutoIT ---> third party tool
	}

}
