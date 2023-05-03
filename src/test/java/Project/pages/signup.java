package Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Project.utils.BaseClass;

public class signup extends BaseClass {
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement sign;
	//@FindBy(xpath="//select[@class='form-control form-select ']")
	//WebElement title;
	@FindBy(xpath="(//input[@class='form-control '])[1]")
	WebElement first;
	@FindBy(xpath="(//input[@class='form-control '])[2]")
	WebElement last;
	@FindBy(xpath="//input[@class='form-control datepicker false']")
	WebElement date;
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobile;
	@FindBy(xpath="(//input[@class='form-control '])[3]")
	WebElement mail;
	@FindBy(xpath="(//input[@class='form-control '])[4]")
	WebElement newpass;
	@FindBy(xpath="(//input[@class='form-control '])[5]")
	WebElement cpass;
	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	WebElement box;
	//@FindBy(xpath="//button[text()='Submit']")
	//WebElement submit;
	
	
	public void Sign() {
		try {
			sign.click();
			//Thread.sleep(5000);
			//title.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public void selectDDByVisibleText( String VisibleText) {
		try {
			title.click();
			Select sel = new Select(title);
			sel.selectByVisibleText(VisibleText);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} */
	public void firstname(String fname) {
		first.sendKeys(fname);
	}
	public void lastname(String lname) {
		last.sendKeys(lname);
	}
	public void Date(String dob) {
		date.sendKeys(dob);
	}
	public void Mobile(String no) {
		mobile.sendKeys(no);
	}
	public void Mail(String mailid) {
		mail.sendKeys(mailid);
	}
	public void Newpass(String Npass) {
		newpass.sendKeys(Npass);
	}
	public void Cpass(String conpass) {
		cpass.sendKeys(conpass);
	}
	public void Box() {
		box.click();
	}
	/*
	public void Submit() {
		submit.click();
	}
	*/
	
	

}
