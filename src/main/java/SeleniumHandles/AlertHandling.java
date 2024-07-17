package SeleniumHandles;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args){
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window( ).maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.get("https://demoqa.com/alerts");
		
		//To perform accept() method to click OK button
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]")).click();
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
		//To perform dismiss() method to click Cancel button
		
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
		
		Alert alert1=driver.switchTo().alert();
		
		alert1.dismiss();
		
		
		//To Enter Text into alert testbox using sendkeys() Method
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Alert alert2=driver.switchTo().alert();
		
		alert2.sendKeys("Popup Text should be entered!!");
		
		alert2.accept();
		
		
		//To get text from alert box using getText() Method
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		Alert alert3=driver.switchTo().alert();
		
		String text=alert3.getText();
		
		System.out.println(text);
		
		if(text.equals("Please enter your name"))
		{
			System.out.println("Popup text should be matched::"+text);
		}
		}
	}
	


