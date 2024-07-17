package TestNGListeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(TestNGListeners.TestNgListenerExample.class)

public class ListenersTest{
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void faceBookLogin() throws InterruptedException{
	driver.get("http://www.facebook.com/");
	
	String pageTitle="Facebook – log in or sig up";//expected value
	
	String actual=driver.getTitle();//actual value

	Assert.assertEquals(actual, pageTitle,"Title matched");
	
	Assert.assertTrue(true,"Success");
	//Assert.assertFalse(false,"Failure");
	}
	@Test(priority = 1)
	public void enterUserName() throws InterruptedException {
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	Thread.sleep(4000);
	}
	@Test(priority = 2)
	public void enterPass() throws Throwable {
		
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345677");
	Thread.sleep(4000);
	}
	@Test(priority = 3)
	public void LoginSuccess() throws InterruptedException{
	System.out.println("**********************************");
	}
	@AfterTest
	public void driverClose() {
		driver.close();
	}
	/*
	 * // Forcefully failed this test as to verify listener.
	 * 
	 * @Test public void TestToFail() {
	 * System.out.println("This method to test fail"); Assert.assertTrue(false); }
	 */
}
