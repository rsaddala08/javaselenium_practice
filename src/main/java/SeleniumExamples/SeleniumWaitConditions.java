package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaitConditions {
	//static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	
				
		//To pass URL
		driver.get("https://www.facebook.com/");
		System.out.println("Launch Parent URL:: FACEBOOK");
	
		driver.manage().window().maximize();
		
		//Implicitwait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
		
		Thread.sleep(5000);
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
			//	wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("abc@gmail.com");
		
		System.out.println("Entered Username");
		System.out.println("*****************************************************");
		
		WebElement createButton=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		//new WebDriverWait(driver, 10).
		//until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.click();
		
		System.out.println("Clicked Create account button");
		
		WebElement signUp=driver.findElement(By.xpath("//div[text()='Sign Up']"));
		
		//new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Sign Up']")));
		
	}
	
	/*public static void enterTextField(WebElement elementName,String inputValue,int timelimit) {
		
		new WebDriverWait(driver, timelimit).until(ExpectedConditions.visibilityOf(elementName));
		
	}
	public static void clickAction(WebElement elementName,int timelimit) {
		
		new WebDriverWait(driver, timelimit).until(ExpectedConditions.elementToBeClickable(elementName));
		
	}*/

}
