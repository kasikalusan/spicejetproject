package Project.tests;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Project.pages.login;

public class LoginPage extends login{
	@Test
	public void loginpage() {
		try {
			launchBrowser("https://www.spicejet.com/");
			login lp=PageFactory.initElements(driver, login.class);
			lp.Log();
			lp.Mobile("6374875107");
			lp.Pass("Kasi@237");
			lp.Login();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
	}

}
