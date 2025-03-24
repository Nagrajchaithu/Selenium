package Test_NG_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	WebDriver dr;
	@BeforeMethod
	public void am() {
		
		dr= new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		dr.findElement(By.xpath("//span[text()='Submit']")).click();
		
		
				
	}
	
	@Test(priority=1)
	
	public void verify() {
		
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()=' Pay user ']")).isEnabled());
		Assert.assertFalse(dr.findElement(By.xpath("//div[text()=' My vouchers ']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()=' Directory ']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()=' Contacts ']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()=' Place ad ']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()=' Switch theme ']")).isEnabled());
		
	}
	
	
	@Test(priority=2)
	public void amm() {
		
		
		
		SoftAssert as = new SoftAssert();
		
		dr.findElement(By.xpath("//div[text()='Banking']")).click();
		as.assertFalse(dr.findElement(By.xpath("//div[text()='Member account']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='Receive QR-code']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='Payment to user']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='Payment to system']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='Payment requests']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='External payments']")).isEnabled());
		as.assertTrue(dr.findElement(By.xpath("//div[text()='Tickets']")).isEnabled());
		
		 as.assertAll();
		
	}
	
	
	@Test(priority=3)
	public void dd() {
		
		
		dr.findElement(By.xpath("//div[text()='Marketplace']")).click();
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Business directory']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Advertisements']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Shopping cart']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='My purchases']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Advertisement interests']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='My vouchers']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Unanswered questions']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Invite users']")).isEnabled());
		
		
	}
	
	@Test(priority=4)
	
	
	public void ff() throws InterruptedException {
		Thread.sleep(5000);
		dr.findElement(By.xpath("//div[text()='Information']")).click();
		SoftAssert mm= new SoftAssert();
		mm.assertTrue(dr.findElement(By.xpath("//div[text()='About Cyclos']")).isEnabled());
	    mm.assertTrue(dr.findElement(By.xpath("//div[text()='Contact form']")).isEnabled());
	    mm.assertTrue(dr.findElement(By.xpath("//div[text()='Google calendar']")).isDisplayed());
	    mm.assertTrue(dr.findElement(By.xpath("//div[text()='Help']")).isDisplayed());
	    
		mm.assertAll();
		
		
	}
	@Test (priority=5)
	
	public void aa() {
		
		dr.findElement(By.xpath("//div[text()='  Demo user ']")).click();
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='My profile']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Settings']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Contacts']")).isDisplayed());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Passwords']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Documents']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='QR / bar codes']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Messages']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='Notifications']")).isEnabled());
		Assert.assertTrue(dr.findElement(By.xpath("//div[text()='References']")).isEnabled());
		
		
		
	}
	@AfterMethod 
	public void ss() {
		dr.close();
	}
	
	
		
	}
	
	
	
	
	
	

