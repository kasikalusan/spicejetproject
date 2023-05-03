package Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import Project.utils.BaseClass;

public class Roundtrip  extends BaseClass{
	

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement round;
	

	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	
	@FindBy(xpath="//div[text()='MAA']")
	WebElement Chennai;
	@FindBy(xpath="//div[text()='DEL']")
	WebElement delhi;
	@FindBy(xpath="//div[text()='5']")
	WebElement date;
	@FindBy(xpath="//div[text()='8']")
	WebElement date1;
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passenger;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passenger1;
	@FindBy(xpath="//div[text()='Students']")
	WebElement student;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement search;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[2]")
	WebElement box;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement conti;
	
	//@FindBy(xpath="(//div[@data-focusable='true'])[49]")
	//WebElement rflight;
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement cont;
	
	

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement  f1;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement  l1;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement  m1;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement  e1;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement  c1;
	
	//@FindBy(xpath="//div[text()='Retain my details for the next visit.']")
	//WebElement  b1;
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'])[2]")
	WebElement  b2;
	//@FindBy(xpath="//div[text()='I have a GST number (optional)']")
	//WebElement  b3;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	WebElement  b4;
	/*
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement  f2;
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement  l2;
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement  m2;
	*/
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement  id1;
	
	@FindBy(xpath="//div[text()='Next']")
	WebElement  p2;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement  f3;
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement  l3;
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement  m3;
	@FindBy(xpath="(//input[@type='text'])[9]")
	WebElement  id2;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement  con;
	
	@FindBy(id="at_addon_close_icon")
	WebElement noti;
	
	@FindBy(xpath="//div[@data-testid='bookingFlow-seats-add-cta']")
	WebElement seat;
	@FindBy(xpath="(//div[text()='9D'])[1]")
	WebElement s1;
	@FindBy(xpath="(//div[text()='9E'])[1]")
	WebElement s2;
	@FindBy(xpath="(//div[text()='10C'])[1]")
	WebElement s3;
	@FindBy(xpath="(//div[text()='10B'])[1]")
	WebElement s4;
	@FindBy(xpath="(//div[text()='11B'])[1]")
	WebElement s5;
	@FindBy(xpath="(//div[text()='11C'])[1]")
	WebElement s6;
	@FindBy(xpath="(//div[text()='12C'])[1]")
	WebElement s7;
	@FindBy(xpath="(//div[text()='12B'])[1]")
	WebElement s8;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement d1;
	
	@FindBy(xpath="//div[@data-testid='bookingFlow-meals-add-cta']")
	WebElement food;
	@FindBy(xpath="(//div[text()='ADD'])[7]")
	WebElement food1;
	@FindBy(xpath="(//div[text()='Mr. Lingam T'])[1]")
	WebElement lingam1;
	@FindBy(xpath="(//div[text()='ADD'])[6]")
	WebElement food2;
	@FindBy(xpath="(//div[text()='Mr. Kasi T'])[2]")
	WebElement kasi2;
	@FindBy(xpath="(//div[text()='ADD'])[8]")
	WebElement food3;
	@FindBy(xpath="(//div[text()='Mr. Lingam T'])[2]")
	WebElement lingam2;
	@FindBy(xpath="(//div[text()='ADD'])[5]")
	WebElement food4;
	@FindBy(xpath="(//div[text()='Mr. Kasi T'])[3]")
	WebElement kasi3;
	@FindBy(xpath="(//div[text()='ADD'])[6]")
	WebElement food5;
	@FindBy(xpath="(//div[text()='Mr. Lingam T'])[3]")
	WebElement lingam3;
	@FindBy(xpath="(//div[text()='ADD'])[7]")
	WebElement food6;
	@FindBy(xpath="(//div[text()='Mr. Kasi T'])[4]")
	WebElement kasi4;
	@FindBy(xpath="(//div[text()='ADD'])[9]")
	WebElement food7;
	@FindBy(xpath="(//div[text()='Mr. Lingam T'])[4]")
	WebElement lingam4;
	@FindBy(xpath="(//div[text()='ADD'])[5]")
	WebElement food8;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-15bsvpr r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement d2;
	
	
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement co1;
	
