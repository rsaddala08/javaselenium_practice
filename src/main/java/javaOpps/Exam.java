package javaOpps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exam {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajess\\OneDrive - Capgemini\\Desktop\\New folder\\Documents Folder\\CoreJavaTopics\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("www.google.com");
		
	}
	

}
