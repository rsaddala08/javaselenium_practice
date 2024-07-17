package SeleniumExamples;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenshotExample {
     static WebDriver driver;
    
	public static void main(String[] args) throws IOException {
		
    	 String fileName="FacebookCreate1.jpg";
    	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venka\\eclipse-workspace\\CoreJavaTopics\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
			
		//To pass URL
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			
		File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file,new File("C:\\Users\\venka\\eclipse-workspace\\CoreJavaTopics\\Screenshots\\"+fileName));


		

	}

}
