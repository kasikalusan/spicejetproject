package Project.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project.pages.Otherfunction;

public class OtherFunction extends Otherfunction{
	@Test
	public void otherFunction() {
		try {
			launchBrowser("https://www.spicejet.com/");
			Otherfunction functions=PageFactory.initElements(driver, Otherfunction.class);
			functions.Checkin("56789","kaac2507@gmail.com");
			Thread.sleep(3000);
			functions.Status();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
