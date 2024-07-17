package TestNgGroups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethods {
	
	
static WebDriver driver;
	
	@BeforeSuite
	public void browserSetUp(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	System.out.println("Browser Lanched---->BeforeSuite");
	}
	
	@AfterSuite
	public void setUpClosed()
	{
		driver.close();
		System.out.println("Browser Closed---->AfterSuite");
	}
	
	@Test(priority=1)

	public void enterUserName()
	{
		driver.findElement(By.name("email")).sendKeys("sguru3667@gmail.com");
		
	System.out.println("UserName Entered ");
	}
	@Test(dependsOnMethods ="enterUserName")

	public void enterPassWord()
	{
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345456");
				
	System.out.println("Password Entered ");
	}
	@Test(dependsOnMethods = "enterPassWord")

	public void clickLogin()
	{
		driver.findElement(By.xpath("//button[@name='login']")).click();
	System.out.println("Login Button Clicked");
	}

	/*
	 * @Test(pri) public void clickCreateAccount() {
	 * System.out.println("Create Account"); }
	 */
	
	
}
