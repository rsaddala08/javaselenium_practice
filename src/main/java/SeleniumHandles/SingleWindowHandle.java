package SeleniumHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleWindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window( ).maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		
		//To get the parent window id
		String parentId = driver.getWindowHandle();
		
		System.out.println("Parent id is::"+parentId);
		
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		//To get the all opened windows/Tabs ids
		Set<String> childIds = driver.getWindowHandles();
		
		for(String child : childIds)
		{
			if(!parentId.equals(child))
			{
				//Switch to child window
				driver.switchTo().window(child);
				
				//perform click operation in child window page
				driver.findElement(By.xpath("//a[text()='Decision Models']")).click();
			
				//close child window
				driver.close();
			
				//Come back to parent window
				driver.switchTo().window(parentId);
				
				driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
				driver.quit();
				break;
			}
		
		}
	}

}
