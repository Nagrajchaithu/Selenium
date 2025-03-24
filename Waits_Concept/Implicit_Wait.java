package Waits_Concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("Nagaraju");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.xpath("//input[@id='pass']")).sendKeys("nagrai.chaithu");
		dr.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		
		

	}

}
