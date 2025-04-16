package Test_NG_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basic_login_test {
	
	@FindBy(xpath =" //input[@type='text']")
	WebElement username;
	
	public void getusername(String str) {
	username.sendKeys(str);
		
		
	}

	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	public void getpassword(String str) {
		password.sendKeys(str);
		
	}
	@FindBy(xpath="//span[text()='Submit']")
	WebElement buttonclick;
	public void  getbuttonclick() {
		buttonclick.click();
		}
	
	@FindBy(xpath="//div[text()=' Pay user ']")
	WebElement payuser;
	public void clickable() {
		
		payuser.click();
		
	}
	@FindBy(xpath="//div[text()='Payment to system']")
	WebElement pay;
	
	public void paymenttosystem() {
		pay.click();
	}
	@FindBy(xpath="//div[text()='Receive QR-code']")
	WebElement mm;
	
	public void QRcode() {
		mm.click();
	
	}
	
	@FindBy(xpath="//div[text()='Receive payment']")
		WebElement nn;
	
	public void receivepayment() {
		nn.click();
	
	}	
	
	@FindBy(xpath="//div[text()='Scheduled payments']")
	WebElement aa;
	public void Sheduledpayment() {
		aa.click();
	}
	
	 public  Basic_login_test (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
}
