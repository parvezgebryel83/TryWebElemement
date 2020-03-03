package Testing;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("this is working from test");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\parve\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
  }

}
