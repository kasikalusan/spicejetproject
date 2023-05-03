package Project.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project.pages.Managebook;

public class managebook extends Managebook {
	@Test
	public void manageBook() {
		launchBrowser("https://www.spicejet.com/");
		Managebook mb=PageFactory.initElements(driver, Managebook.class);
		mb.Manage("56789","kaac2507@gmail.com");
		
	}

}
