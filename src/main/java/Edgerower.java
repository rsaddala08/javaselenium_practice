import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edgerower {
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		driver.manage().window( ).maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		EdgeOptions op=new EdgeOptions();
       // op.setCapability("InPrivate", true);
         driver=new EdgeDriver(op);
         
         driver.get("https://www.google.com/");
	}

}
