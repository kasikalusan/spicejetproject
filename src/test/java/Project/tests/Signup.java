package Project.tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Project.pages.signup;

public class Signup extends signup{
@Test
	public void SignUp() {
		try {
			launchBrowser("https://www.spicejet.com/");
			signup signUp=PageFactory.initElements(driver, signup.class);
			signUp.Sign();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			//signUp.selectDDByVisibleText("Mr");
			signUp.firstname("kasi");
			signUp.lastname("T");
			signUp.Date("05/14/1997");
			signUp.Mobile("6374875107");
			signUp.Mail("kaac2507@gmail.com");
			signUp.Newpass("Kasi@237");
			signUp.Cpass("Kasi@237");
			signUp.Box();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
