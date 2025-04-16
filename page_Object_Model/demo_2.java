package page_Object_Model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basics.login;

public class demo_2 {
	WebDriver dr;
	@Test
	public void mm() {
		dr=new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		demo_1 dd= new demo_1(dr);
		dd.entr_usrname();
		dd.Enter_pass();
		dd.button();
		

		
		
		
		
		
		
	}

}
