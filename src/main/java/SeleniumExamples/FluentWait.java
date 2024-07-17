package SeleniumExamples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait{
	static WebDriver driver;
	

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\eclipse-workspace\\CoreJavaTopics\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
			
			//Pageload time 
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
					
			//To pass URL
			driver.get("https://www.facebook.com/");
			System.out.println("Launch Parent URL:: FACEBOOK");
		
			
			//Implicitwait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement userName=driver.findElement(By.cssSelector("input#email"));
			
			userName.sendKeys("abc@gmail.com");
			
			System.out.println("Parent site closed");
			
		}
		
		/*
		 * public static void enterTextField(final String elementName,String
		 * inputValue,int timelimit) {
		 * 
		 * Wait<WebDriver> wait=new
		 * org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver) .withTimeout(25,
		 * TimeUnit.SECONDS) .pollingEvery(3, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
		 * 
		 * public WebElement apply(WebDriver driver) { return
		 * driver.findElement(By.xpath(elementName)); } });
		 * 
		 * }
		 * 
		 */
	}


