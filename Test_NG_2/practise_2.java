package Test_NG_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class practise_2 {
	 
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	public void getuser(String str) {
		username.sendKeys(str);
	}
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password ;
	public void  getpass(String stri) {
		password.sendKeys(stri);
	}
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement clickable;
	public void click() {
		clickable.click();
	}
	
	practise_2 (WebDriver dj) {
		PageFactory.initElements(dj, this);
		
	}
	
	
	


}