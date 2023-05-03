package Project.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Project.utils.BaseClass;

public class login extends BaseClass{
	
	
@FindBy(xpath="//div[text()='Login']")
WebElement log;
@FindBy(xpath="(//input[@type='number'])[1]")
WebElement mobile;
@FindBy(xpath="//input[@type='password']")
WebElement pass;
@FindBy(xpath="//div[@data-testid='login-cta']")
WebElement login;


public void Log() {
	log.click();
}
public void Mobile(String no) {
	mobile.sendKeys(no);
}
public void Pass(String password) {
	pass.sendKeys(password);
}
public void Login() {
	login.click();
}


}
