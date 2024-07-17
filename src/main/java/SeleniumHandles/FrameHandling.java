package SeleniumHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	
	public static String SourceEle = "//div[@id='draggable']";
	public static String destEle ="//div[contains(@class,'droppable')]";
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		String parentID=driver.getWindowHandle();
		
		List<WebElement> iframes =driver.findElements(By.tagName("iframe"));
		
		for(int i=0;i<=iframes.size();i++)
		{
			
			
			//Approch 1: Using Frame INdex
			
		driver.switchTo().frame(i);
			
			//Approch 2: Using frame id or frame name
			//driver.switchTo().frame("demo-frame");
			
			//Approch 3: Using webelement to switch the frame
			
			/*
			 * WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			 * 
			 * driver.switchTo().frame(ele);
			 */
			 
			
			//To perform drag and Drop
			WebElement source = driver.findElement(By.xpath(SourceEle));
			WebElement dest=driver.findElement(By.xpath(destEle));
			
			Actions act=new Actions(driver);
			act.dragAndDrop(source, dest).build().perform();
			
			//Coming back to frame
			driver.switchTo().defaultContent();
			
			String header=driver.findElement(By.xpath("//h1[text()='Droppable']")).getText();
			
			if(header.equals("Droppable"))
			{
				System.out.println("Header validated Successfully");
			}
			else
			{
				System.out.println("Header Not matched");
			}
			
			break;
		}
		}

	}
