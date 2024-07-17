package SeleniumExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {
				//To Launch WebBrowser
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				//To pass URL
				driver.get("https://www.google.com/");
				
				System.out.println("Launch Parent URL:: GOOGLE");
			
				//To maximize the browser window
				driver.manage().window().maximize();
				
				//Implicitwait
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
				
				//Navigate to new url 
				System.err.println("Launch Child URL:: DEMO SITE");
				
				driver.navigate().to("https://demoqa.com/elements");
								
				//Navigate back to default browser
				
				System.out.println("Navigate back to Google page");
				
				driver.navigate().back();
				
				//Forword to DEMO site
				
				System.err.println("Forword to tools qa Demosite");
				
				driver.navigate().forward();
				
				//To refresh the page
				
				System.out.println("Refresh Demosite");
				
				driver.navigate().refresh();
				
				
	}

}
