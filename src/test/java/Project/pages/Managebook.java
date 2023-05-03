package Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Project.utils.BaseClass;

public class Managebook extends BaseClass{
	
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement manage;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement pnr;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement mail;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement search;
	
	public void Manage(String pnrno ,String mailid) {
		manage.click();
		pnr.sendKeys(pnrno);
		mail.sendKeys(mailid);
		search.click();	
	}

}
