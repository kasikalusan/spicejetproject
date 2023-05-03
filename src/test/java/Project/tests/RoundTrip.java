package Project.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project.pages.Roundtrip;

public class RoundTrip extends Roundtrip {
	@Test
	public void roundTrip() {
		try {
			launchBrowser("https://www.spicejet.com/");
			Roundtrip trip=PageFactory.initElements(driver, Roundtrip.class);
			trip.Round();
			
			Thread.sleep(5000);
			trip.F1("kasi");
			trip.L1("T");
			trip.M1("6374875107");
			trip.E1("kaac2507@gmail.com");
			trip.C1("chennai");
			trip.primary("12345");
			Thread.sleep(5000);
			trip.F3("lingam");
			trip.L3("T");
			trip.M3("9750333883");
			trip.Id2("67890");
			Thread.sleep(5000);
			trip.next();
			Thread.sleep(3000);
			//trip.Noti();
			//Thread.sleep(5000);
			
			trip.Food();
			//trip.Seat();
			//Thread.sleep(3000);
			Thread.sleep(3000);
			trip.nextpage();
			Thread.sleep(3000);
			trip.cardno("1234567898765432");
			Thread.sleep(3000);
			trip.Cardname("kasi.T");
			Thread.sleep(000);
			trip.Cvv("233");
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
