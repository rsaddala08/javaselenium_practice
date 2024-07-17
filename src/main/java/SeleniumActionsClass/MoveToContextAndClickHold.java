package SeleniumActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToContextAndClickHold {

	public static void main(String[] args) {

		//To Launch WebBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To pass URL
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//driver.get("http://demoqa.com/buttons");
		
		//driver.get("https://demoqa.com/buttons");
		
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Move to element
		
		WebElement moveElement=driver.findElement(By.xpath("//a[text()='WebTable']"));
		Actions action=new Actions(driver);
		action.moveToElement(moveElement).build().perform();
		
		//ClickAndHold
		
		  WebElement videoTab=driver.findElement(By.xpath("//a[text()='WebTable']"));
		  action=new Actions(driver); 
		  action.clickAndHold(videoTab).build().perform();
		  
		  
		  //Context Click
		  
			
			  WebElement context=driver.findElement(By.xpath("//a[text()='Video']"));
			  action=new Actions(driver);
			  action.contextClick(context).build().perform();
			  
			  //click()
			  WebElement homeTab=driver.findElement(By.xpath("//a[text()='Home']"));
			  action=new Actions(driver); 
			  
			  action.moveToElement(homeTab).click().perform();
			 
		 
	}

}
