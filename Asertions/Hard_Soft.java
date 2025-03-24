package Asertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hard_Soft {
	
	WebDriver dr;
	@BeforeMethod
	public void mm() {
		dr= new ChromeDriver();
		dr.get("https://demo.cyclos.org/ui/home");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		dr.findElement(By.xpath("//div[text()=' Login ']")).click();
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demo");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		dr.findElement(By.xpath("//span[text()='Submit']")).click();
		
				
		
	}
	
	

}
