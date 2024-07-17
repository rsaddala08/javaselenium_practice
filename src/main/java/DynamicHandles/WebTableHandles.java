package DynamicHandles;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandles {

	public static String tableXpath = "//table[@class='dataTable']";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// To find table path
		WebElement tableEle = driver.findElement(By.xpath(tableXpath));

		// To get no.of rows from the table using table reference object

		List<WebElement> rows = tableEle.findElements(By.tagName("tr"));

		int rowCount = rows.size();
		System.out.println("Row count is::" + rowCount);

		for (int i = 1; i <= rowCount; i++) {

			// To get no.of columns from the row using rows reference object
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));

			int columnCount = columns.size();
			System.out.println("Column count is::" + columnCount);

			for (int j = 0; j <= columns.size() - 1; j++) {

				String val = columns.get(j).getText();
				System.out.println(val);
				if (val.equals("A")) {

					// columns.get(0).click();

					// columns.get(j).sendKeys("test");

					System.out.println("Company Name has been matched" + val);
					break;
				} else {
					continue;
				}
			}
			break;
		}
		driver.close();
	}

}
