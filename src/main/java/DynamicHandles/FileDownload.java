package DynamicHandles;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownload {
	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	
		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", "\\Users\\rajess\\OneDrive - Capgemini\\Documents\\CoreJavaTopics\\Files");
		chromeOptions.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("downloadButton")).click();

		System.out.println("File downloaded");
		
		//Download file in firefox browser
		
		//By using firefox profile to download any file in the browser
		
		  FirefoxProfile firefoxProfile=new FirefoxProfile();
		  firefoxProfile.setPreference("browser.download.manager.showWhenStarting",  false);
		  firefoxProfile.setPreference("browser.download.dir","C:\\Users\\rajess\\eclipse-workspace\\javaselenium\\Files\\");
		  firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",  "application/pdf");
		 
		//WebDriver driver=new FirefoxDriver(firefoxProfile); 
		 

		//Using Robot class
		/*
		 * public void fileDownload() { Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_TAB);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER); }
		 * 
		 */
	}

}