	@FindBy(xpath="//input[@class='card_number']")
	WebElement card;
	@FindBy(xpath="//input[@class='name_on_card']")
	WebElement cardname;
	@FindBy(xpath="//input[@class='card_exp_month']")
	WebElement month;
	@FindBy(xpath="//input[@class='card_exp_year']")
	WebElement year;
	@FindBy(xpath="//input[@class='security_code']")
	WebElement cvv;
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	WebElement proceed;
	

	public void Round() {
		try {
			round.click();
			from.click();
			Chennai.click();
			delhi.click();
			date.click();
			date1.click();
			passenger.click();
			adult.click();
			passenger1.click();
			student.click();
			search.click();
			Thread.sleep(3000);
			box.click();
			conti.click();
			Thread.sleep(5000);
			//rflight.click();
			cont.click();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	public void F1(String fn) {
		f1.sendKeys(fn);
	}
	public void L1(String ln) {
		l1.sendKeys(ln);
	}
	public void M1(String mn) {
		m1.sendKeys(mn);
	}
	public void E1(String m) {
		e1.sendKeys(m);
	}
	public void C1(String cn) {
		c1.sendKeys(cn);
		b2.click();
	}
	public void primary(String id) {
		try {
			b4.click();
			Thread.sleep(3000);
			id1.sendKeys(id);
			p2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void F3(String fn2) {
		f3.sendKeys(fn2);
	}
	public void L3(String ln2) {
		l3.sendKeys(ln2);
	}
	public void M3(String mn2) {
		m3.sendKeys(mn2);
	}
	public void Id2(String id1) {
	id2.sendKeys(id1);

	}
	public void next() {
		con.click();
	}
//	public void Noti() {
//		noti.click();
//	}
	
	public void Seat() {
		try {
			seat.click();
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.moveToElement(s1);
			act.click(s1);
			//s1.click();
			Thread.sleep(3000);
			s2.click();
			Thread.sleep(3000);
			s3.click();
			Thread.sleep(3000);
			s4.click();
			Thread.sleep(3000);
			s5.click();
			Thread.sleep(3000);
			s6.click();
			Thread.sleep(3000);
			s7.click();
			Thread.sleep(3000);
			s8.click();
			Thread.sleep(3000);
			d1.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void Food() {
		try {
			food.click();
			Thread.sleep(3000);
			food1.click();
			Thread.sleep(3000);
			lingam1.click();
			Thread.sleep(3000);
			food2.click();
			Thread.sleep(3000);
			kasi2.click();
			Thread.sleep(3000);
			food3.click();
			Thread.sleep(3000);
			lingam2.click();
			Thread.sleep(3000);
			food4.click();
			Thread.sleep(3000);
			kasi3.click();
			Thread.sleep(3000);
			food5.click();
			Thread.sleep(3000);
			lingam3.click();
			Thread.sleep(3000);
			food6.click();
			Thread.sleep(3000);
			kasi4.click();
			Thread.sleep(3000);
			food7.click();
			Thread.sleep(3000);
			lingam4.click();
			Thread.sleep(3000);
			food8.click();
			Thread.sleep(3000);
			d2.click();
			//Thread.sleep(3000);
			//co1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void nextpage() {
		try {
			noti.click();
			Thread.sleep(3000);
			co1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void cardno(String cnum) {
		card.sendKeys(cnum);
	}
	public void Cardname(String cname) {
		cardname.sendKeys(cname);
	}
	public void Mon(String mon) {
		month.sendKeys(mon);
	}
	public void Year(String y) {
		year.sendKeys(y);
	}
	public void Cvv(String s) {
		try {
			cvv.sendKeys(s);
			Thread.sleep(3000);
			proceed.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
