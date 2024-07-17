package TestNgGroups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest  {
	
	WebDriver driver;
	/**
	* This function will execute before each Test tag in testng.xml
	* @param browser
	* @throws Exception
	*/
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
		
	//Check if parameter passed from TestNG is 'firefox'
	if(browser.equalsIgnoreCase("firefox")){
	//create firefox instance
	System.setProperty("webdriver.gecko.driver","Path of your gecko driver");
	//driver = new GeckoDr();
	}
	//Check if parameter passed as 'chrome'
	else if(browser.equalsIgnoreCase("chrome")){
	
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Edge")){
	//set path to Edge.exe
	System.setProperty("","Path of edge driver");
	driver = new EdgeDriver();
	}
	else{
	//If no browser is passed throw exception
	throw new Exception("Incorrect Browser");
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
	 driver.get("http://www.facebook.com/");
	 driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345677");
	Thread.sleep(4000);
	}
@AfterTest
public void browserClose() {
	driver.close();
}
}
