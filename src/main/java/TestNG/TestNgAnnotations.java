package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	static WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\POI Jars\\SeleniumPracties\\com.training.com\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	System.out.println("Browser Lanched---->BeforeSuite");
	}
	@AfterSuite
	public void setUpClosed()
	{
		driver.close();
		System.out.println("Browser Closed---->AfterSuite");
	}
	
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("<----BeforeTest---->");
	}
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("<----Closed AfterTest---->");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("<----BeforeClass---->");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("<----Closed AfterClass---->");
	}
	
	@BeforeMethod
	public void browserLaunch()
	{
	System.out.println("<----BeforeMethod---->");
}
	@AfterMethod
	public void finalResults()
	{
		System.out.println("<----AfterMethod---->");	
	}
	@Test(priority=1)

	public void enterUserName()
	{
		driver.findElement(By.name("email")).sendKeys("sguru3667@gmail.com");
		
	System.out.println("UserName Entered ");
	}
	@Test(priority=2)

	public void enterPassWord()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12701F0014");
				
	System.out.println("Password Entered ");
	}
	@Test(priority=3)

	public void clickLogin()
	{
		driver.findElement(By.id("loginbutton")).click();
	System.out.println("Login Button Clicked");
	}	}
