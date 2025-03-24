package Test_NG_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic_loginpage  {
	@Test
	public void loginpage() {
		 WebDriver dr =new ChromeDriver();
		 dr.get("https://demo.cyclos.org/ui/home");
		 dr.manage().window().maximize();
		 dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		 Basic_login_test  bb= new Basic_login_test(dr) ;
		bb.getusername("demo");
		bb.getpassword("1234");
		bb.getbuttonclick();
		bb.clickable();
		Assert.assertTrue(true);
		bb.paymenttosystem();
		Assert.assertTrue(true);
		bb.QRcode();
		Assert.assertTrue(true);
		bb.receivepayment();
		Assert.assertTrue(true);
		bb.Sheduledpayment();
		Assert.assertTrue(true);
		 
		 
		 
		 
	

 
  
  
	}
  
  
  
   
  
  
 
   
  
  
 
   
 
	
	
	

	
	

	
	
}
