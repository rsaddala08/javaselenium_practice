package SeleniumActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsUsingActions {
	
public static void main(String[] args) {
		
	try {
        // Initialize ChromeDriver
	WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        //window maximize
        driver.manage().window().maximize();
        
      //Implicitwait
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        //Create object of the Actions class
        Actions actions = new Actions(driver);
       
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        
        
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
         // Select the Current Address using CTRL + A
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        
       /* actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();*/
        
        Thread.sleep(4000);
        
        
        // Copy the Current Address using CTRL + C
        
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        
        Thread.sleep(4000);
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB).build().perform();
      
        //Paste the Address in the Permanent Address field using CTRL + V
        Thread.sleep(4000);
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(4000);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
