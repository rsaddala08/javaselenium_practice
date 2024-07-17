package SeleniumActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysExample {
	
public static void main(String[] args) {
		
        // Initialize ChromeDriver
	WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
        
        //window maximize
        driver.manage().window().maximize();
        
      //Implicitwait
      	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("#1-88 XYZ street main road ap");
        
        currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a"));

        currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
        
        // Copy the Current Address
      /*  currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("A");
        currentAddress.sendKeys(Keys.CONTROL);
        currentAddress.sendKeys("C");*/
        
        //Press the TAB Key to Switch Focus to Permanent Address
        currentAddress.sendKeys(Keys.TAB);
        
        //Paste the Address in the Permanent Address field
        WebElement permanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        
        
        permanentAddress.sendKeys(Keys.chord(Keys.CONTROL,"v"));
       
        //To perform Enter action
        
        WebElement enter=driver.findElement(By.xpath("//button[@id='submit']"));
        enter.sendKeys(Keys.chord(Keys.ENTER ));
        
      //  driver.close();

}
}
