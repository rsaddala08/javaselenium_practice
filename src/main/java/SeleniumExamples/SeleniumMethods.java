package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		//To Launch WebBrowser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\eclipse-workspace\\CoreJavaTopics\\Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//To maximize the browser window
				driver.manage().window().maximize();
				
				//To pass URL
				driver.get("http://demo.automationtesting.in/Register.html");
				
				//Implicitwait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Get page title
				
				String pageTitle=driver.getTitle();
				
				System.out.println("Page Title is::"+pageTitle);
				
				//get text from the application
				
				WebElement textEle=driver.findElement(By.xpath("//h1[contains(text(),'Automation')]"));
				
				String headerText=textEle.getText();
				
				if(headerText.trim().equals("Automation Demo Site".trim())) {
				
				System.out.println("Page Text is::"+headerText);
				}
				
				//Get current url
				
				String url=driver.getCurrentUrl();
				
				System.out.println("Page URL is::"+url);
				
				//Get current url
				
				String source=driver.getPageSource();
				
				//System.out.println("Page source is::"+source);
				
				
	}

}
