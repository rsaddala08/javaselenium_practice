package SeleniumActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		//To Launch WebBrowser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//To pass URL
		
		driver.get("http://demoqa.com/buttons");
		
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Double click action
		
		WebElement doubleEle=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleEle).build().perform();
		
		//Click
		
		WebElement clickEle=driver.findElement(By.xpath("//button[text()='Click Me']"));
		action.moveToElement(clickEle).click().perform();
		
		//click and hold
		
		WebElement clickAndHold=driver.findElement(By.xpath("//span[text()='Text Box']"));
		
		action.clickAndHold(clickAndHold).build().perform();
		
		
		
		//Drog and Drop
		WebElement intrEle=driver.findElement(By.xpath("//div[text()='Interactions']"));
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)", intrEle);
		
		intrEle.click();
		
		WebElement dropEle=driver.findElement(By.xpath("//span[text()='Droppable']"));
		
		jse.executeScript("window.scrollBy(0,1000)", dropEle);
		
		dropEle.click();
		
		
		WebElement sourceElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destElement=driver.findElement(By.xpath("//div[@id='droppable']"));

		action.dragAndDrop(sourceElement,destElement).build().perform();

}

}
