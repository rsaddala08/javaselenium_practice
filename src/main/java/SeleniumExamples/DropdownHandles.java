package SeleniumExamples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandles {
	
	//static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
		
		//To pass URL
		driver.get("https://www.facebook.com/");
	
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//To select day value by using select by index
		
		WebElement dayElement=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day=new Select(dayElement);
		day.selectByIndex(3);
		
		//To select month by using select by visible text 
		WebElement monthElement=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		List<WebElement>allOptions= monthElement.findElements(By.tagName("option"));
		for(WebElement ele:allOptions) {
			
			String option=ele.getText();
			
			if(option.equals("Aug")) {
				ele.click();
				break;
			}else {
				continue;
			}
			}
		
		//Select month=new Select(monthElement);
		//month.selectByVisibleText("Nov");
		
		//To select year by using select by value
		
		WebElement yearElement=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year=new Select(yearElement);
		year.selectByValue("2015");
		
		
		driver.quit();
	}
	//select[@name='birthday_day']
	
	/*public static void selectValueFromDropDown(String elementName,String OptionType, String Value) {
		
		WebElement dropdownEle=driver.findElement(By.xpath(elementName));
		Select dropdown=new Select(dropdownEle);
		
		switch (OptionType) {
		case "selectByText":
			dropdown.selectByVisibleText(Value);
			break;
		case "selectByValue":
			dropdown.selectByValue(Value);
			break;
		case "selectByIndex":
			int val=Integer.parseInt(Value);
			dropdown.selectByIndex(val);
			break;
		default:
			System.out.println("No Option is Selected");
			break;
		}
		
		
	}*/

}
