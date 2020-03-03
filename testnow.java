package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testnow {
	WebDriver driver;
	
			@BeforeMethod
			public void CheckWebDriver() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\parve\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 driver.get("https://www.facebook.com");
			 driver.manage().window().maximize();
			 
	}
			 @Test
			 public void TestBrowser() {
				 
			 
			 driver.findElement(By.id("")).clear();
			 driver.findElement(By.id("")).sendKeys("donttrythis@gmail.com");
			 driver.findElement(By.id("")).clear();
			 driver.findElement(By.id("")).sendKeys("");
			 driver.findElement(By.xpath("")).click();
			 
	}
				 
			 
			 @AfterMethod
			 public void tearDown() {
				 driver.quit();
				 
			 }
	
}
