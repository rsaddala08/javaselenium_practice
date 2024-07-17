package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		//http://demo.automationtesting.in/Register.html
		
		//To Launch WebBrowser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\eclipse-workspace\\CoreJavaTopics\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//To pass URL
		driver.get("https://www.facebook.com/");
		
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//To perform Actions
		
		/*************************Link Text***********************************/
		
		/*WebElement webTable=driver.findElement(By.linkText("WebTable"));
		
		webTable.click();*/
		
	/*************************Partial Link Text***********************************/
		/*
		WebElement practice=driver.findElement(By.partialLinkText("Celebrate"));
		
		practice.click();*/
		
	/*************************CSS selector Tag and ID***********************************/
		
		WebElement userName=driver.findElement(By.cssSelector("input#email"));
		
		userName.sendKeys("abc@gmail.com");
		
	/*************************CSS selector Tag and Other attributes***********************************/
		
		WebElement password=driver.findElement(By.cssSelector("input[type=password]"));
		
		password.sendKeys("12334556778");
		
		//Navigating new url 
	
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		//Start with(^)
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder^='First']"));
		
		firstName.sendKeys("xyz");
		
		//End with($)
		WebElement lastName=driver.findElement(By.cssSelector("input[placeholder$='Last Name']"));
		
		lastName.sendKeys("xyz1234");
		
		//Contains(*)
		WebElement email=driver.findElement(By.cssSelector("input[class*='ng-valid-email']"));
		
		email.sendKeys("xyz1234@gamil.com");
		
		}

}
