package page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo_1 {
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	
	public void entr_usrname() {
		username.sendKeys("demo");
		
	}
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	public void Enter_pass() {
		password.sendKeys("1234");
	}
	@FindBy(xpath="//span[text()='Submit']")
	WebElement logginbutton;
	public void button() {
		logginbutton.click();
	
	}
	public  demo_1 (WebDriver  kk) {
		PageFactory.initElements(kk,this);
		
		
		
	}
	 

}
