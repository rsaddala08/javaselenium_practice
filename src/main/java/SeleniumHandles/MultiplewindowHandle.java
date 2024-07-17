package SeleniumHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplewindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window( ).maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("http://www.seleniumframework.com/Practiceform/");
		
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		Set<String> childIds = driver.getWindowHandles();
		
		//to convert set object to list
		
		List<String> list=new ArrayList(childIds);
		
		for(int i=1;i<=list.size();i++)
				{
			if(!parentId.equals(list))
			{
				//Switch to child window
				driver.switchTo().window(list.get(i));
				
				//perform click operation in child window page
				driver.findElement(By.xpath("//a[text()='Decision Models']")).click();
			
				//close child window
				driver.close();
			
				//Come baqck to parent window
				driver.switchTo().window(parentId);
				
				driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
				driver.quit();
				break;
			}
		}
	
	}
}
