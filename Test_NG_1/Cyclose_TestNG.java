package Test_NG_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cyclose_TestNG {
	
	WebDriver dr;
	@BeforeClass
	public void first() {
		dr=new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();

		
	}
	
	@BeforeMethod
	public void setup () {
		
		
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		dr.findElement(By.xpath("//span[text()='Submit']")).click();
		dr.findElement(By.xpath("//div[text()=' Pay user ']")).click();
		
	}
	@Test
	public void abc() {
		
		
		dr.findElement(By.xpath("//div[text()='Payment to system']")).click();
		dr.findElement(By.xpath("//div[text()='Receive QR-code']")).click();
		dr.findElement(By.xpath("//div[text()='Receive payment']")).click();
		dr.findElement(By.xpath("//div[text()='Scheduled payments']")).click();
		
	}
	
	@AfterMethod
	public void bcd() {
	dr.findElement(By.xpath("//div[text()='Payment requests']")).click();
	dr.findElement(By.xpath("//div[text()='External payments']")).click();
	dr.findElement(By.xpath("//div[text()='Tickets']")).click();
		
		
	}
	@AfterClass
	public void mm() throws InterruptedException {
		Thread.sleep(5000);
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@id='logout-trigger']")).click();
		
		
	}
	@AfterTest
	public void ss() {
		dr.quit(); 
	}
	
	
		
		
		
	}
		

	


