package TestNgGroups;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	WebDriver driver;
   
    @BeforeTest
    public void setup(){
    	
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://www.facebook.com/");
         driver.manage().window().maximize();
    }
 

    @Test(dataProvider="loginData")
    public void testMethod(String userName , String password) throws InterruptedException{
    {
    	driver.findElement(By.name("email")).clear();
    	
    	driver.findElement(By.name("email")).sendKeys(userName);
    	
    	driver.findElement(By.xpath("//input[@id='pass']")).clear();
    	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
    }
    }
    /**
     * @return Object[][] where first column contains 'author'
     * and second column contains 'searchKey'
     */

    @DataProvider(name="loginData")
    public Object[][] setDataFromDataprovider(){
    	
    	// Create object array with 2 rows and 2 column- first parameter is row and second is //column
    	
    	Object[][] loginDetails=new Object[2][2];// Two diminsional array declare 
    	
    	//row 0, column 0
    	loginDetails[0][0]="abc@gmail.com";//username
    	
    	//row 0, col 1
    	loginDetails[0][1]="abc1234566";//password
    	
    
    	//row1, col 0
    	loginDetails[1][0]="xyz@gmail.com";
    	
    	//row 1, clomn 1
    	loginDetails[1][1]="xyz12345";
    	
    	
    return loginDetails;
    		
    }

}
