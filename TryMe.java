package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TryMe {
	public WebDriver driver;
	
	
         @BeforeMethod
  		 public void launchBrowser() throws InterruptedException {
	  	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\parve\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
			  
	    }
  		@DataProvider(name="TestData")
  		public Object[][] getData() {
  			
  		Object [][] data =new Object [3][2];
  		
  		data [0][0] = "user1";
  		data [0][1] = "password1";
  				
  		data [1][0] = "user2";
  		data [1][1] = "password2";	
  				
  		data [2][0] = "user3";
  		data [2][1] = "password3";
  		
  		return  data;
  			
  		}
  		@Test(dataProvider="TestData")
  		public void login(String username, String password) throws InterruptedException {
  			
  		driver.findElement(By.id("email")).clear();
  		driver.findElement(By.id("email")).sendKeys("username");
  		driver.findElement(By.id("pass")).clear();
  		driver.findElement(By.id("pass")).sendKeys("password");
  		driver.findElement(By.id("loginbutton")).click();
  		Thread.sleep(1000);
  		
		
  		}

  		@AfterMethod
  		public void tearDown() {
  			driver.close();
  		}

		}
