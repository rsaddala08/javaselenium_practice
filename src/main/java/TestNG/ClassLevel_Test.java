package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassLevel_Test {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "R:\\POI Jars\\SeleniumPracties\\com.training.com\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.out.println("Browser Lanched");
	}
	@AfterClass
	public void setUpClosed()
	{
		driver.close();
		System.out.println("Browser Closed");
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
		driver.findElement(By.xpath("//input[@id='pa']")).sendKeys("12701F0014");
				
	System.out.println("Password Entered ");
	}
	@Test(priority=3)

	public void clickLogin()
	{
		driver.findElement(By.id("loginbutton")).click();
	System.out.println("Login Button Clicked");
	}
}
