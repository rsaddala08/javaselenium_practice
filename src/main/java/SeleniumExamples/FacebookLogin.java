package SeleniumExamples;

import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
	
		try {
		//File f = new File("C:\\Users\\rajess\\OneDrive - Capgemini\\Desktop\\New folder\\Documents Folder\\CoreJavaTopics\\Drivers\\phantomjs.exe");
		//System.setProperty("phantomjs.binary.path",f.getAbsolutePath());
		
		WebDriverManager.edgedriver().setup();	
		WebDriver driver=new EdgeDriver();
				
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		 WebElement userName=driver.findElement(By.name("email"));
		 userName.sendKeys("xyz@gmail.com");
		 
		 WebElement pass=driver.findElement(By.name("pass"));
		 pass.sendKeys("xyz@12345");
		
		 WebElement login=driver.findElement(By.name("login"));
		 login.click();

		 
		 driver.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
}

}
