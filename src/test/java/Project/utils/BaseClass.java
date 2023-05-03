package Project.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver = null;

	public void launchBrowser(String url) {

		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(url);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while launching Browser");
		}
  }
	 @AfterTest
	  public void close() {
		  driver.close();
	  }
}	
