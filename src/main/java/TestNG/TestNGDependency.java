package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDependency {

	static WebDriver driver;
	
	@BeforeSuite
	public void browserSetUp(){
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.stqatools.com");
	driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
	System.out.println("Browser Lanched---->BeforeSuite");
	}
	
	@AfterSuite
	public void setUpClosed()
	{
		driver.close();
		System.out.println("Browser Closed---->AfterSuite");
	}
	
	@BeforeTest
	public void selectDemoSite(){
	List<WebElement> element = driver.findElements(By.xpath("//ul[@id='primary-menu']/li//a"));
	for (WebElement header : element) {
		if (header.getText().trim().equals("Demo")) {
			header.click();
			System.out.println("<----BeforeTest---->");
		break;
		} else {
	
			continue;
		}
	}
	}
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("<----Closed AfterTest---->");
	}
	@Test(priority=1)
	public void enterChildName()
	{
	driver.findElement(By.xpath("//input[@name='studentname']")).sendKeys("Akhila");
	System.out.println("<----Entered Student Name---->");
	}
	@Test(dependsOnMethods = "enterChildName")
	public void enterFatherName()
	{
	driver.findElement(By.xpath("//input[@name='fatherna']")).sendKeys("raj");
	System.out.println("<----Entered Father Name---->");
	
	}
	
	@Test(dependsOnMethods = "enterFatherName")
	public void postalAddress()
	{
	driver.findElement(By.xpath("//input[@name='paddress']")).sendKeys("raj");
	System.out.println("<----Entered Postal Address---->");
	}
	@Test(priority = 4, dependsOnMethods = "postalAddress")
	public void premanentAddress()
	{
	driver.findElement(By.xpath("//input[@name='personaladdress']")).sendKeys("raj");
	System.out.println("<----Entered Premanent Address---->");
	}
	@Test(dependsOnMethods = "enterChildName")
	public void selectGender()
	{
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	System.out.println("<----Selected Gender---->");
	}
		}
	

