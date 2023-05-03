package Project.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Project.pages.Booking1;

public class booking1 extends Booking1 {
@Test
	public void book() {
		try {
			launchBrowser("https://www.spicejet.com/");
			Booking1 Book=PageFactory.initElements(driver, Booking1.class);
			Book.From();
			
			Thread.sleep(5000);
			Book.F1("kasi");
			Book.L1("T");
			Book.M1("6374875107");
			Book.E1("kaac2507@gmail.com");
			Book.C1("chennai");
			Book.primary("12345");
			Thread.sleep(5000);
			Book.F3("lingam");
			Book.L3("T");
			Book.M3("9750333883");
			Book.Id2("67890");
			Thread.sleep(5000);
			Book.next();
			
			Thread.sleep(3000);
			Book.Food();
			
			Thread.sleep(3000);
			Book.after();
			Thread.sleep(3000);
			Book.cardno("1234567898765432");
			Thread.sleep(3000);
			Book.Cardname("kasi.T");
			Thread.sleep(000);
			Book.Cvv("233");
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
