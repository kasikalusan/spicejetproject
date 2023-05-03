package Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Project.utils.BaseClass;

public class Otherfunction extends BaseClass{
	
	@FindBy(xpath="//div[text()='check-in']")
	WebElement checkin;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement pnr;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement mail;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement search;
	
	@FindBy(xpath="//div[text()='flight status']")
	WebElement status;
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement date;
	@FindBy(xpath="//div[text()='Tomorrow']")
	WebElement date1;
	
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	@FindBy(xpath="//div[text()='MAA']")
	WebElement chennai;
	@FindBy(xpath="//div[text()='DEL']")
	WebElement delhi;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement search1;
	
	
	public void Checkin(String pnrno ,String mailid) {
		checkin.click();
		pnr.sendKeys(pnrno);
		mail.sendKeys(mailid);
		search.click();	
		
	}
	public void Status() {
		status.click();
		date.click();
		date1.click();
		from.click();
		chennai.click();
		delhi.click();
		search1.click();
	}

}
