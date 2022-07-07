package inetbanking9.com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdiver) {
		ldriver = rdiver;
		PageFactory.initElements(rdiver, this);
		}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement passwords;
	
	@FindBy(name = "btnLogin")
	WebElement submit;
	
	public void userid(String user) {
		username.sendKeys(user);
	}
	
	public void securepassword(String pwds) {
		passwords.sendKeys(pwds);
	}
	
	public void button() {
		submit.click();
	}
}
